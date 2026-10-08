package com.scalekit.exceptions;

import com.scalekit.models.proxy.ProxyResponse;

import java.util.Map;
import java.util.Optional;

/**
 * Thrown when a proxied request ({@link com.scalekit.api.ActionsClient#request}) gets an HTTP
 * status of 400 or above, whether from Scalekit's proxy or from the upstream API. The full
 * response is available from {@link #response()}.
 *
 * <p>When Scalekit's proxy itself rejects the request, its JSON body {@code {"detail", "code"}}
 * is parsed into {@link #proxyErrorDetail()} and {@link #proxyErrorCode()}, for example
 * {@code TOOL_PROXY_DISABLED} or {@code NOT_FOUND}; {@code getScalekitErrorCode()} returns the
 * same code. {@code getGrpcStatusCode()} maps the HTTP status to the closest gRPC code
 * (400&rarr;3, 401&rarr;16, 403&rarr;7, 404&rarr;5, 409&rarr;6, 429&rarr;8, 500&rarr;13,
 * 501&rarr;12, 503&rarr;14, 504&rarr;4, anything else&rarr;2).
 *
 * <pre>{@code
 * try {
 *     ProxyResponse response = client.actions().request(request);
 * } catch (ProxyException e) {
 *     if (e.statusCode() == 404) { ... }
 *     log.warn("proxy failed: {} {}", e.statusCode(), e.response().bodyAsString());
 * }
 * }</pre>
 *
 * @since 2.6.0
 */
public class ProxyException extends APIException {

    private static final long serialVersionUID = 1L;

    private static final int MAX_DETAIL_LENGTH = 300;

    private final int statusCode;
    private final transient ProxyResponse response;
    private final String proxyErrorCode;
    private final String proxyErrorDetail;

    /**
     * Creates the exception for a response with an error status.
     *
     * @param response the response
     * @throws IllegalArgumentException if {@code response} is null
     */
    public ProxyException(ProxyResponse response) {
        this(requireResponse(response), parseError(response));
    }

    /**
     * Creates the exception for a response with an error status, with a message that names the
     * failed operation and adds context. For subclasses.
     *
     * @param response  the response
     * @param operation what failed, for example {@code "resumable upload"}; the message starts
     *                  with {@code "<operation> failed with HTTP <status>"}
     * @param context   text appended to the message, or null
     * @throws IllegalArgumentException if {@code response} is null
     * @since 2.6.0
     */
    protected ProxyException(ProxyResponse response, String operation, String context) {
        this(requireResponse(response), parseError(response), operation, context);
    }

    private ProxyException(ProxyResponse response, String[] error) {
        this(response, error, "proxy request", null);
    }

    private ProxyException(ProxyResponse response, String[] error, String operation, String context) {
        super(error[0], messageFor(operation, response.statusCode(), error[0], error[1])
                + (context == null ? "" : context), grpcCodeFor(response.statusCode()), null);
        this.statusCode = response.statusCode();
        this.response = response;
        this.proxyErrorCode = error[0];
        this.proxyErrorDetail = error[1];
    }

    /**
     * Returns the HTTP status code.
     *
     * @return the status code
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Returns the full response: status, headers and body.
     *
     * @return the response
     */
    public ProxyResponse response() {
        return response;
    }

    /**
     * Returns the {@code code} of a Scalekit proxy error body.
     *
     * @return the code, or empty when the body is not a proxy error
     */
    public Optional<String> proxyErrorCode() {
        return Optional.ofNullable(proxyErrorCode);
    }

    /**
     * Returns the {@code detail} of a Scalekit proxy error body.
     *
     * @return the detail, or empty when the body is not a proxy error
     */
    public Optional<String> proxyErrorDetail() {
        return Optional.ofNullable(proxyErrorDetail);
    }

    private static ProxyResponse requireResponse(ProxyResponse response) {
        if (response == null) {
            throw new IllegalArgumentException("response is required");
        }
        return response;
    }

    private static String[] parseError(ProxyResponse response) {
        String code = null;
        String detail = null;
        try {
            Map<String, Object> body = response.bodyAsJsonObject();
            Object codeValue = body.get("code");
            Object detailValue = body.get("detail");
            code = codeValue instanceof String && !((String) codeValue).isEmpty() ? (String) codeValue : null;
            detail = detailValue instanceof String && !((String) detailValue).isEmpty() ? (String) detailValue : null;
        } catch (IllegalStateException notJsonObject) {
            // Plain-text or empty bodies (for example a 502 from the proxy) carry no code.
        }
        return new String[]{code, detail};
    }

    private static String messageFor(String operation, int status, String code, String detail) {
        StringBuilder message = new StringBuilder(operation).append(" failed with HTTP ").append(status);
        if (detail != null) {
            String oneLine = detail.replace('\r', ' ').replace('\n', ' ');
            if (oneLine.length() > MAX_DETAIL_LENGTH) {
                oneLine = oneLine.substring(0, MAX_DETAIL_LENGTH) + "...";
            }
            message.append(": ").append(oneLine);
        }
        if (code != null) {
            message.append(" (code: ").append(code).append(')');
        }
        return message.toString();
    }

    static int grpcCodeFor(int httpStatus) {
        switch (httpStatus) {
            case 400:
                return 3;
            case 401:
                return 16;
            case 403:
                return 7;
            case 404:
                return 5;
            case 409:
                return 6;
            case 429:
                return 8;
            case 500:
                return 13;
            case 501:
                return 12;
            case 503:
                return 14;
            case 504:
                return 4;
            default:
                return 2;
        }
    }
}
