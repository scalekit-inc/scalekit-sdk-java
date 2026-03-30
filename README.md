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

### Agent-First Features

- **Agent Identity** — Agents as first-class actors with human ownership and org context
- **MCP-Native OAuth 2.1** — Purpose-built for Model Context Protocol with DCR/PKCE support
- **Ephemeral Credentials** — Time-bound, task-based authorization (minutes, not days)
- **Token Vault** — Per-user, per-tool token storage with rotation and progressive consent
- **Human-in-the-Loop** — Step-up authentication when risk crosses thresholds
- **Immutable Audit** — Track which user initiated, which agent acted, what resource was accessed

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
implementation "com.scalekit:scalekit-sdk-java:2.0.10"
```

**Maven:**

```xml
<dependency>
    <groupId>com.scalekit</groupId>
    <artifactId>scalekit-sdk-java</artifactId>
    <version>2.0.10</version>
</dependency>
```

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
