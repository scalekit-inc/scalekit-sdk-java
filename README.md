<p align="left">
  <a href="https://scalekit.com" target="_blank" rel="noopener noreferrer">
    <picture>
      <img src="https://cdn.scalekit.cloud/v1/scalekit-logo-dark.svg" height="64">
    </picture>
  </a>
  <br/>
</p>

# Official Java SDK
<a href="https://scalekit.com" target="_blank" rel="noopener noreferrer">Scalekit</a> is an Enterprise Authentication Platform purpose built for B2B applications. This Node.js SDK helps implement Enterprise Capabilities like Single Sign-on via SAML or OIDC in your Node.js applications within a few hours.

<div>
📚 <a target="_blank" href="https://docs.scalekit.com">Documentation</a> - 🚀 <a target="_blank" href="https://docs.scalekit.com">Quick-start Guide</a> - 💻 <a target="_blank" href="https://docs.scalekit.com/apis">API Reference</a>
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
implementation "com.scalekit:scalekit-sdk-java:0.1.1"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.scalekit</groupId>
    <artifactId>scalekit-sdk-java</artifactId>
    <version>0.1.1</version>
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
        client = new ScalekitClient("environment url",
                "skc_...",
                "sk_test_...");
        }
}
```


## Examples - SSO with Express.js

Below is a simple code sample that showcases how to implement Single Sign-on using Scalekit SDK

```java
@RestController
public class AuthController {
    ScalekitClient scalekitClient = new ScalekitClient("environment url",
            "skc_...",
            "sk_test_...");

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

## Example Apps

Fully functional sample applications written using some popular web application frameworks and Scalekit SDK. Feel free to clone the repo and run them locally.

- [Spring Boot ](https://github.com/scalekit-inc/scalekit-spring-boot-example)


## API Reference

Refer to our [API reference docs](https://docs.scalekit.com/apis) for detailed information about all our API endpoints and their usage.

## More Information

- Quickstart Guide to implement Single Sign-on in your application: [SSO Quickstart Guide](https://docs.scalekit.com)
- Understand Single Sign-on basics: [SSO Basics](https://docs.scalekit.com/best-practices/single-sign-on)

## License
This project is licensed under the **MIT license**.
