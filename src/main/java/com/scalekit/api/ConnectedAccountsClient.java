package com.scalekit.api;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.PermissionDeniedException;
import com.scalekit.models.Page;
import com.scalekit.models.connectedaccounts.AuthorizationLink;
import com.scalekit.models.connectedaccounts.AuthorizationLinkParams;
import com.scalekit.models.connectedaccounts.ConnectedAccount;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.connectedaccounts.CreateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.ListConnectedAccountsParams;
import com.scalekit.models.connectedaccounts.UpdateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.UserVerificationResult;

/**
 * Manages connected accounts: a user's or tenant's account on a third-party service, whose
 * credentials Scalekit stores and refreshes. Get it from
 * {@link com.scalekit.ScalekitClient#connectedAccounts()}.
 *
 * <pre>{@code
 * ConnectedAccount account = client.connectedAccounts().getOrCreate("gmail", "user_123");
 * if (account.status().known() != ConnectedAccountStatus.Known.ACTIVE) {
 *     AuthorizationLink link = client.connectedAccounts().getMagicLink(ConnectedAccountRef.byId(account.id()));
 *     // send the user to link.link()
 * }
 * }</pre>
 *
 * <p>Connection names, identifiers and account IDs are trimmed before they are checked and sent.
 * {@link NotFoundException} means the connection does not exist or no account matches a
 * connection name and identifier. An account ID ({@link ConnectedAccountRef#byId}) that does not
 * exist is reported by the server as an internal error, so it surfaces as
 * {@link com.scalekit.exceptions.InternalServerException}, not {@code NotFoundException}.
 * Calls use the client's default deadline. Implementations are thread-safe. This interface is not
 * designed for implementation outside the SDK: mock it in tests, but do not implement it, because
 * methods may be added.
 *
 * @since 2.6.0
 */
public interface ConnectedAccountsClient {

    /**
     * Lists the first page of connected accounts.
     *
     * @return the first page; iterate {@link Page#autoPager()} for every account
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<ConnectedAccount> list();

    /**
     * Lists one page of connected accounts that match the filters. Items never include
     * credentials or API configuration.
     *
     * @param params filters and paging; null lists all accounts
     * @return the page
     * @throws NotFoundException if a connection name is unknown
     * @throws BadRequestException if the filters are invalid
     * @throws APIException for other failures
     * @since 2.6.0
     */
    Page<ConnectedAccount> list(ListConnectedAccountsParams params);

    /**
     * Gets a connected account, including its credentials when your environment returns them.
     * An expired token is refreshed first; if that fails, the account comes back with status
     * {@code EXPIRED} rather than an error.
     *
     * @param account the account to get
     * @return the account
     * @throws IllegalArgumentException if {@code account} is null
     * @throws NotFoundException if the connection does not exist, or no account matches the
     *                           connection name and identifier
     * @throws com.scalekit.exceptions.InternalServerException if the account ID does not exist (the
     *                           server reports it as an internal error)
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ConnectedAccount get(ConnectedAccountRef account);

    /**
     * Creates a connected account with no credentials, which the user then authorizes through
     * {@link #getMagicLink(ConnectedAccountRef)}. Never retried on transient failures.
     *
     * @param connectionName the connection, for example {@code "gmail"}
     * @param identifier     your identifier for the account's owner
     * @return the new account
     * @throws IllegalArgumentException if either value is null or blank
     * @throws BadRequestException if the account already exists ({@code RESOURCE_ALREADY_EXISTS})
     * @throws NotFoundException if the connection does not exist
     * @throws PermissionDeniedException if the connection is disabled or not an app connection
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ConnectedAccount create(String connectionName, String identifier);

    /**
     * Creates a connected account with credentials or API configuration. Never retried on
     * transient failures.
     *
     * <pre>{@code
     * ConnectedAccount account = client.connectedAccounts().create("freshdesk", "user_123",
     *         CreateConnectedAccountParams.builder()
     *                 .authorizationDetails(AuthorizationDetails.staticAuth(credentials))
     *                 .build());
     * }</pre>
     *
     * @param connectionName the connection, for example {@code "gmail"}
     * @param identifier     your identifier for the account's owner
     * @param params         credentials and API configuration; null creates an account without them
     * @return the new account
     * @throws IllegalArgumentException if {@code connectionName} or {@code identifier} is null or blank
     * @throws BadRequestException if the account already exists ({@code RESOURCE_ALREADY_EXISTS})
     *                             or the input is invalid
     * @throws NotFoundException if the connection does not exist
     * @throws PermissionDeniedException if the connection is disabled or not an app connection
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ConnectedAccount create(String connectionName, String identifier, CreateConnectedAccountParams params);

    /**
     * Replaces a connected account's credentials and merges API configuration into the stored
     * configuration.
     *
     * @param account the account to update
     * @param params  the new credentials and configuration
     * @return the updated account
     * @throws IllegalArgumentException if {@code account} or {@code params} is null
     * @throws NotFoundException if the connection does not exist, or no account matches the
     *                           connection name and identifier; an unknown account ID is not
     *                           reported this way (see the class description)
     * @throws BadRequestException if the input is invalid
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ConnectedAccount update(ConnectedAccountRef account, UpdateConnectedAccountParams params);

    /**
     * Deletes a connected account. Deleting an account that does not exist fails, including when
     * a retry follows a first attempt that succeeded: with {@link NotFoundException} when it is
     * selected by connection name and identifier.
     *
     * @param account the account to delete
     * @throws IllegalArgumentException if {@code account} is null
     * @throws NotFoundException if the connection does not exist, or no account matches the
     *                           connection name and identifier; an unknown account ID is not
     *                           reported this way (see the class description)
     * @throws BadRequestException if an MCP server still uses the account
     *                             ({@code MCP_SERVER_EXISTS_FOR_CONNECTED_ACCOUNT})
     * @throws APIException for other failures
     * @since 2.6.0
     */
    void delete(ConnectedAccountRef account);

    /**
     * Returns the account {@code identifier} holds on a connection, creating it without
     * credentials when it does not exist.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @return the existing or new account
     * @throws IllegalArgumentException if either value is null or blank
     * @throws APIException if a request fails; see {@link #getOrCreate(String, String, CreateConnectedAccountParams)}
     * @since 2.6.0
     */
    ConnectedAccount getOrCreate(String connectionName, String identifier);

    /**
     * Returns the account {@code identifier} holds on a connection, creating it when it does not
     * exist. When it exists and {@code params} has credentials, the account is updated with them
     * (and with the API configuration), whatever its status. When it does not exist, it is created
     * with the given credentials, or with an empty OAuth token for the user to authorize.
     *
     * <p>Two concurrent calls can race: the slower create fails with
     * {@link BadRequestException} ({@code RESOURCE_ALREADY_EXISTS}).
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @param params         credentials and API configuration; null for none
     * @return the existing, updated or new account
     * @throws IllegalArgumentException if {@code connectionName} or {@code identifier} is null or blank
     * @throws NotFoundException if the connection does not exist
     * @throws PermissionDeniedException if the connection is disabled or not an app connection
     * @throws BadRequestException if the input is invalid, or a concurrent call created the account
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ConnectedAccount getOrCreate(String connectionName, String identifier, CreateConnectedAccountParams params);

    /**
     * Same as {@link #getOrCreate(String, String)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @return the existing or new account
     * @throws IllegalArgumentException if either value is null or blank
     * @throws APIException if a request fails
     * @since 2.6.0
     */
    ConnectedAccount upsert(String connectionName, String identifier);

    /**
     * Same as {@link #getOrCreate(String, String, CreateConnectedAccountParams)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @param params         credentials and API configuration; null for none
     * @return the existing, updated or new account
     * @throws IllegalArgumentException if {@code connectionName} or {@code identifier} is null or blank
     * @throws APIException if a request fails
     * @since 2.6.0
     */
    ConnectedAccount upsert(String connectionName, String identifier, CreateConnectedAccountParams params);

    /**
     * Returns a link that sends the user to authorize an account. When the account does not exist
     * yet, the server creates it.
     *
     * @param account the account to authorize
     * @return the link
     * @throws IllegalArgumentException if {@code account} is null
     * @throws APIException if the request fails; see
     *                      {@link #getMagicLink(ConnectedAccountRef, AuthorizationLinkParams)}
     * @since 2.6.0
     */
    AuthorizationLink getMagicLink(ConnectedAccountRef account);

    /**
     * Returns a link that sends the user to authorize an account, with a state value and a user
     * verification URL. When the account does not exist yet, the server creates it.
     *
     * <pre>{@code
     * AuthorizationLink link = client.connectedAccounts().getMagicLink(
     *         ConnectedAccountRef.of("gmail", "user_123"),
     *         AuthorizationLinkParams.builder().state(csrfToken).build());
     * }</pre>
     *
     * @param account the account to authorize
     * @param params  state and verification URL; null for none
     * @return the link
     * @throws IllegalArgumentException if {@code account} is null
     * @throws NotFoundException if the connection does not exist
     * @throws BadRequestException if the input is invalid, for example a missing verification URL
     *                             when your environment requires one
     * @throws APIException for other failures
     * @since 2.6.0
     */
    AuthorizationLink getMagicLink(ConnectedAccountRef account, AuthorizationLinkParams params);

    /**
     * Confirms that the user who authorized an account is the owner your app expects, and
     * activates the account. Call it from the page at the link's {@code userVerifyUrl}, with the
     * auth request ID Scalekit passed to that page. Never retried on transient failures.
     *
     * @param authRequestId the auth request ID passed to your verification page; trimmed
     * @param identifier    the identifier of the user signed in to your app; trimmed
     * @return where to send the user next
     * @throws IllegalArgumentException if either value is null or blank
     * @throws PermissionDeniedException if {@code identifier} does not match the account's owner
     * @throws NotFoundException if the auth request or account does not exist
     * @throws BadRequestException if the auth request is invalid or not pending
     * @throws APIException for other failures
     * @since 2.6.0
     */
    UserVerificationResult verifyUser(String authRequestId, String identifier);
}
