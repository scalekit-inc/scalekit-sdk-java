<p align="left">
  <a href="https://scalekit.com" target="_blank" rel="noopener noreferrer">
    <picture>
      <img src="https://cdn.scalekit.cloud/v1/scalekit-logo-dark.svg" height="64">
    </picture>
  </a>
  <br/>
</p>

# Official Java SDK

[![Maven Central](https://img.shields.io/maven-central/v/com.scalekit/scalekit-sdk-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.scalekit%22%20AND%20a:%22scalekit-sdk-java%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Javadoc](https://javadoc.io/badge2/com.scalekit/scalekit-sdk-java/javadoc.svg)](https://javadoc.io/doc/com.scalekit/scalekit-sdk-java)

<a href="https://scalekit.com" target="_blank" rel="noopener noreferrer">Scalekit</a> is the **auth stack for AI apps** - from human authentication to agent authorization. Build secure AI products faster with authentication for humans (SSO, passwordless, full-stack auth) and agents (MCP/APIs, delegated actions), all unified on one platform. This Java SDK enables both traditional B2B authentication and cutting-edge agentic workflows.

## 🤖 Agent-First Features

- **🔐 Agent Identity**: Agents as first-class actors with human ownership and org context
- **🎯 MCP-Native OAuth 2.1**: Purpose-built for Model Context Protocol with DCR/PKCE support
- **⏰ Ephemeral Credentials**: Time-bound, task-based authorization (minutes, not days)
- **🔒 Token Vault**: Per-user, per-tool token storage with rotation and progressive consent
- **👥 Human-in-the-Loop**: Step-up authentication when risk crosses thresholds
- **📊 Immutable Audit**: Track which user initiated, which agent acted, what resource was accessed

## 👨‍💼 Human Authentication

- **🔐 Enterprise SSO**: Support for SAML and OIDC protocols
- **👥 SCIM Provisioning**: Automated user provisioning and deprovisioning  
- **🚀 Passwordless Authentication**: Magic links, OTP, and modern auth flows
- **🏢 Multi-tenant Architecture**: Organization-level authentication policies
- **📱 Social Logins**: Support for popular social identity providers
- **🛡️ Full-Stack Auth**: Complete IdP-of-record solution for B2B SaaS

<div>
📚 <a target="_blank" href="https://docs.scalekit.com">Documentation</a> • 🚀 <a target="_blank" href="https://docs.scalekit.com/sso/quickstart/">SSO Quickstart</a> • 💻 <a target="_blank" href="https://docs.scalekit.com/apis">API Reference</a>
</div>
<hr />

## Pre-requisites

1. [Sign up](https://scalekit.com) for a Scalekit account.
2. Get your ```env_url```, ```client_id``` and ```client_secret``` from the Scalekit dashboard.

## Installation

### Requirements
- Java 1.8 or later

### Gradle users

Add this dependency to your project's build file:

```gradle
implementation "com.scalekit:scalekit-sdk-java:2.0.2"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.scalekit</groupId>
    <artifactId>scalekit-sdk-java</artifactId>
    <version>2.0.2</version>
</dependency>
```

## Usage

Initialize the Scalekit client using the appropriate credentials. Refer code sample below.
```java
import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganization;

public class ScalekitExample {

    public static void main(String[] args) {
        client = new ScalekitClient("env_url",
                "client_id",
                "client_secret");
        }
}
```

##### Minimum Requirements

The Scalekit Java SDK is designed to operate with the following environment:

| Component | Version |
| --------- | ------- |
| Java      | 8+      |

> **Tip:** While our Java SDK requires Java 8 as the baseline, we suggest upgrading to more recent LTS versions such as Java 11 or Java 17. These updates deliver performance improvements and enhanced security.

## Examples - SSO with Spring Boot

Below is a simple code sample that showcases how to implement Single Sign-on using Scalekit SDK

```java
@RestController
public class AuthController {
    ScalekitClient scalekitClient = client = new ScalekitClient("env_url", "client_id", "client_secret");

    @Value("${auth.redirect.url}")
    private String redirectUrl;

    @PostMapping( path = "auth/login")
    public RedirectView loginHandler() {
        AuthorizationUrlOptions options = new AuthorizationUrlOptions();
        String url = scalekitClient.authentication().
                getAuthorizationUrl(redirectUrl, options)
                .toString();
        return new RedirectView(url);
    }

    @GetMapping("auth/callback")
    public String callbackHandler(@RequestParam String code, HttpServletResponse response){
        
        AuthenticationResponse authResponse = scalekitClient.authentication()
                .authenticateWithCode(code, redirectUrl, new AuthenticationOptions());
        Cookie cookie = new Cookie("access_token", authResponse.getAccessToken());
        response.addCookie(cookie);
        return authResponse.getIdToken();
    }
}
```

## 📱 Example Apps

Explore fully functional sample applications built with popular Java frameworks and the Scalekit SDK:

| Framework | Repository | Description |
|-----------|------------|-------------|
| **Spring Boot** | [scalekit-springboot-example](https://github.com/scalekit-developers/scalekit-springboot-example) | Complete Spring Boot integration |

## 🔗 Helpful Links

### 📖 Quickstart Guides
- [**SSO Integration**](https://docs.scalekit.com/sso/quickstart/) - Implement enterprise Single Sign-on
- [**Full Stack Auth**](https://docs.scalekit.com/fsa/quickstart/) - Complete authentication solution
- [**Passwordless Auth**](https://docs.scalekit.com/passwordless/quickstart/) - Modern authentication flows
- [**Social Logins**](https://docs.scalekit.com/social-logins/quickstart/) - Popular social identity providers
- [**Machine-to-Machine**](https://docs.scalekit.com/m2m/quickstart/) - API authentication

### 📚 Documentation & Reference
- [**API Reference**](https://docs.scalekit.com/apis) - Complete API documentation
- [**Developer Kit**](https://docs.scalekit.com/dev-kit/) - Tools and utilities
- [**API Authentication Guide**](https://docs.scalekit.com/guides/authenticate-scalekit-api/) - Secure API access

### 🛠️ Additional Resources
- [**Setup Guide**](https://docs.scalekit.com/guides/setup-scalekit/) - Initial platform configuration
- [**Code Examples**](https://docs.scalekit.com/directory/code-examples/) - Ready-to-use code snippets
- [**Admin Portal Guide**](https://docs.scalekit.com/directory/guides/admin-portal/) - Administrative interface
- [**Launch Checklist**](https://docs.scalekit.com/directory/guides/launch-checklist/) - Pre-production checklist

## License
This project is licensed under the **MIT license**.
