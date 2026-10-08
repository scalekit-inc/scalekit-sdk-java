<div align="center">

<a href="https://scalekit.com" target="_blank" rel="noopener noreferrer">
  <picture>
    <img src="./images/scalekit.jpg" alt="Scalekit" height="64">
  </picture>
</a>

<p><strong>Official Java SDK for Scalekit — the auth stack for agents.</strong><br>
Authentication, authorization, and tool-calling for human-in-the-loop and autonomous agent flows.</p>

[![Maven Central](https://img.shields.io/maven-central/v/com.scalekit/scalekit-sdk-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.scalekit%22%20AND%20a:%22scalekit-sdk-java%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Javadoc](https://javadoc.io/badge2/com.scalekit/scalekit-sdk-java/javadoc.svg)](https://javadoc.io/doc/com.scalekit/scalekit-sdk-java)

**[📖 Documentation](https://docs.scalekit.com)** · **[🐛 Report an Issue](https://github.com/scalekit-inc/scalekit-sdk-java/issues)** · **[💬 Join our Slack](https://join.slack.com/t/scalekit-community/shared_invite/zt-3gsxwr4hc-0tvhwT2b_qgVSIZQBQCWRw)**

</div>

---

This is the official Java SDK for [Scalekit](https://scalekit.com) — the auth stack for agents. Build secure AI products faster with authentication for humans (SSO, passwordless, full-stack auth) and agents (MCP/APIs, delegated actions), all unified on one platform.

---

### Agent features (AgentKit)

- **Connected accounts** — Your users' accounts on third-party services; Scalekit stores and refreshes their credentials (`client.connectedAccounts()`)
- **Tool calling** — List tools and run them on behalf of a connected account (`client.tools()`)
- **Tool discovery** — Search tools by relevance and list the tools a user can run (`client.tools().search(...)`, `listScoped(...)`, `listAvailable(...)`)
- **REST proxy** — Call a provider's API with the account's credentials added by Scalekit (`client.actions().request(...)`)
- **MCP configurations** — Serve a set of connections and tools to agents as an MCP server, with per-user session tokens (`client.actions().mcp()`)
- **Providers** — List providers and bring your own connector for services Scalekit does not ship (`client.actions().providers()`)
- **App connections** — List, create, read and update the connections your users' accounts belong to (`client.connections().listAppConnections()` and related methods)

#### Human Authentication

- **Enterprise SSO** — Support for SAML and OIDC protocols
- **SCIM Provisioning** — Automated user provisioning and deprovisioning
- **Passwordless Authentication** — Magic links, OTP, and modern auth flows
- **Multi-tenant Architecture** — Organization-level authentication policies
- **Social Logins** — Support for popular social identity providers
- **Full-Stack Auth** — Complete IdP-of-record solution for B2B SaaS

---

### Getting started

#### Prerequisites

- **Java** ≥ 8
- [Scalekit account](https://scalekit.com) with `env_url`, `client_id`, and `client_secret`

#### Installation

**Gradle:**

```gradle
implementation "com.scalekit:scalekit-sdk-java:2.5.0"
```

**Maven:**

```xml
<dependency>
    <groupId>com.scalekit</groupId>
    <artifactId>scalekit-sdk-java</artifactId>
    <version>2.5.0</version>
</dependency>
```

#### Multiple issuers

`TokenValidationOptions` accepts `issuers` (a `List<String>`) so a token can be accepted from more than one issuer, for example the base issuer and a resource-bound one. The token is valid if its `iss` claim exactly equals **any** accepted issuer. The existing single `issuer(String)` builder method is unchanged and combines with `issuers`:

```java
TokenValidationOptions options = TokenValidationOptions.builder()
    .issuers(Arrays.asList(
        "https://your-env.scalekit.dev",
        "https://your-env.scalekit.dev/resources/res_123"))
    .build();
```

Leaving both unset skips the issuer check; a non-empty `issuers` is always enforced. `validateAccessTokenAndGetClaims(jwt, options)` is new and accepts the same options.

#### Usage

```java
import com.scalekit.ScalekitClient;

ScalekitClient scalekitClient = new ScalekitClient(
    "env_url",
    "client_id",
    "client_secret"
);

// Use scalekitClient to interact with the Scalekit API
```

#### AgentKit quickstart

Connect a user's Gmail account, then let your agent read their mail:

```java
import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.ToolUnauthorizedException;
import com.scalekit.models.connectedaccounts.*;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;

ScalekitClient client = new ScalekitClient(
    System.getenv("SCALEKIT_ENVIRONMENT_URL"),
    System.getenv("SCALEKIT_CLIENT_ID"),
    System.getenv("SCALEKIT_CLIENT_SECRET"));

// 1. Make sure the user has a Gmail account connected; send them the link if not.
ConnectedAccount account = client.connectedAccounts().getOrCreate("gmail", "user_123");
if (account.status().known() != ConnectedAccountStatus.Known.ACTIVE) {
    AuthorizationLink link = client.connectedAccounts().getMagicLink(ConnectedAccountRef.byId(account.id()));
    System.out.println("Authorize at: " + link.link());
}

// 2. Run a tool as that user.
try {
    ExecuteToolResult result = client.tools().execute("gmail_fetch_mails",
        ExecuteToolParams.builder()
            .connectionName("gmail")
            .identifier("user_123")
            .putToolInput("max_results", 5)
            .build());
    System.out.println(result.data());
} catch (ToolUnauthorizedException e) {
    // The user must authorize the account again.
}

// 3. Or call the provider's API directly; Scalekit adds the credentials.
String profile = client.actions().request(
    ProxyRequest.builder("gmail", "user_123", "/gmail/v1/users/me/profile").build()).bodyAsString();
```

See [REFERENCE.md](REFERENCE.md#tools) for every AgentKit method, its errors and its retry behaviour.

---

### Example — SSO with Spring Boot

```java
@RestController
public class AuthController {
    ScalekitClient scalekitClient = new ScalekitClient("env_url", "client_id", "client_secret");

    @Value("${auth.redirect.url}")
    private String redirectUrl;

    @PostMapping(path = "auth/login")
    public RedirectView loginHandler() {
        AuthorizationUrlOptions options = new AuthorizationUrlOptions();
        String url = scalekitClient.authentication()
                .getAuthorizationUrl(redirectUrl, options)
                .toString();
        return new RedirectView(url);
    }

    @GetMapping("auth/callback")
    public String callbackHandler(@RequestParam String code, HttpServletResponse response) {
        AuthenticationResponse authResponse = scalekitClient.authentication()
                .authenticateWithCode(code, redirectUrl, new AuthenticationOptions());
        Cookie cookie = new Cookie("access_token", authResponse.getAccessToken());
        response.addCookie(cookie);
        return authResponse.getIdToken();
    }
}
```

---

### Example Apps

| Framework | Repository | Description |
|-----------|------------|-------------|
| **Spring Boot** | [scalekit-springboot-example](https://github.com/scalekit-developers/scalekit-springboot-example) | Complete Spring Boot integration |

---

### Helpful Links

#### Quickstart Guides

- [SSO Integration](https://docs.scalekit.com/sso/quickstart/) — Implement enterprise Single Sign-on
- [Full Stack Auth](https://docs.scalekit.com/fsa/quickstart/) — Complete authentication solution
- [Passwordless Auth](https://docs.scalekit.com/passwordless/quickstart/) — Modern authentication flows
- [Social Logins](https://docs.scalekit.com/social-logins/quickstart/) — Popular social identity providers
- [Machine-to-Machine](https://docs.scalekit.com/m2m/quickstart/) — API authentication
- [Agent Auth](https://docs.scalekit.com/agent-auth/quickstart/) — Authentication for AI agents

#### Documentation & Reference

- [API Reference](https://docs.scalekit.com/apis) — Complete API documentation
- [Developer Kit](https://docs.scalekit.com/dev-kit/) — Tools and utilities
- [API Authentication Guide](https://docs.scalekit.com/guides/authenticate-scalekit-api/) — Secure API access

#### Additional Resources

- [Setup Guide](https://docs.scalekit.com/guides/setup-scalekit/) — Initial platform configuration
- [Code Examples](https://docs.scalekit.com/directory/code-examples/) — Ready-to-use code snippets
- [Admin Portal Guide](https://docs.scalekit.com/directory/guides/admin-portal/) — Administrative interface
- [Launch Checklist](https://docs.scalekit.com/directory/guides/launch-checklist/) — Pre-production checklist

---

### Contributing

Contributions are welcome! Coming soon: contribution guidelines.

For now:
1. Fork this repository
2. Create a branch — `git checkout -b fix/my-improvement`
3. Make your changes
4. Run tests
5. Open a Pull Request

---

### License

This project is licensed under the **MIT license**. See the [LICENSE](LICENSE) file for more information.
