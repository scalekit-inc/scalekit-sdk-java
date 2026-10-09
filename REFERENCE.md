<!-- markdownlint-disable MD024 MD001 -->

## Table of Contents

- [ScalekitClient](#scalekitclient)
- [Organizations](#organizations)
- [Connections](#connections)
- [Users](#users)
- [Domains](#domains)
- [Directories](#directories)
- [Sessions](#sessions)
- [Roles](#roles)
- [Permissions](#permissions)
- [Passwordless](#passwordless)
- [WebAuthn](#webauthn)
- [Auth](#auth)
- [Tokens](#tokens)
- [M2M](#m2m)
- [Resources](#resources)
- [Events](#events)
- [Login](#login)
- [Tools](#tools)
- [Connected Accounts](#connected-accounts)
- [Actions](#actions)
- [Actions › MCP](#actions--mcp)
- [Actions › Custom Providers](#actions--custom-providers)

The Java SDK exposes the clients and methods in the sections above through `ScalekitClient`. The AgentKit clients ([Tools](#tools), [Connected Accounts](#connected-accounts) and [Actions](#actions), including MCP configurations and providers) and the app and environment connection methods of [Connections](#connections) were added in 2.6.0; see [Tools](#tools) for how they report errors, retry and time out.

## ScalekitClient

<details><summary><code>new <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">ScalekitClient</a>(siteName, clientId, clientSecret) -> ScalekitClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new Scalekit client instance configured for your environment, and provides access to all API clients (organizations, users, connections, directories, API tokens, M2M clients, etc.).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.ScalekitClient;

ScalekitClient client = new ScalekitClient(
  "https://<your-env>.scalekit.com",
  "<client_id>",
  "<client_secret>"
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**siteName:** `String` - Your Scalekit environment URL (for example, `https://<your-env>.scalekit.com`)

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - OAuth client ID from your Scalekit dashboard

</dd>
</dl>

<dl>
<dd>

**clientSecret:** `String` - OAuth client secret from your Scalekit dashboard

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">organizations</a>() -> OrganizationClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns an <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">OrganizationClient</a> for managing organizations (tenants).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organizations().getById("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">connections</a>() -> ConnectionClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">ConnectionClient</a> for managing SSO connections.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connections().listConnectionsByOrganization("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">users</a>() -> UserClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">UserClient</a> for managing users and org memberships.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().getUser("user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">domains</a>() -> DomainClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">DomainClient</a> for managing organization domains.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domains().listDomainsByOrganizationId("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">directories</a>() -> DirectoryClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">DirectoryClient</a> for managing directories and directory resources (users/groups).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.directories().listDirectories("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">sessions</a>() -> SessionClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/SessionClient.java">SessionClient</a> for session retrieval and revocation.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sessions().getSession("sess_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">roles</a>() -> RoleClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">RoleClient</a> for environment and organization role management.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().listRoles();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">permissions</a>() -> PermissionClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">PermissionClient</a> for permission management and role-permission relationships.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().listPermissions();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">passwordless</a>() -> PasswordlessClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PasswordlessClient.java">PasswordlessClient</a> for passwordless auth flows (magic links / OTP).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.passwordless().sendPasswordlessEmail("user@acme.com");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">webAuthn</a>() -> WebAuthnClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/WebAuthnClient.java">WebAuthnClient</a> for WebAuthn credential management.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webAuthn().listCredentials("user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">authentication</a>() -> AuthClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns an <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">AuthClient</a> for OAuth flows, token validation, and token exchange.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.authentication().getClientAccessToken();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">webhook</a>() -> Webhook</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/webhooks/Webhook.java">Webhook</a> verifier for validating Scalekit webhook payload signatures.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import java.util.Map;

boolean ok = client.webhook().verifyWebhookPayload(
  "whsec_...",
  headers,
  payloadBytes
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhook().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/webhooks/Webhook.java">verifyWebhookPayload</a>(secret, headers, payload) -> boolean</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Verifies the authenticity and integrity of webhook payloads from Scalekit.

This validates the HMAC signature and timestamp (5-minute tolerance window) to ensure the webhook was sent by Scalekit and hasn't been tampered with.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import java.util.Map;

Map<String, String> headers = new java.util.HashMap<>();
headers.put("webhook-id", "<id>");
headers.put("webhook-timestamp", "<epoch_seconds>");
headers.put("webhook-signature", "v1,<base64sig>");

byte[] payload = requestBodyBytes;

boolean isValid = client.webhook().verifyWebhookPayload("whsec_...", headers, payload);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**secret:** `String` - Your webhook signing secret from the Scalekit dashboard (format: `whsec_...`)

</dd>
</dl>

<dl>
<dd>

**headers:** `Map<String, String>` - The HTTP headers from the webhook request (must include `webhook-id`, `webhook-timestamp`, `webhook-signature`)

</dd>
</dl>

<dl>
<dd>

**payload:** `byte[]` - The raw webhook request body bytes

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>new <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/webhooks/ScalekitInterceptor.java">ScalekitInterceptor</a>().verifyInterceptorPayload(secret, headers, payload) -> boolean</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Verifies the authenticity and integrity of interceptor payloads from Scalekit.

This validates the HMAC signature and timestamp (5-minute tolerance window) to ensure the interceptor request was sent by Scalekit and hasn't been tampered with.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.webhooks.ScalekitInterceptor;
import java.util.Map;

ScalekitInterceptor interceptor = new ScalekitInterceptor();

Map<String, String> headers = new java.util.HashMap<>();
headers.put("interceptor-id", "<id>");
headers.put("interceptor-timestamp", "<epoch_seconds>");
headers.put("interceptor-signature", "v1,<base64sig>");

byte[] payload = requestBodyBytes;

boolean isValid = interceptor.verifyInterceptorPayload("insec_...", headers, payload);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**secret:** `String` - Your interceptor signing secret from the Scalekit dashboard

</dd>
</dl>

<dl>
<dd>

**headers:** `Map<String, String>` - The HTTP headers from the interceptor request (must include `interceptor-id`, `interceptor-timestamp`, `interceptor-signature`)

</dd>
</dl>

<dl>
<dd>

**payload:** `byte[]` - The raw interceptor request body bytes

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">tokens</a>() -> TokenClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">TokenClient</a> for managing API tokens (programmatic access credentials).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().create("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">m2m</a>() -> M2MClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">M2MClient</a> for managing machine-to-machine API clients.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.m2m().listOrganizationClients("org_123", 20, "");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">resources</a>() -> ResourceConsentClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">ResourceConsentClient</a> for reading and revoking the end-user consents granted against a resource, such as an MCP server.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.resources().listUserConsents("res_142145647087190278", null);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">tools</a>() -> ToolsClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ToolsClient.java">ToolsClient</a> for listing tools and running them on behalf of connected accounts. Same instance on every call; thread-safe. Since 2.6.0.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ToolsClient tools = client.tools();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">connectedAccounts</a>() -> ConnectedAccountsClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">ConnectedAccountsClient</a> for your users' accounts on third-party services, whose credentials Scalekit stores and refreshes. Same instance on every call; thread-safe. Since 2.6.0.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccountsClient accounts = client.connectedAccounts();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/ScalekitClient.java">actions</a>() -> ActionsClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the <a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">ActionsClient</a> facade: tools, connected accounts, MCP configurations (`mcp()`), custom providers (`providers()`) and calls to third-party APIs through Scalekit's proxy (`request`). Same instance on every call; thread-safe. Since 2.6.0.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ActionsClient actions = client.actions();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Organizations

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">create</a>(organization) -> Organization</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new organization (tenant).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;

CreateOrganization req = CreateOrganization.newBuilder()
  .setName("Acme Corporation")
  .build();

Organization org = client.organizations().create(req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organization:** `CreateOrganization` - The organization create request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">getById</a>(id) -> Organization</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches an organization by its Scalekit organization ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organizations().getById("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">getByExternalId</a>(externalId) -> Organization</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches an organization by its external ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organizations().getByExternalId("customer_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` - The external ID associated with the organization

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">updateById</a>(id, organization) -> Organization</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an organization by its Scalekit organization ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganization;

UpdateOrganization req = UpdateOrganization.newBuilder()
  .setName("Acme Corp (Updated)")
  .build();

client.organizations().updateById("org_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**organization:** `UpdateOrganization` - The organization update request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">updateByExternalId</a>(externalId, organization) -> Organization</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an organization by its external ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganization;

UpdateOrganization req = UpdateOrganization.newBuilder()
  .setName("Acme Corp (Updated)")
  .build();

client.organizations().updateByExternalId("customer_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` - The external ID associated with the organization

</dd>
</dl>

<dl>
<dd>

**organization:** `UpdateOrganization` - The organization update request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">deleteById</a>(id) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an organization by its Scalekit organization ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organizations().deleteById("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">deleteByExternalId</a>(externalId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an organization by its external ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organizations().deleteByExternalId("customer_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` - The external ID associated with the organization

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">listOrganizations</a>(pageSize, pageToken) -> ListOrganizationsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists organizations with pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organizations().listOrganizations(20, "");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pageSize:** `int` - Number of organizations per page

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination token (empty string for first page)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">generatePortalLink</a>(organizationId) -> Link</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generates an admin portal link for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organizations().generatePortalLink("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">generatePortalLink</a>(organizationId, features) -> Link</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generates an admin portal link for an organization, optionally scoped to specific portal features.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import java.util.Arrays;
import com.scalekit.grpc.scalekit.v1.organizations.Feature;

client.organizations().generatePortalLink(
  "org_123",
  Arrays.asList(Feature.FEATURE_USERS, Feature.FEATURE_CONNECTIONS)
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**features:** `List<Feature>` - The portal features to include in the link

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">updateOrganizationSettings</a>(organizationId, settings) -> Organization</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates organization settings features.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import java.util.Collections;
import com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsFeature;

client.organizations().updateOrganizationSettings(
  "org_123",
  Collections.emptyList()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**settings:** `List<OrganizationSettingsFeature>` - The settings features to apply

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organizations().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/OrganizationClient.java">upsertUserManagementSettings</a>(organizationId, settings) -> OrganizationUserManagementSettings</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates or updates user management settings for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.organizations.OrganizationUserManagementSettings;

OrganizationUserManagementSettings settings =
  OrganizationUserManagementSettings.newBuilder().build();

client.organizations().upsertUserManagementSettings("org_123", settings);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**settings:** `OrganizationUserManagementSettings` - The user management settings to upsert

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Connections

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">getConnectionById</a>(connectionId, organizationId) -> Connection</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches a connection by ID within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connections().getConnectionById("conn_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionId:** `String` - The connection ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">listConnectionsByDomain</a>(domain) -> ListConnectionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists connections by domain.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connections().listConnectionsByDomain("acme.com");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**domain:** `String` - The domain name (for example, `acme.com`)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">listConnectionsByOrganization</a>(organizationId) -> ListConnectionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists connections for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connections().listConnectionsByOrganization("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">enableConnection</a>(connectionId, organizationId) -> ToggleConnectionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Enables a connection within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connections().enableConnection("conn_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionId:** `String` - The connection ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">disableConnection</a>(connectionId, organizationId) -> ToggleConnectionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Disables a connection within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connections().disableConnection("conn_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionId:** `String` - The connection ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">createConnection</a>(organizationId, connection) -> Connection</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new connection for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.connections.CreateConnection;

CreateConnection req = CreateConnection.newBuilder()
  .setDisplayName("Acme Okta")
  .build();

client.connections().createConnection("org_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**connection:** `CreateConnection` - The connection create request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">deleteConnection</a>(connectionId, organizationId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a connection within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connections().deleteConnection("conn_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionId:** `String` - The connection ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

### App and environment connections

Added in 2.6.0. These methods take and return SDK models from `com.scalekit.models.connections`, unlike the organization connection methods above, which use generated types. App connections are the connections your users' connected accounts belong to; their `connectionName()` is what [Tools](#tools) and [Connected Accounts](#connected-accounts) call `connectionName`. Status and auth mode are `Optional` and empty when the server does not set them; settings (`oauthSettings()`, `staticSettings()`, `googleDwdSettings()`) are never printed by `toString()`, and the server returns their secrets (client secret, Google Ads developer token, service account key) masked. Only the settings app connections use are modelled. Create is never retried; the other calls are retried on UNAVAILABLE. Errors, retries and deadlines otherwise work as described under [Tools](#tools). A class that implements `ConnectionClient` itself inherits default methods that throw `UnsupportedOperationException`.

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">listAppConnections</a>(params) -> Page&lt;AppConnection&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists one page of your environment's app connections. `listAppConnections()` lists all. A query shorter than 3 characters, or a page size over 30, throws `BadRequestException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Page<AppConnection> page = client.connections().listAppConnections(
        ListAppConnectionsParams.builder().provider("GMAIL").build());
for (AppConnection connection : page.autoPager()) {
    System.out.println(connection.connectionName() + " " + connection.status().map(Object::toString).orElse("-"));
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListAppConnectionsParams` - Optional. `provider`, `query` (3 to 100 characters), `pageSize` (at most 30) and `pageToken`. May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">createEnvironmentConnection</a>(params) -> EnvironmentConnection</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an app connection. When no connection name is given, the server generates one from the provider (for example `gmail`, or `gmail-1a2b3c4d` when that is taken). A taken name throws `BadRequestException` with `getScalekitErrorCode()` `DUPLICATE_IDENTIFIER`. Never retried, because a repeat could create a second connection.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
EnvironmentConnection gmail = client.connections().createEnvironmentConnection(
        CreateEnvironmentConnectionParams.appConnection("GMAIL")
                .connectionName("gmail-support")
                .build());
String connectionId = gmail.id();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `CreateEnvironmentConnectionParams` - Required. `CreateEnvironmentConnectionParams.appConnection(providerKey)`, then optionally `type`, `connectionName`, `authMode` and `context` (JSON-compatible values).

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">getEnvironmentConnection</a>(connectionId) -> EnvironmentConnection</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets an environment connection, including its settings; secrets in them are masked. A missing connection throws `NotFoundException`; a malformed ID throws `BadRequestException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
EnvironmentConnection connection = client.connections().getEnvironmentConnection("conn_123");
connection.oauthSettings().ifPresent(oauth -> System.out.println(oauth.scopes()));
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionId:** `String` - The connection ID. Required; not empty.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connections().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectionClient.java">updateEnvironmentConnection</a>(connectionId, params) -> EnvironmentConnection</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an environment connection. The server requires the connection name, provider key and type on every update, and stores the connection name given: pass the current name to keep it. **Pass the connection's current type** (for example `getEnvironmentConnection(id).type()`): a different type converts the connection, changing its type and provider, resetting its settings and setting its status to `IN_PROGRESS`; the SDK does not check this. Secrets read back are masked, and a masked value sent back keeps the stored secret, so settings read with `getEnvironmentConnection` can be changed and sent back. Set at most one kind of settings. A reserved name throws `BadRequestException` (`RESTRICTED_CONNECTION_NAME`); a missing connection throws `NotFoundException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
EnvironmentConnection current = client.connections().getEnvironmentConnection("conn_123");
EnvironmentConnection updated = client.connections().updateEnvironmentConnection(current.id(),
        UpdateEnvironmentConnectionParams.builder(
                        current.connectionName().orElseThrow(IllegalStateException::new),
                        current.providerKey(),
                        current.type())
                .oauthSettings(OAuthConnectionSettings.builder()
                        .clientId(System.getenv("GMAIL_CLIENT_ID"))
                        .clientSecret(System.getenv("GMAIL_CLIENT_SECRET"))
                        .scopes(Arrays.asList("https://www.googleapis.com/auth/gmail.readonly"))
                        .build())
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionId:** `String` - The connection ID. Required; not empty.

</dd>
</dl>
<dl>
<dd>

**params:** `UpdateEnvironmentConnectionParams` - Required. `builder(connectionName, providerKey, type)`, then at most one of `oauthSettings`, `staticSettings` (JSON-compatible map) or `googleDwdSettings`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Users

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">createUserAndMembership</a>(organizationId, request) -> CreateUserAndMembershipResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a user and an organization membership in one call.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest;

CreateUserAndMembershipRequest req = CreateUserAndMembershipRequest.newBuilder()
  .setEmail("user@acme.com")
  .build();

client.users().createUserAndMembership("org_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**request:** `CreateUserAndMembershipRequest` - Create user + membership request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">getUser</a>(userId) -> GetUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets a user by user ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().getUser("user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">listUsers</a>(request) -> ListUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists users based on a request filter.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.users.ListUsersRequest;

ListUsersRequest req = ListUsersRequest.newBuilder()
  .setPageSize(20)
  .build();

client.users().listUsers(req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ListUsersRequest` - List users request (pagination + filters)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">updateUser</a>(userId, request) -> UpdateUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates a user by user ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest;

UpdateUserRequest req = UpdateUserRequest.newBuilder()
  .setGivenName("Jane")
  .build();

client.users().updateUser("user_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>

<dl>
<dd>

**request:** `UpdateUserRequest` - Update user request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">deleteUser</a>(userId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a user by user ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().deleteUser("user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">createMembership</a>(organizationId, userId, request) -> CreateMembershipResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an organization membership for a user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest;

CreateMembershipRequest req = CreateMembershipRequest.newBuilder().build();

client.users().createMembership("org_123", "user_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>

<dl>
<dd>

**request:** `CreateMembershipRequest` - Create membership request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">deleteMembership</a>(organizationId, userId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an organization membership for a user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().deleteMembership("org_123", "user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">updateMembership</a>(organizationId, userId, request) -> UpdateMembershipResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an organization membership for a user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest;

UpdateMembershipRequest req = UpdateMembershipRequest.newBuilder().build();

client.users().updateMembership("org_123", "user_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>

<dl>
<dd>

**request:** `UpdateMembershipRequest` - Update membership request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">listOrganizationUsers</a>(organizationId, request) -> ListOrganizationUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists users for a given organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest;

ListOrganizationUsersRequest req = ListOrganizationUsersRequest.newBuilder()
  .setPageSize(20)
  .build();

client.users().listOrganizationUsers("org_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**request:** `ListOrganizationUsersRequest` - List organization users request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/UserClient.java">resendInvite</a>(organizationId, userId) -> ResendInviteResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Resends an invite to a user for a given organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().resendInvite("org_123", "user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Domains

<details><summary><code>client.domains().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">createDomain</a>(organizationId, domainName) -> Domain</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a domain for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domains().createDomain("org_123", "acme.com");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**domainName:** `String` - The domain name (for example, `acme.com`)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domains().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">createDomain</a>(organizationId, domainName, domainType) -> Domain</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a domain for an organization with a specified domain type.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.domains.DomainType;

client.domains().createDomain("org_123", "acme.com", DomainType.DOMAIN_TYPE_PRIMARY);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**domainName:** `String` - The domain name

</dd>
</dl>

<dl>
<dd>

**domainType:** `DomainType` - The domain type

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domains().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">createDomain</a>(request) -> Domain</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a domain using a request object.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest;

CreateDomainRequest req = CreateDomainRequest.newBuilder()
  .setOrganizationId("org_123")
  .setDomain("acme.com")
  .build();

client.domains().createDomain(req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CreateDomainRequest` - The create domain request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domains().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">getDomainById</a>(organizationId, domainId) -> Domain</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets a domain by ID for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domains().getDomainById("org_123", "dom_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**domainId:** `String` - The domain ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domains().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">listDomainsByOrganizationId</a>(organizationId) -> List&lt;Domain&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists domains for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domains().listDomainsByOrganizationId("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domains().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">listDomainsByOrganizationId</a>(organizationId, domainType) -> List&lt;Domain&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists domains for an organization filtered by domain type.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.domains.DomainType;

client.domains().listDomainsByOrganizationId("org_123", DomainType.DOMAIN_TYPE_PRIMARY);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**domainType:** `DomainType` - The domain type to filter by

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domains().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DomainClient.java">deleteDomain</a>(organizationId, domainId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a domain by ID for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domains().deleteDomain("org_123", "dom_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**domainId:** `String` - The domain ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Directories

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">getDirectory</a>(directoryId, organizationId) -> Directory</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets a directory by ID within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.directories().getDirectory("dir_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**directoryId:** `String` - The directory ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">listDirectories</a>(organizationId) -> ListDirectoriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists directories for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.directories().listDirectories("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">listDirectoryUsers</a>(directoryId, organizationId, options) -> ListDirectoryUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists directory users with pagination and optional filtering, returning a Java-friendly wrapper response.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.api.util.ListDirectoryResourceOptions;
import com.scalekit.api.util.ListDirectoryUserResponse;

ListDirectoryResourceOptions options = ListDirectoryResourceOptions.builder()
  .pageSize(50)
  .includeDetail(true)
  .build();

ListDirectoryUserResponse res = client.directories().listDirectoryUsers("dir_123", "org_123", options);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**directoryId:** `String` - The directory ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**options:** `ListDirectoryResourceOptions` - Options for listing directory resources
- `pageSize: int` - Page size
- `pageToken: String` - Page token
- `includeDetail: boolean` - Include raw SCIM detail payloads (if available)
- `updatedAfter: Timestamp` - Filter resources updated after this time

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">listDirectoryGroups</a>(directoryId, organizationId, options) -> ListDirectoryGroupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists directory groups with pagination and optional filtering, returning a Java-friendly wrapper response.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.api.util.ListDirectoryGroupResponse;
import com.scalekit.api.util.ListDirectoryResourceOptions;

ListDirectoryResourceOptions options = ListDirectoryResourceOptions.builder()
  .pageSize(50)
  .includeDetail(true)
  .build();

ListDirectoryGroupResponse res = client.directories().listDirectoryGroups("dir_123", "org_123", options);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**directoryId:** `String` - The directory ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**options:** `ListDirectoryResourceOptions` - Options for listing directory resources
- `pageSize: int` - Page size
- `pageToken: String` - Page token
- `includeDetail: boolean` - Include raw SCIM detail payloads (if available)
- `updatedAfter: Timestamp` - Filter resources updated after this time

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">enableDirectory</a>(directoryId, organizationId) -> ToggleDirectoryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Enables a directory within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.directories().enableDirectory("dir_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**directoryId:** `String` - The directory ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">disableDirectory</a>(directoryId, organizationId) -> ToggleDirectoryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Disables a directory within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.directories().disableDirectory("dir_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**directoryId:** `String` - The directory ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">getPrimaryDirectoryByOrganizationId</a>(organizationId) -> Directory</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets the primary directory for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.directories().getPrimaryDirectoryByOrganizationId("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">createDirectory</a>(organizationId, directory) -> Directory</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a directory for an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.directories.CreateDirectory;

CreateDirectory req = CreateDirectory.newBuilder()
  .setDisplayName("Acme SCIM Directory")
  .build();

client.directories().createDirectory("org_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**directory:** `CreateDirectory` - The directory create request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.directories().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/DirectoryClient.java">deleteDirectory</a>(directoryId, organizationId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a directory within an organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.directories().deleteDirectory("dir_123", "org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**directoryId:** `String` - The directory ID

</dd>
</dl>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Sessions

<details><summary><code>client.sessions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/SessionClient.java">getSession</a>(sessionId) -> SessionDetails</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets session details by session ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sessions().getSession("sess_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sessionId:** `String` - The session ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sessions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/SessionClient.java">getUserSessions</a>(userId, pageSize, pageToken, filter) -> UserSessionDetails</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists sessions for a user with pagination and optional filtering.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.sessions.UserSessionFilter;

UserSessionFilter filter = UserSessionFilter.newBuilder().build();

client.sessions().getUserSessions("user_123", 20, "", filter);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>

<dl>
<dd>

**pageSize:** `Integer` - Number of sessions per page

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination token (empty string for first page)

</dd>
</dl>

<dl>
<dd>

**filter:** `UserSessionFilter` - Optional filter criteria

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sessions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/SessionClient.java">revokeSession</a>(sessionId) -> RevokeSessionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Revokes a session by session ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sessions().revokeSession("sess_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sessionId:** `String` - The session ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sessions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/SessionClient.java">revokeAllUserSessions</a>(userId) -> RevokeAllUserSessionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Revokes all sessions for a user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sessions().revokeAllUserSessions("user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Roles

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">createRole</a>(request) -> CreateRoleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an environment-level role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest;

CreateRoleRequest req = CreateRoleRequest.newBuilder().build();
client.roles().createRole(req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CreateRoleRequest` - Create role request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">getRole</a>(roleName) -> GetRoleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets an environment-level role by role name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().getRole("admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">listRoles</a>() -> ListRolesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists environment-level roles.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().listRoles();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">updateRole</a>(roleName, request) -> UpdateRoleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an environment-level role by role name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest;

UpdateRoleRequest req = UpdateRoleRequest.newBuilder().build();
client.roles().updateRole("admin", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>

<dl>
<dd>

**request:** `UpdateRoleRequest` - Update role request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">deleteRole</a>(roleName) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an environment-level role by role name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().deleteRole("admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">deleteRole</a>(roleName, reassignRoleName) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an environment-level role, optionally reassigning users to another role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().deleteRole("old_role", "new_role");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name to delete

</dd>
</dl>

<dl>
<dd>

**reassignRoleName:** `String` - Role name to reassign users to

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">getRoleUsersCount</a>(roleName) -> GetRoleUsersCountResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets the number of users assigned to an environment-level role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().getRoleUsersCount("admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">createOrganizationRole</a>(orgId, request) -> CreateOrganizationRoleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an organization-level role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest;

CreateOrganizationRoleRequest req = CreateOrganizationRoleRequest.newBuilder().build();
client.roles().createOrganizationRole("org_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orgId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**request:** `CreateOrganizationRoleRequest` - Create organization role request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">getOrganizationRole</a>(orgId, roleName) -> GetOrganizationRoleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets an organization-level role by name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().getOrganizationRole("org_123", "org_admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orgId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">listOrganizationRoles</a>(orgId) -> ListOrganizationRolesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists organization-level roles.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().listOrganizationRoles("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orgId:** `String` - The organization ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">updateOrganizationRole</a>(orgId, roleName, request) -> UpdateOrganizationRoleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an organization-level role by name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest;

UpdateOrganizationRoleRequest req = UpdateOrganizationRoleRequest.newBuilder().build();
client.roles().updateOrganizationRole("org_123", "org_admin", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orgId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>

<dl>
<dd>

**request:** `UpdateOrganizationRoleRequest` - Update organization role request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">deleteOrganizationRole</a>(orgId, roleName) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an organization-level role by name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().deleteOrganizationRole("org_123", "org_admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orgId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">deleteOrganizationRole</a>(orgId, roleName, reassignRoleName) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an organization-level role, optionally reassigning users to another role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().deleteOrganizationRole("org_123", "old_role", "new_role");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orgId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**roleName:** `String` - Role name to delete

</dd>
</dl>

<dl>
<dd>

**reassignRoleName:** `String` - Role name to reassign users to

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">updateDefaultOrganizationRoles</a>(orgId, request) -> UpdateDefaultOrganizationRolesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates the default organization roles configuration.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest;

UpdateDefaultOrganizationRolesRequest req = UpdateDefaultOrganizationRolesRequest.newBuilder().build();
client.roles().updateDefaultOrganizationRoles("org_123", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orgId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**request:** `UpdateDefaultOrganizationRolesRequest` - Update default roles request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.roles().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/RoleClient.java">deleteRoleBase</a>(roleName) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a role base by role name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().deleteRoleBase("admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Permissions

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">createPermission</a>(request) -> CreatePermissionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a permission.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest;

CreatePermissionRequest req = CreatePermissionRequest.newBuilder().build();
client.permissions().createPermission(req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CreatePermissionRequest` - Create permission request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">getPermission</a>(permissionName) -> GetPermissionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets a permission by name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().getPermission("read:documents");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**permissionName:** `String` - Permission name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">listPermissions</a>() -> ListPermissionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists permissions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().listPermissions();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">listPermissions</a>(pageToken) -> ListPermissionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists permissions using a pagination token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().listPermissions("next_page_token");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pageToken:** `String` - Pagination token

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">updatePermission</a>(permissionName, request) -> UpdatePermissionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates a permission by name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest;

UpdatePermissionRequest req = UpdatePermissionRequest.newBuilder().build();
client.permissions().updatePermission("read:documents", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**permissionName:** `String` - Permission name

</dd>
</dl>

<dl>
<dd>

**request:** `UpdatePermissionRequest` - Update permission request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">deletePermission</a>(permissionName) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a permission by name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().deletePermission("read:documents");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**permissionName:** `String` - Permission name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">listRolePermissions</a>(roleName) -> ListRolePermissionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists permissions directly assigned to a role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().listRolePermissions("admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">addPermissionsToRole</a>(roleName, request) -> AddPermissionsToRoleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Adds permissions to a role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest;

AddPermissionsToRoleRequest req = AddPermissionsToRoleRequest.newBuilder().build();
client.permissions().addPermissionsToRole("admin", req);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>

<dl>
<dd>

**request:** `AddPermissionsToRoleRequest` - Add permissions to role request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">removePermissionFromRole</a>(roleName, permissionName) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Removes a permission from a role.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().removePermissionFromRole("admin", "read:documents");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>

<dl>
<dd>

**permissionName:** `String` - Permission name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.permissions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PermissionClient.java">listEffectiveRolePermissions</a>(roleName) -> ListEffectiveRolePermissionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists effective permissions for a role, including inherited permissions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().listEffectiveRolePermissions("admin");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**roleName:** `String` - Role name

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Passwordless

<details><summary><code>client.passwordless().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PasswordlessClient.java">sendPasswordlessEmail</a>(email, options) -> SendPasswordlessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Sends a passwordless authentication email (magic link / OTP depending on template).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.SendPasswordlessOptions;

SendPasswordlessOptions options = new SendPasswordlessOptions();
options.setState("opaque-state");

client.passwordless().sendPasswordlessEmail("user@acme.com", options);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**email:** `String` - The email address to send the passwordless link to

</dd>
</dl>

<dl>
<dd>

**options:** `SendPasswordlessOptions` - Options for sending the passwordless email
- `template: TemplateType` - Email template type
- `state: String` - Opaque state value
- `magiclinkAuthUri: String` - Magiclink auth URI override
- `expiresIn: Integer` - Expiration in seconds
- `templateVariables: Map<String, String>` - Template variables

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.passwordless().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PasswordlessClient.java">sendPasswordlessEmail</a>(email) -> SendPasswordlessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Sends a passwordless authentication email with default options.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.passwordless().sendPasswordlessEmail("user@acme.com");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**email:** `String` - The email address to send the passwordless link to

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.passwordless().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PasswordlessClient.java">verifyPasswordlessEmail</a>(credential, authRequestId) -> VerifyPasswordLessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Verifies a passwordless authentication code or link token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.VerifyPasswordlessOptions;

VerifyPasswordlessOptions credential = new VerifyPasswordlessOptions();
credential.setCode("123456");

client.passwordless().verifyPasswordlessEmail(credential, "authreq_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**credential:** `VerifyPasswordlessOptions` - Credential payload
- `code: String` - One-time code (OTP)
- `linkToken: String` - Magic link token
- `authRequestId: String` - Optional auth request ID

</dd>
</dl>

<dl>
<dd>

**authRequestId:** `String` - Optional auth request ID from the send response

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.passwordless().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PasswordlessClient.java">verifyPasswordlessEmail</a>(credential) -> VerifyPasswordLessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Verifies a passwordless authentication code or link token without supplying an auth request ID argument.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.VerifyPasswordlessOptions;

VerifyPasswordlessOptions credential = new VerifyPasswordlessOptions();
credential.setLinkToken("<magic_link_token>");

client.passwordless().verifyPasswordlessEmail(credential);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**credential:** `VerifyPasswordlessOptions` - Credential payload
- `code: String` - One-time code (OTP)
- `linkToken: String` - Magic link token
- `authRequestId: String` - Optional auth request ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.passwordless().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/PasswordlessClient.java">resendPasswordlessEmail</a>(authRequestId) -> SendPasswordlessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Resends a passwordless authentication email.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.passwordless().resendPasswordlessEmail("authreq_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**authRequestId:** `String` - The auth request ID from the original send response

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## WebAuthn

<details><summary><code>client.webAuthn().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/WebAuthnClient.java">listCredentials</a>(userId) -> ListCredentialsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists all WebAuthn credentials for a user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webAuthn().listCredentials("user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` - The user ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webAuthn().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/WebAuthnClient.java">updateCredential</a>(credentialId, displayName) -> UpdateCredentialResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates a WebAuthn credential's display name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webAuthn().updateCredential("cred_123", "My laptop key");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**credentialId:** `String` - Credential ID

</dd>
</dl>

<dl>
<dd>

**displayName:** `String` - New display name for the credential

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webAuthn().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/WebAuthnClient.java">deleteCredential</a>(credentialId) -> DeleteCredentialResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a WebAuthn credential.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webAuthn().deleteCredential("cred_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**credentialId:** `String` - Credential ID

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Auth

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">getAuthorizationUrl</a>(redirectUri, options) -> URL</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Utility method to generate the OAuth 2.0 authorization URL to initiate the SSO authentication flow.

This method doesn't make any network calls but instead generates a fully formed Authorization URL that you can redirect your users to.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.AuthorizationUrlOptions;
import java.net.URL;

AuthorizationUrlOptions options = new AuthorizationUrlOptions();
options.setOrganizationId("org_123");
options.setState("random-state-value");

URL authUrl = client.authentication().getAuthorizationUrl(
  "https://yourapp.com/auth/callback",
  options
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**redirectUri:** `String` - The URL where users will be redirected after authentication. Must match one of the redirect URIs configured in your Scalekit dashboard.

</dd>
</dl>

<dl>
<dd>

**options:** `AuthorizationUrlOptions` - Optional configuration for the authorization request
- `connectionId: String` - Specific SSO connection ID to use for authentication
- `organizationId: String` - Organization ID to authenticate against
- `scopes: List<String>` - OAuth scopes to request (default: `openid profile email`)
- `state: String` - Opaque value to maintain state between request and callback
- `nonce: String` - String value used to associate a client session with an ID Token
- `domainHint: String` - Domain hint to identify which organization's IdP to use
- `loginHint: String` - Hint about the login identifier the user might use
- `codeChallenge: String` - PKCE code challenge for enhanced security
- `codeChallengeMethod: String` - Method used to generate the code challenge (S256)
- `provider: String` - Social login provider (for example, `google`, `github`, `microsoft`)
- `prompt: String` - Controls authentication behavior (for example, `login`, `consent`, `create`)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">getLogoutUrl</a>(options) -> URL</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Utility method to generate the OAuth 2.0 logout URL to initiate the logout flow.

This method doesn't make any network calls but instead generates a fully formed logout URL that you can redirect your users to for logging out.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.LogoutUrlOptions;
import java.net.URL;

LogoutUrlOptions options = new LogoutUrlOptions();
options.setIdTokenHint(user.getIdToken());
options.setPostLogoutRedirectUri("https://yourapp.com");
options.setState("random-state-value");

URL logoutUrl = client.authentication().getLogoutUrl(options);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**options:** `LogoutUrlOptions` - Configuration for the logout request
- `idTokenHint: String` - ID token hint to identify the user to log out
- `postLogoutRedirectUri: String` - URL to redirect the user to after logout (optional)
- `state: String` - Opaque value to maintain state between request and callback (optional)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">authenticateWithCode</a>(code, redirectUri, options) -> AuthenticationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Exchanges an authorization code for access tokens and ID token information.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.AuthenticationOptions;
import com.scalekit.internal.http.AuthenticationResponse;

AuthenticationResponse result = client.authentication().authenticateWithCode(
  "<code>",
  "https://yourapp.com/auth/callback",
  new AuthenticationOptions()
);

String accessToken = result.getAccessToken();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**code:** `String` - The authorization code received in the callback URL after user authentication

</dd>
</dl>

<dl>
<dd>

**redirectUri:** `String` - The same redirect URI used in getAuthorizationUrl(). Must match exactly.

</dd>
</dl>

<dl>
<dd>

**options:** `AuthenticationOptions` - Optional authentication configuration
- `codeVerifier: String` - PKCE code verifier (required if PKCE was used)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">getIdpInitiatedLoginClaims</a>(idpInitiatedLoginToken) -> IdpInitiatedLoginClaims</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Extracts and validates claims from an IdP-initiated login token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.IdpInitiatedLoginClaims;

IdpInitiatedLoginClaims claims = client.authentication().getIdpInitiatedLoginClaims("<idp_initiated_login_token>");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**idpInitiatedLoginToken:** `String` - The IdP initiated login token

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">refreshAccessToken</a>(refreshToken) -> AuthenticationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Refreshes access credentials using a refresh token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.authentication().refreshAccessToken("<refresh_token>");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**refreshToken:** `String` - The refresh token

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">validateAccessToken</a>(jwt) -> boolean</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates an access token's signature and expiry.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
boolean ok = client.authentication().validateAccessToken("<access_token_jwt>");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jwt:** `String` - The access token JWT

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">validateAccessToken</a>(jwt, options) -> boolean</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates an access token's signature and expiry, and additionally enforces the expected issuer(s) and/or audience when provided via `TokenValidationOptions`. The token is valid if its `iss` claim exactly equals **any** accepted issuer, that is `issuer` and/or any entry of `issuers` (no trailing-slash normalization), and its `aud` contains at least one of the expected audience values. Leaving both unset skips the issuer check; a non-empty `issuers` list is always enforced, even if its entries are blank.

Returns `false` when the signature does not verify. Any other failure — an expired token, or an issuer/audience mismatch when the corresponding option is set — is thrown as an `APIException` rather than returned as `false`, so wrap the call in a try/catch when you need to distinguish those cases.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.TokenValidationOptions;
import java.util.Arrays;

// Trust both the base issuer and a resource-bound issuer
TokenValidationOptions options = TokenValidationOptions.builder()
  .issuers(Arrays.asList(
    "https://your-env.scalekit.dev",
    "https://your-env.scalekit.dev/resources/res_123"))
  .audience(Arrays.asList("your-audience"))
  .build();

boolean ok = client.authentication().validateAccessToken("<access_token_jwt>", options);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jwt:** `String` - The access token JWT

</dd>
</dl>

<dl>
<dd>

**options:** `TokenValidationOptions` - Optional issuer and audience validation options. `issuer` (single `String`) and/or `issuers` (`List<String>`); the token is valid if `iss` equals any accepted issuer. Pass `null` to validate signature and expiry only

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">validateAccessTokenAndGetClaims</a>(jwt) -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates an access token and returns decoded claims as a map.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import java.util.Map;

Map<String, Object> claims = client.authentication().validateAccessTokenAndGetClaims("<access_token_jwt>");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jwt:** `String` - The access token JWT

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">validateAccessTokenAndGetClaims</a>(jwt, options) -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates an access token like `validateAccessToken(jwt, options)` and returns the decoded claims. The token is valid if its `iss` claim exactly equals `issuer` or any entry of `issuers`. Throws an `APIException` if the signature is invalid, the token is expired, or it fails an issuer/audience check.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.internal.http.TokenValidationOptions;
import java.util.Arrays;
import java.util.Map;

TokenValidationOptions options = TokenValidationOptions.builder()
  .issuers(Arrays.asList(
    "https://your-env.scalekit.dev",
    "https://your-env.scalekit.dev/resources/res_123"))
  .build();

Map<String, Object> claims =
  client.authentication().validateAccessTokenAndGetClaims("<access_token_jwt>", options);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jwt:** `String` - The access token JWT

</dd>
</dl>

<dl>
<dd>

**options:** `TokenValidationOptions` - Optional issuer and audience validation options (pass `null` for signature and expiry only)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.authentication().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/AuthClient.java">getClientAccessToken</a>() -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches an access token using the client credentials grant (machine-to-machine).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
String token = client.authentication().getClientAccessToken();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tokens

<details><summary><code>client.tokens().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">create</a>(organizationId) -> CreateTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new API token for an organization with default settings.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().create("org_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID to scope the token to

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">create</a>(organizationId, userId, customClaims, expiry, description) -> CreateTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new API token for an organization with custom options.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import java.util.HashMap;
import java.util.Map;
import com.google.protobuf.Timestamp;

Map<String, String> claims = new HashMap<>();
claims.put("environment", "production");

Timestamp expiry = Timestamp.newBuilder()
  .setSeconds(System.currentTimeMillis() / 1000 + 86400)
  .build();

client.tokens().create("org_123", "user_123", claims, expiry, "Production access token");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID to scope the token to

</dd>
</dl>

<dl>
<dd>

**userId:** `String` - Optional user ID to scope the token to a specific user

</dd>
</dl>

<dl>
<dd>

**customClaims:** `Map<String, String>` - Optional custom claims key-value pairs

</dd>
</dl>

<dl>
<dd>

**expiry:** `Timestamp` - Optional expiry timestamp

</dd>
</dl>

<dl>
<dd>

**description:** `String` - Optional human-readable description

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">validate</a>(token) -> ValidateTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates an API token and returns associated context.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().validate("apit_xxxxx");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**token:** `String` - The opaque token string or token ID (format: `apit_xxxxx`)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">invalidate</a>(token) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Invalidates (soft deletes) an API token. This operation is idempotent - it succeeds even if the token was already invalidated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().invalidate("apit_xxxxx");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**token:** `String` - The opaque token string or token ID (format: `apit_xxxxx`)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">update</a>(token, customClaims, description) -> UpdateTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates custom claims and/or description of an existing API token. Custom claims are merged into the existing set. To remove a claim, set its value to an empty string.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import java.util.HashMap;
import java.util.Map;

Map<String, String> newClaims = new HashMap<>();
newClaims.put("environment", "staging");
newClaims.put("old_claim", "");  // Remove this claim

client.tokens().update("apit_xxxxx", newClaims, "Updated description");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**token:** `String` - The opaque token string or token ID (format: `apit_xxxxx`)

</dd>
</dl>

<dl>
<dd>

**customClaims:** `Map<String, String>` - Claims to merge; set value to `""` to remove a claim

</dd>
</dl>

<dl>
<dd>

**description:** `String` - Replacement description; `null` leaves unchanged, empty string clears it

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">list</a>(organizationId, pageSize, pageToken) -> ListTokensResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists API tokens for an organization with pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().list("org_123", 20, "");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID to list tokens for

</dd>
</dl>

<dl>
<dd>

**pageSize:** `int` - Page size (default 10, max 30)

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination cursor for next page (empty string for first page)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/TokenClient.java">list</a>(organizationId, userId, pageSize, pageToken) -> ListTokensResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists API tokens for an organization and user with pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().list("org_123", "user_123", 20, "");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID to list tokens for

</dd>
</dl>

<dl>
<dd>

**userId:** `String` - The user ID to filter tokens for

</dd>
</dl>

<dl>
<dd>

**pageSize:** `int` - Page size (default 10, max 30)

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination cursor for next page (empty string for first page)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## M2M

<details><summary><code>client.m2m().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">createOrganizationClient</a>(organizationId, client) -> CreateOrganizationClientResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new M2M (machine-to-machine) API client for an organization. The plain secret is returned only at creation time and cannot be retrieved again.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.OrganizationClient;

OrganizationClient orgClient = OrganizationClient.newBuilder()
  .setName("Production Service Account")
  .build();

client.m2m().createOrganizationClient("org_123", orgClient);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID to create the client for

</dd>
</dl>

<dl>
<dd>

**client:** `OrganizationClient` - Organization client proto with desired properties (name, scopes, audience, customClaims)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.m2m().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">getOrganizationClient</a>(organizationId, clientId) -> GetOrganizationClientResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves details of a specific M2M client.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.m2m().getOrganizationClient("org_123", "skc_xxxxx");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID (format: `skc_xxxxx`)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.m2m().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">updateOrganizationClient</a>(organizationId, clientId, client) -> UpdateOrganizationClientResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates the configuration of an existing M2M client.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.OrganizationClient;

OrganizationClient updates = OrganizationClient.newBuilder()
  .setName("Updated Service Account Name")
  .build();

client.m2m().updateOrganizationClient("org_123", "skc_xxxxx", updates);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID to update

</dd>
</dl>

<dl>
<dd>

**client:** `OrganizationClient` - Organization client proto with fields to update

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.m2m().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">deleteOrganizationClient</a>(organizationId, clientId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Permanently deletes an M2M client from an organization. This operation cannot be undone and all associated secrets are invalidated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.m2m().deleteOrganizationClient("org_123", "skc_xxxxx");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID to delete

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.m2m().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">createOrganizationClientSecret</a>(organizationId, clientId) -> CreateOrganizationClientSecretResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new secret for an M2M client. The plain secret value is returned only at creation time and cannot be retrieved again.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.m2m().createOrganizationClientSecret("org_123", "skc_xxxxx");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID to add a secret to

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.m2m().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">deleteOrganizationClientSecret</a>(organizationId, clientId, secretId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Permanently deletes a secret from an M2M client.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.m2m().deleteOrganizationClientSecret("org_123", "skc_xxxxx", "sks_xxxxx");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID

</dd>
</dl>

<dl>
<dd>

**secretId:** `String` - The secret ID to delete

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.m2m().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/M2MClient.java">listOrganizationClients</a>(organizationId, pageSize, pageToken) -> ListOrganizationClientsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists all M2M clients for an organization with pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.m2m().listOrganizationClients("org_123", 20, "");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**organizationId:** `String` - The organization ID

</dd>
</dl>

<dl>
<dd>

**pageSize:** `int` - Page size (between 10 and 100; 0 uses server default)

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination cursor for next page (null or empty string for first page)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Resources

Manage the resource clients scoped to a resource (such as an MCP server), and access the consents your end users grant against one. A consent records that one end user allowed a specific resource client to act on their behalf. Each consent identifies the user by `externalUserId` — the identifier your application supplied when the consent was granted.

Access via `client.resources()`.

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">getResource</a>(resourceId) -> GetResourceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves a single resource by id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse;

GetResourceResponse response = client.resources().getResource("res_142145647087190278");
System.out.println(response.getResource());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource to fetch (format: `res_xxxxx`). Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">listResources</a>(resourceType, pageSize, pageToken) -> ListResourcesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists resources of a given type in the environment, with pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse;
import com.scalekit.grpc.scalekit.v1.clients.ResourceType;

ListResourcesResponse response = client.resources().listResources(ResourceType.MCP_SERVER, 20, "");

System.out.println(response.getTotalSize() + " " + response.getResourcesList());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceType:** `ResourceType` - The type of resource to list. Required; `RESOURCE_TYPE_UNSPECIFIED` is rejected by the server.

</dd>
</dl>

<dl>
<dd>

**pageSize:** `int` - Max resources per page (0 uses server default; capped at 30 server-side)

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination cursor for next page (null or empty string for first page)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">createResourceClient</a>(resourceId, client) -> CreateResourceClientResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a resource client. Returns the created `client` and a `plainSecret` - the plaintext client secret, only available at creation time.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse;
import com.scalekit.grpc.scalekit.v1.clients.ResourceClient;

GetResourceResponse resourceResponse = client.resources().getResource("res_142145647087190278");
List<String> allowedScopes = resourceResponse.getResource().getScopesList().stream()
        .filter(Scope::getEnabled)
        .map(Scope::getName)
        .collect(Collectors.toList());

CreateResourceClientResponse response = client.resources().createResourceClient(
  "res_142145647087190278",
  ResourceClient.newBuilder().setName("My Resource Client").addAllScopes(allowedScopes).build()
);
System.out.println(response.getClient().getClientId() + " " + response.getPlainSecret());
```

`ResourceClient.newBuilder()` also accepts `setDescription`, `addAllCustomClaims`, `setExpiry` and `addAllRedirectUris` — see Parameters below.
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource to create the client for (format: `res_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**client:** `ResourceClient` - The desired client properties, built via `ResourceClient.newBuilder()`. Required.
- `setName(String)` - Human-readable name for the client. Defaults to "Resource Client" if omitted.
- `setDescription(String)` - Optional description.
- `addAllScopes(Iterable<String>)` / `addScopes(String)` - Scopes to grant. These scopes should be the same or a subset of the scopes available for the resource.
- `addAllCustomClaims(Iterable<CustomClaim>)` / `addCustomClaims(CustomClaim)` - Custom claims to embed in access tokens, as key/value pairs. Keep this to the essentials, since it increases token size.
- `setExpiry(long)` - Access token lifetime in seconds. Defaults to the resource's configured expiry, or one day.
- `addAllRedirectUris(Iterable<String>)` / `addRedirectUris(String)` - Allowed redirect URIs, for a pre-registered (non-DCR) client.
- `addAllAudience(Iterable<String>)` / `addAudience(String)` - Not usable through this SDK: audience is always server-determined, for any resource type. A non-empty value throws `IllegalArgumentException`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">getResourceClient</a>(resourceId, clientId) -> GetResourceClientResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches a single resource client, along with the end-users who have granted it consent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse;

GetResourceClientResponse response = client.resources().getResourceClient(
  "res_142145647087190278",
  "m2m_142145647087190278"
);

System.out.println(response.getClient().getName());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource the client must belong to (format: `res_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID (format: `m2m_xxxxx`). Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">listResourceClients</a>(resourceId) -> ListResourceClientsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists resource clients.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse;
import com.scalekit.grpc.scalekit.v1.clients.M2MClient;

ListResourceClientsResponse response = client.resources().listResourceClients("res_142145647087190278");

for (M2MClient resourceClient : response.getClientsList()) {
  System.out.println(resourceClient.getClientId());
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource whose clients to list (format: `res_xxxxx`). Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">updateResourceClient</a>(resourceId, clientId, options) -> UpdateResourceClientResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates a resource client.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.api.util.UpdateResourceClientOptions;
import com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse;
import com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse;

GetResourceResponse resourceResponse = client.resources().getResource("res_142145647087190278");
List<String> allowedScopes = resourceResponse.getResource().getScopesList().stream()
        .filter(Scope::getEnabled)
        .map(Scope::getName)
        .collect(Collectors.toList());

UpdateResourceClientResponse response = client.resources().updateResourceClient(
  "res_142145647087190278",
  "m2m_142145647087190278",
  UpdateResourceClientOptions.builder().scopes(allowedScopes).build()
);

System.out.println(response.getClient().getScopesList());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource the client must belong to (format: `res_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID to update (format: `m2m_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**options:** `UpdateResourceClientOptions` - Fields to change; a `null` field is left alone. Built via `UpdateResourceClientOptions.builder()`.
- `name(String)` - Updated name, if changing it. An empty string is a no-op server-side, not a clear.
- `description(String)` - Updated description, if changing it. An empty string is a no-op server-side, not a clear.
- `scopes(List<String>)` - Updated scopes, if changing them (replaces existing; pass an empty list to clear). These scopes should be the same or a subset of the scopes available for the resource.
- `customClaims(List<CustomClaim>)` - Updated custom claims, if changing them (replaces existing; pass an empty list to clear).
- `expiry(Long)` - Updated access token lifetime in seconds, if changing it.
- `redirectUris(List<String>)` - Updated redirect URIs, if changing them (replaces existing; pass an empty list to clear).

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">deleteResourceClient</a>(resourceId, clientId) -> DeleteResourceClientResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes resource clients. Throws if the client is missing or scoped to a different resource.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.resources().deleteResourceClient("res_142145647087190278", "m2m_142145647087190278");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource the client must belong to (format: `res_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID to delete (format: `m2m_xxxxx`). Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">createResourceClientSecret</a>(resourceId, clientId) -> CreateClientSecretResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new secret for a resource client. Only 2 client secrets are recommended to exist at a given point in time - use `deleteResourceClientSecret` to remove an existing one first if you need more.

The plaintext client secret is only ever returned here, at creation time.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse;

CreateClientSecretResponse response = client.resources().createResourceClientSecret("res_142145647087190278", "m2m_142145647087190278");
System.out.println(response.getPlainSecret());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource the client must belong to (format: `res_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID to create a secret for (format: `m2m_xxxxx`). Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">deleteResourceClientSecret</a>(resourceId, clientId, secretId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Permanently deletes a secret from a resource client. A client must always keep at least 1 secret - calling this on a client's last remaining secret throws an error.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.resources().deleteResourceClientSecret("res_142145647087190278", "m2m_142145647087190278", "sks_xxxxx");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource the client must belong to (format: `res_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**clientId:** `String` - The client ID the secret belongs to (format: `m2m_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**secretId:** `String` - The secret ID to delete (format: `sks_xxxxx`). Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">listUserConsents</a>(resourceId, options) -> ListResourceUserConsentsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the end-user consents granted against a resource, with pagination. Use this to audit who authorized a client, and to find the `consentId` you need before revoking.

Filter by user in one of two ways. Pass `userIds` to match external user IDs exactly and case-sensitively. Pass `search` for a case-insensitive substring match. When you give both, `userIds` wins and `search` is ignored.

Consents with `id`, `externalUserId`, `clientId`, `clientName`, `scopes`, and `grantedAt`, plus `totalSize` and the `nextPageToken` / `prevPageToken` cursors.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.grpc.scalekit.v1.clients.ListResourceUserConsentsResponse;
import com.scalekit.grpc.scalekit.v1.clients.ResourceUserConsent;

import java.util.Arrays;

ListResourceUserConsentsResponse response = client.resources().listUserConsents(
  "res_142145647087190278",
  ListUserConsentsOptions.builder()
    .pageSize(10)
    .userIds(Arrays.asList("usr_42", "usr_43"))
    .build()
);

for (ResourceUserConsent consent : response.getConsentsList()) {
  System.out.println(consent.getId() + " " + consent.getExternalUserId() + " " + consent.getClientName());
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**resourceId:** `String` - The resource to list consents for (format: `res_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**options:** `ListUserConsentsOptions` - Optional filter, search and pagination options. Pass `null` for no options.
- `search(String)` - Case-insensitive substring match on external user IDs. Ignored when `userIds` is set.
- `pageSize(int)` - Page size, max 30. 0 uses the server default.
- `pageToken(String)` - Pagination cursor from a previous response (`nextPageToken`/`prevPageToken`).
- `userIds(List<String>)` - Exact match on external user IDs, max 25. Takes precedence over `search`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.resources().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ResourceConsentClient.java">revokeUserConsent</a>(clientId, consentId) -> RevokeUserConsentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Revokes a single end-user consent held by a resource client.

Deletes the consent, so the client is prompted for consent again on its next authorization attempt, and revokes every active refresh token issued to that client for the same user. Access tokens already issued stay valid until they expire.

Note that `clientId` is the resource client that holds the consent (format: `m2m_xxxxx`), not the resource id. This matches the underlying route `DELETE /clients/{client_id}/consents/{consent_id}`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.resources().revokeUserConsent("m2m_142145647087190278", "usrcnst_142145647087190278");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**clientId:** `String` - The resource client holding the consent (format: `m2m_xxxxx`). Required.

</dd>
</dl>

<dl>
<dd>

**consentId:** `String` - The consent to revoke (format: `usrcnst_xxxxx`). Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Events

<details><summary><code>client.events().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/EventsClient.java">listEventsPaginated</a>(pageSize, pageToken) -> ListEventsPaginatedResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists environment events with cursor-based pagination, most-recent first.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ListEventsPaginatedResponse response = client.events().listEventsPaginated(10, "");
response.getEventsList().forEach(event -> System.out.println(event.getId()));
String next = response.getNextPageToken();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pageSize:** `int` - Number of events per page (defaults to 10 when <= 0)

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination cursor (null or empty string for the first page)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.events().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/EventsClient.java">listEventsPaginated</a>(filter, pageSize, pageToken) -> ListEventsPaginatedResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists environment events matching an `EventFilter` (event types, organization, time range, and more), with cursor-based pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
EventFilter filter = EventFilter.newBuilder()
  .setOrganizationId("org_123")
  .build();

ListEventsPaginatedResponse response = client.events().listEventsPaginated(filter, 10, "");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**filter:** `EventFilter` - Filter criteria (event types, organization ID, time range, source, connection/connected-account IDs)

</dd>
</dl>

<dl>
<dd>

**pageSize:** `int` - Number of events per page (defaults to 10 when <= 0)

</dd>
</dl>

<dl>
<dd>

**pageToken:** `String` - Pagination cursor (null or empty string for the first page)

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Login

<details><summary><code>client.login().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/LoginClient.java">updateLoginUserDetails</a>(connectionId, loginRequestId, user) -> UpdateLoginUserDetailsResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates the user details for an in-progress login request (e.g. after collecting additional profile information or marking the login as failed via `User.newBuilder().setLoginFailed(true)`), and returns an `UpdateLoginUserDetailsResult` whose `getAuthRequestId()` exposes the resulting auth request ID. The result is a wrapper type so future response fields can be added without changing the method signature.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
import com.scalekit.grpc.scalekit.v1.auth.User;
import com.scalekit.internal.http.UpdateLoginUserDetailsResult;

// Success path: both sub and email are required unless login_failed is true.
User user = User.newBuilder()
  .setSub("usr_01H...")
  .setEmail("user@example.com")
  .build();

UpdateLoginUserDetailsResult result = client.login().updateLoginUserDetails("conn_123", "lri_123", user);
String authRequestId = result.getAuthRequestId();

// Failure path: mark the login as failed instead of providing sub/email.
User failedUser = User.newBuilder()
  .setLoginFailed(true)
  .build();

UpdateLoginUserDetailsResult failedResult = client.login().updateLoginUserDetails("conn_123", "lri_123", failedUser);
String failedAuthRequestId = failedResult.getAuthRequestId();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionId:** `String` - The connection ID the login request belongs to

</dd>
</dl>

<dl>
<dd>

**loginRequestId:** `String` - The login request ID being updated

</dd>
</dl>

<dl>
<dd>

**user:** `User` - The user details to apply to the login request

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<!-- markdownlint-enable MD024 -->

## Tools

AgentKit lets your agents act on your users' third-party accounts. Added in 2.6.0, the `tools()`, `connectedAccounts()` and `actions()` clients take and return SDK-owned models from `com.scalekit.models.*` (no protobuf types), use `Optional` for absent values, and represent server-defined values such as account status as extensible enums (`value()` plus `known()`, with `_UNKNOWN` for values added later).

**Errors.** These clients throw unchecked subclasses of `APIException`, chosen by the gRPC status: `BadRequestException` (INVALID_ARGUMENT, FAILED_PRECONDITION, OUT_OF_RANGE), `NotFoundException`, `PermissionDeniedException`, `ConflictException` (ALREADY_EXISTS, ABORTED), `RateLimitException`, `AuthenticationException`, `ScalekitTimeoutException` (DEADLINE_EXCEEDED), `InternalServerException` (INTERNAL, UNKNOWN, DATA_LOSS, UNIMPLEMENTED, UNAVAILABLE; read `getGrpcStatusCode()` to tell them apart) and `ScalekitConnectionException` (CANCELLED, I/O failures, interrupts). A failed tool run (`getScalekitErrorCode()` is `TOOL_ERROR`) throws `ToolException` or one of `ToolUnauthorizedException`, `ToolForbiddenException`, `ToolRateLimitException`, with `toolErrorCode()`, `toolErrorMessage()` and `executionId()`. Invalid arguments throw `IllegalArgumentException` before any request. `getScalekitErrorCode()` gives the server's reason, for example `RESOURCE_ALREADY_EXISTS`; an `AuthenticationException` with `REAUTHENTICATION_NEEDED` means a connected account must be authorized again, not that your client credentials are wrong.

**Retries and timeouts.** Reads, updates and deletes are retried on UNAVAILABLE. Running a tool, the create calls, user verification and the proxy are never retried, because they may already have taken effect. When Scalekit rejects the SDK's own access token, the token is refreshed and the call retried once; tool and connected-account authentication failures are never retried. A retried delete whose first attempt succeeded surfaces `NotFoundException`. Listing, searching and running tools use a 60-second deadline (`ExecuteToolParams.DEFAULT_TIMEOUT`), which `timeout(Duration)` on the params changes per call; other calls use the client's default deadline.

<details><summary><code>client.tools().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ToolsClient.java">list</a>(params) -> ToolPage</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists one page of tools that match the filters. `list()` lists all tools. Iterate `page.autoPager()` to walk every page; later pages are fetched only when needed. With `summary(true)` the server returns names only: the items, and so the auto-pager, are empty; read `page.toolNames()`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ToolPage page = client.tools().list(ListToolsParams.builder()
        .connectionName("gmail")
        .identifier("user_123")
        .pageSize(50)
        .build());
for (Tool tool : page.autoPager()) {
    System.out.println(tool.definition().get("name"));
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListToolsParams` - Optional filters: `connectionName`, `identifier`, `provider`, `toolNames`, `query`, `connectedAccountId`, `summary`; paging: `pageSize`, `pageToken`; and `timeout` (default 60 s).

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tools().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ToolsClient.java">execute</a>(toolName, params) -> ExecuteToolResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Runs a tool on behalf of a connected account and returns its output. `data()` is the upstream response as JSON (an array is wrapped as `{"array": [...]}`, text as `{"result": "..."}`); `executionId()` identifies the run. Never retried: after an `InternalServerException` or `ScalekitTimeoutException` the tool may still have run.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ExecuteToolResult result = client.tools().execute("gmail_fetch_mails",
        ExecuteToolParams.builder()
                .connectionName("gmail")
                .identifier("user_123")
                .putToolInput("max_results", 5)
                .build());
Map<String, Object> data = result.data();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**toolName:** `String` - The tool's name. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `ExecuteToolParams` - Which account runs the tool (`connectedAccountId`, or `connectionName` + `identifier`, or `identifier` alone), the input (`toolInput` / `putToolInput`, JSON-compatible values) and `timeout` (default 60 s). May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
<details><summary><code>client.tools().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ToolsClient.java">search</a>(query, params) -> List&lt;SearchedTool&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Searches the tools of your environment's enabled connections by relevance and returns the complete, ranked result (the search is not paged). Each `SearchedTool` has `name()`, `provider()`, `description()` and `score()`. With an identifier, `connections()` lists, for each connection the identifier has used, whether the tool can run (`READY`, `NEEDS_CONNECTION`, `NEEDS_REAUTH`); without one it is empty, and a state the server did not evaluate is `NOT_EVALUATED`. `search(query)` uses the defaults. A blank query throws `IllegalArgumentException`; the query is sent as given (1 to 256 characters).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
List<SearchedTool> results = client.tools().search("send an email",
        SearchToolsParams.builder().identifier("user_123").topK(5).build());
for (SearchedTool tool : results) {
    for (ConnectionReadiness readiness : tool.connections()) {
        if (readiness.readinessState().known() == ToolReadinessState.Known.READY) {
            System.out.println(tool.name() + " runs through " + readiness.connectionName());
        }
    }
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**query:** `String` - What the tool should do, in plain words. Required; not blank.

</dd>
</dl>
<dl>
<dd>

**params:** `SearchToolsParams` - Optional. `identifier` (adds per-connection readiness and the identifier's custom MCP tools), `topK` (default 10, at most 50) and `timeout` (default 60 s). May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tools().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ToolsClient.java">listScoped</a>(identifier, params) -> Page&lt;ScopedTool&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the tools an identifier can run through its connected accounts, each with the account that runs it (`connectedAccountId()`). The server requires a filter, so `params` is required and its builder rejects an empty filter. The server applies tool names first, then providers, then connection names. A repeated provider, or more than one account for a provider, throws `BadRequestException`; no account for a requested provider or connection throws `NotFoundException`. `tool()` is an `Optional<Tool>`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Page<ScopedTool> page = client.tools().listScoped("user_123",
        ListScopedToolsParams.builder().addConnectionName("gmail").build());
for (ScopedTool scoped : page.autoPager()) {
    scoped.tool().ifPresent(tool -> System.out.println(tool.definition().get("name")));
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**identifier:** `String` - Your identifier for the user or tenant. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `ListScopedToolsParams` - Required. The filter: at least one of `providers`, `toolNames` or `connectionNames` (`addProvider`, `addToolName`, `addConnectionName`); paging: `pageSize`, `pageToken`; and `timeout` (default 60 s).

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tools().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ToolsClient.java">listAvailable</a>(identifier, params) -> Page&lt;Tool&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the tools of the providers an identifier has connected accounts with, whatever the accounts' status. An identifier without accounts gets an empty page, not an error. `listAvailable(identifier)` uses the defaults.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
for (Tool tool : client.tools().listAvailable("user_123",
        ListAvailableToolsParams.builder().pageSize(50).build()).autoPager()) {
    System.out.println(tool.definition().get("name"));
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**identifier:** `String` - Your identifier for the user or tenant. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `ListAvailableToolsParams` - Optional. Paging (`pageSize`, default 100; `pageToken`) and `timeout` (default 60 s). May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Connected Accounts

A connected account is one user's or tenant's account on a third-party service. Select an existing account with `ConnectedAccountRef.byId(id)` or `ConnectedAccountRef.of(connectionName, identifier)`. `NotFoundException` means the connection does not exist or no account matches the connection name and identifier; an account ID that does not exist is reported by the server as an internal error, so it surfaces as `InternalServerException`. Credentials (`authorizationDetails()`) and `apiConfig()` are returned by `get`, `create` and `update` when your environment returns them, never by `list`, and are never printed by `toString()`. Selecting accounts by organization or user ID is not available in Java; use the identifier (for example `"org_123/usr_456"`).

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">list</a>(params) -> Page&lt;ConnectedAccount&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists one page of connected accounts. `list()` lists all. Set either `connectionName` or `connectionNames`, not both. `pageSize` limits one page (the server allows up to 99).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Page<ConnectedAccount> page = client.connectedAccounts().list(ListConnectedAccountsParams.builder()
        .identifier("user_123")
        .build());
for (ConnectedAccount account : page.autoPager()) {
    System.out.println(account.id() + " " + account.status().value());
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListConnectedAccountsParams` - Optional `connectionName`, `connectionNames`, `identifier`, `provider`, `query`, `pageSize`, `pageToken`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">get</a>(account) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets a connected account, including its credentials when your environment returns them. An expired token is refreshed first; if the refresh fails the account comes back with status `EXPIRED`. Throws `NotFoundException` when the connection does not exist or no account matches the connection name and identifier; an unknown account ID throws `InternalServerException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.connectedAccounts().get(ConnectedAccountRef.of("gmail", "user_123"));
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">create</a>(connectionName, identifier, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a connected account. Without params it has no credentials and the user authorizes it through `getMagicLink`. Never retried. A duplicate throws `BadRequestException` with `RESOURCE_ALREADY_EXISTS`; a disabled connection throws `PermissionDeniedException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.connectedAccounts().create("freshdesk", "user_123",
        CreateConnectedAccountParams.builder()
                .authorizationDetails(AuthorizationDetails.staticAuth(
                        Collections.singletonMap("api_key", System.getenv("FRESHDESK_API_KEY"))))
                .apiConfig(Collections.singletonMap("domain", "acme"))
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionName:** `String` - The connection, for example `"gmail"`. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the account's owner (a user or tenant ID). Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateConnectedAccountParams` - Optional. `authorizationDetails` (OAuth token, static credentials, Google DWD or trusted IdP) and `apiConfig`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">update</a>(account, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Replaces the account's credentials and merges `apiConfig` into the stored configuration.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount updated = client.connectedAccounts().update(ConnectedAccountRef.byId("ca_123"),
        UpdateConnectedAccountParams.builder()
                .authorizationDetails(AuthorizationDetails.staticAuth(
                        Collections.singletonMap("api_key", System.getenv("FRESHDESK_API_KEY"))))
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
<dl>
<dd>

**params:** `UpdateConnectedAccountParams` - The new `authorizationDetails` and `apiConfig`. Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">delete</a>(account) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a connected account. Not idempotent: deleting a missing account fails, including when a retry follows a first attempt that succeeded (with `NotFoundException` when it is selected by connection name and identifier). Fails with `BadRequestException` (`MCP_SERVER_EXISTS_FOR_CONNECTED_ACCOUNT`) while an MCP server uses the account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.connectedAccounts().delete(ConnectedAccountRef.of("gmail", "user_123"));
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">getOrCreate</a>(connectionName, identifier, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the account, creating it when it does not exist. When it exists and `params` has credentials, it is updated with them (and `apiConfig`). When it is missing, it is created with the given credentials or an empty OAuth token for the user to authorize. `getOrCreate(connectionName, identifier)` passes no params. Two concurrent calls can race; the slower one gets `BadRequestException` (`RESOURCE_ALREADY_EXISTS`).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.connectedAccounts().getOrCreate("gmail", "user_123");
if (account.status().known() != ConnectedAccountStatus.Known.ACTIVE) {
    AuthorizationLink link = client.connectedAccounts().getMagicLink(ConnectedAccountRef.byId(account.id()));
    System.out.println(link.link());
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionName:** `String` - The connection, for example `"gmail"`. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the account's owner (a user or tenant ID). Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateConnectedAccountParams` - Optional. `authorizationDetails` (OAuth token, static credentials, Google DWD or trusted IdP) and `apiConfig`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">upsert</a>(connectionName, identifier, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as `getOrCreate`, with the same overloads.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.connectedAccounts().upsert("gmail", "user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionName:** `String` - The connection, for example `"gmail"`. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the account's owner (a user or tenant ID). Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateConnectedAccountParams` - Optional. `authorizationDetails` (OAuth token, static credentials, Google DWD or trusted IdP) and `apiConfig`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">getMagicLink</a>(account, params) -> AuthorizationLink</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a link that sends the user to authorize the account; the server creates the account when it is missing. `getMagicLink(account)` passes no params. The link is never printed by `toString()`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
AuthorizationLink link = client.connectedAccounts().getMagicLink(
        ConnectedAccountRef.of("gmail", "user_123"),
        AuthorizationLinkParams.builder()
                .state("csrf-token")
                .userVerifyUrl("https://app.example.com/connect/verify")
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
<dl>
<dd>

**params:** `AuthorizationLinkParams` - Optional `state` (returned to your app) and `userVerifyUrl` (where the user is sent so you can verify them).

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.connectedAccounts().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ConnectedAccountsClient.java">verifyUser</a>(authRequestId, identifier) -> UserVerificationResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Confirms that the user who authorized an account is the owner your app expects, and activates the account. Call it from your `userVerifyUrl` page. Never retried. A mismatched identifier throws `PermissionDeniedException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
UserVerificationResult result = client.connectedAccounts().verifyUser("auth_request_id_from_query", "user_123");
String next = result.postUserVerifyRedirectUrl().orElse("/");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**authRequestId:** `String` - The auth request ID passed to your verification page. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - The identifier of the user signed in to your app. Required; trimmed.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Actions

`client.actions()` is the agent-actions facade. Its tool and connected-account methods are the operations of [Tools](#tools) and [Connected Accounts](#connected-accounts) under the names the other Scalekit SDKs use; they behave and fail identically. It also gives access to [MCP configurations](#actions--mcp), [custom providers](#actions--custom-providers), the REST proxy (`request`) and resumable uploads to Google APIs (`uploadResumable`).

How the Node SDK's AgentKit methods map to Java (Java takes `connectionName` where Node takes `connector`, a `ConnectedAccountRef` instead of selector fields, and `…Params` builders instead of option objects):

| Node (`scalekit.…`) | Java |
|---|---|
| `tools.listTools` | `client.tools().list` / `client.actions().listTools` |
| `tools.executeTool` | `client.tools().execute` / `client.actions().executeTool` |
| `tools.searchTools` / `actions.searchTools` | `client.tools().search` / `client.actions().searchTools` |
| `tools.listScopedTools` / `actions.listScopedTools` | `client.tools().listScoped` / `client.actions().listScopedTools` |
| `tools.listAvailableTools` / `actions.listAvailableTools` | `client.tools().listAvailable` / `client.actions().listAvailableTools` |
| `connectedAccounts.listConnectedAccounts` | `client.connectedAccounts().list` / `client.actions().listConnectedAccounts` |
| `connectedAccounts.getConnectedAccountByIdentifier` | `client.connectedAccounts().get` / `client.actions().getConnectedAccount` |
| `connectedAccounts.createConnectedAccount` | `client.connectedAccounts().create` / `client.actions().createConnectedAccount` |
| `connectedAccounts.getOrCreateConnectedAccount`, `upsertConnectedAccount` | `client.connectedAccounts().getOrCreate`, `upsert` / `client.actions().getOrCreateConnectedAccount`, `upsertConnectedAccount` |
| `connectedAccounts.updateConnectedAccount` | `client.connectedAccounts().update` / `client.actions().updateConnectedAccount` |
| `connectedAccounts.deleteConnectedAccount` | `client.connectedAccounts().delete` / `client.actions().deleteConnectedAccount` |
| `connectedAccounts.getMagicLinkForConnectedAccount` | `client.connectedAccounts().getMagicLink` / `client.actions().getAuthorizationLink` |
| `connectedAccounts.verifyConnectedAccountUser` | `client.connectedAccounts().verifyUser` / `client.actions().verifyConnectedAccountUser` |
| `actions.mcp.*` | `client.actions().mcp().*` (same method names) |
| `actions.providers.createCustomProvider`, `updateCustomProvider`, `deleteCustomProvider`, `listProviders` | `client.actions().providers().*` (same method names) |
| `actions.listConnections` | `client.actions().listConnections` |
| `connection.listAppConnections`, `createEnvironmentConnection`, `getEnvironmentConnection`, `updateEnvironmentConnection` | `client.connections().*` (same method names) |
| `actions.request({ ..., timeoutMs })` | `client.actions().request(ProxyRequest)`, with `timeout(Duration)` |
| `actions.uploadResumable(params, options?)` | `client.actions().uploadResumable(ResumableUploadRequest)`; the options (`onProgress`, `maxRetries`, `timeoutMs`) are builder methods, and an interrupt replaces `signal` |

Differences worth knowing: the tool timeout is set per call (`timeout(Duration)` on the params), not on the client; `listScoped` requires a filter and `search` a non-blank query before any request; creating an environment connection always creates an app connection (the Java SDK does not create login connections) and is never retried; Java has separate exception classes per status family but folds UNAVAILABLE and UNIMPLEMENTED into `InternalServerException`; `getAuthorizationLink` requires an account ID or a connection name plus identifier; and the proxy does not follow redirects and throws `ProxyException` for statuses of 400 and above (the Python SDK returns the response instead).

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">mcp</a>() -> McpClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the client for [MCP configurations](#actions--mcp). Same instance on every call.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
McpClient mcp = client.actions().mcp();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">providers</a>() -> ProvidersClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the client for [custom providers](#actions--custom-providers). Same instance on every call.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ProvidersClient providers = client.actions().providers();
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

This method takes no parameters.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">listTools</a>(params) -> ToolPage</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as `client.tools().list`; `listTools()` lists all tools.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ToolPage page = client.actions().listTools(ListToolsParams.builder().connectionName("gmail").build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListToolsParams` - Optional filters, paging and timeout.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">executeTool</a>(toolName, params) -> ExecuteToolResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as `client.tools().execute`: runs a tool, never retried.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ExecuteToolResult result = client.actions().executeTool("gmail_fetch_mails",
        ExecuteToolParams.builder().connectionName("gmail").identifier("user_123")
                .putToolInput("max_results", 1).build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**toolName:** `String` - The tool's name. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `ExecuteToolParams` - Account selector, input and timeout. May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">getAuthorizationLink</a>(account, params) -> AuthorizationLink</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as `client.connectedAccounts().getMagicLink`; `getAuthorizationLink(account)` passes no params.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
AuthorizationLink link = client.actions().getAuthorizationLink(ConnectedAccountRef.of("gmail", "user_123"));
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
<dl>
<dd>

**params:** `AuthorizationLinkParams` - Optional `state` and `userVerifyUrl`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">verifyConnectedAccountUser</a>(authRequestId, identifier) -> UserVerificationResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as `client.connectedAccounts().verifyUser`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
UserVerificationResult result = client.actions().verifyConnectedAccountUser("auth_request_id_from_query", "user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**authRequestId:** `String` - The auth request ID passed to your verification page.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - The identifier of the user signed in to your app.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">listConnectedAccounts</a>(params) -> Page&lt;ConnectedAccount&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Connected Accounts](#connected-accounts). `listConnectedAccounts()` lists all.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Page<ConnectedAccount> page = client.actions().listConnectedAccounts(
        ListConnectedAccountsParams.builder().connectionName("gmail").build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListConnectedAccountsParams` - Optional filters and paging.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">getConnectedAccount</a>(account) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Connected Accounts](#connected-accounts).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.actions().getConnectedAccount(ConnectedAccountRef.byId("ca_123"));
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">createConnectedAccount</a>(connectionName, identifier, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Connected Accounts](#connected-accounts). `createConnectedAccount(connectionName, identifier)` passes no params.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.actions().createConnectedAccount("gmail", "user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionName:** `String` - The connection, for example `"gmail"`. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the account's owner (a user or tenant ID). Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateConnectedAccountParams` - Optional. `authorizationDetails` (OAuth token, static credentials, Google DWD or trusted IdP) and `apiConfig`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">getOrCreateConnectedAccount</a>(connectionName, identifier, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Connected Accounts](#connected-accounts). Also available without params.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.actions().getOrCreateConnectedAccount("gmail", "user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionName:** `String` - The connection, for example `"gmail"`. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the account's owner (a user or tenant ID). Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateConnectedAccountParams` - Optional. `authorizationDetails` (OAuth token, static credentials, Google DWD or trusted IdP) and `apiConfig`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">upsertConnectedAccount</a>(connectionName, identifier, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as `getOrCreateConnectedAccount`. Also available without params.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.actions().upsertConnectedAccount("gmail", "user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**connectionName:** `String` - The connection, for example `"gmail"`. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the account's owner (a user or tenant ID). Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateConnectedAccountParams` - Optional. `authorizationDetails` (OAuth token, static credentials, Google DWD or trusted IdP) and `apiConfig`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">updateConnectedAccount</a>(account, params) -> ConnectedAccount</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Connected Accounts](#connected-accounts).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ConnectedAccount account = client.actions().updateConnectedAccount(ConnectedAccountRef.byId("ca_123"),
        UpdateConnectedAccountParams.builder()
                .apiConfig(Collections.singletonMap("domain", "acme"))
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
<dl>
<dd>

**params:** `UpdateConnectedAccountParams` - The new credentials and configuration. Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">deleteConnectedAccount</a>(account) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Connected Accounts](#connected-accounts). Deleting a missing account selected by connection name and identifier throws `NotFoundException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.actions().deleteConnectedAccount(ConnectedAccountRef.of("gmail", "user_123"));
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**account:** `ConnectedAccountRef` - The account: `ConnectedAccountRef.byId("ca_...")` or `ConnectedAccountRef.of(connectionName, identifier)`. Values are trimmed; blank values throw `IllegalArgumentException`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">request</a>(request) -> ProxyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Calls a third-party API through Scalekit's proxy, which adds the connected account's credentials. The request goes to `<environment URL>/proxy<path>` with your client's access token and the `connection_name` and `identifier` headers; the response comes back unchanged.

- Any method works, including `PATCH`. Java 8 uses `HttpURLConnection`; Java 11+ uses `java.net.http`. On Java 16+ without the `java.net.http` module (a custom runtime image, or a module path that does not resolve it), methods other than GET, POST, HEAD, OPTIONS, PUT, DELETE and TRACE throw `UnsupportedOperationException` before any request; add `--add-modules java.net.http`.
- At most one body (`jsonBody`, `formBody` or `rawBody`), and none on GET or HEAD. `Host`, `Content-Length`, `Connection`, `Expect` and `Upgrade` cannot be set. Your `Authorization`, `connection_name` and `identifier` headers are replaced by the SDK's.
- Redirects are not followed: a 3xx is returned as is. A status of 400 or above throws `ProxyException` with the full response, plus `proxyErrorCode()` / `proxyErrorDetail()` when Scalekit's proxy rejected the request (for example `TOOL_PROXY_DISABLED` or `NOT_FOUND`).
- Never retried. Only when Scalekit rejects the SDK's own token before anything is forwarded (a 401 with a JSON content type and a body of exactly `{"detail": ..., "code": "UNAUTHORIZED"}`) is the token refreshed and the request sent once more; an upstream 401 is never resent. The resend does not happen:
  - within 5 seconds of the SDK fetching a token, because the token cache does not refresh again that soon. This includes the first proxy call of a client that has made no other call yet: the rejection is thrown as `ProxyException`.
  - on Java 8 (or wherever `HttpURLConnection` is used), for POST, PUT, PATCH and other non-standard methods, with or without a body. These requests are streamed, and `HttpURLConnection` then discards the 401's body, so the SDK cannot tell Scalekit's rejection from the upstream API's: it throws `ProxyException` without a body and refreshes the token for the next call.
- The deadline is 60 seconds unless `timeout(Duration)` sets one. On Java 8 it applies to connecting and to each read. A timeout throws `ScalekitTimeoutException`; a connection failure or interrupt throws `ScalekitConnectionException`. On Java 8 an interrupt that arrives while the request is in flight takes effect only when the request finishes or times out.
- `ProxyRequest` rejects, before any request: header values, `connectionName` or `identifier` with characters outside printable US-ASCII (`java.net.http` would send them as `?`), and a path containing `#` or `.`/`..` segments, also once percent-decoded or with `\` read as `/` (`%2e%2e`, `a%2F..%2Fb`, `a\..\b`). A path that would resolve outside `<environment URL>/proxy/` is never sent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
ProxyResponse profile = client.actions().request(
        ProxyRequest.builder("gmail", "user_123", "/gmail/v1/users/me/profile").build());
String email = (String) profile.bodyAsJsonObject().get("emailAddress");

ProxyResponse posted = client.actions().request(
        ProxyRequest.builder("slack", "user_123", "/api/chat.postMessage")
                .method("POST")
                .jsonBody(Collections.singletonMap("text", "hello"))
                .timeout(Duration.ofSeconds(30))
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ProxyRequest` - Built with `ProxyRequest.builder(connectionName, identifier, path)`; optional `method` (default GET), `queryParam`, `header`, one body, `timeout`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">uploadResumable</a>(request) -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Uploads a file of any size to a Google API that supports resumable uploads (Drive `/upload/drive/v3/files`, Cloud Storage `/upload/storage/v1/b/<bucket>/o`, YouTube `/upload/youtube/v3/videos`) through Scalekit's proxy, which adds the connected account's credentials. The content is sent in chunks (4 MiB by default), so each request stays short, and a failed chunk resumes from the bytes the server committed instead of restarting. Returns the final response's JSON object, such as the Drive file (an empty map when the body is empty).

- **Content:** exactly one of `content(byte[])` (not copied), `content(Path)` (size read at `build()`; the SDK opens and closes the file), `content(InputStream, long totalBytes)` or `content(InputStream)` (unknown size, read to its end). A stream is never closed by the SDK. About one chunk is held in memory at a time (resending the rest of a partly committed chunk briefly copies it). A stream or file whose length differs from its declared size throws `IllegalStateException` before the last chunk is sent; a read failure throws `UncheckedIOException`.
- **Session start:** `POST` by default; `PATCH` (Drive: replace an existing file's content, path `/upload/drive/v3/files/<fileId>`) and `PUT` are also accepted, in any case. The SDK sends `uploadType=resumable`, your `queryParam`s (for example YouTube's `part` or Drive's `supportsAllDrives`; `uploadType` itself is rejected, matched exactly), `X-Upload-Content-Type`, `X-Upload-Content-Length` when the size is known (a stream that fits in one chunk counts), and `metadata` as a JSON body. It is never retried, because a second request would open a second session; a failure throws `UploadException` with no upload ID.
- **Chunks:** `PUT` with `Content-Range`; until a stream of unknown size ends, chunks carry no total (`bytes a-b/*`). `chunkSize` must be a positive multiple of 256 KiB. Empty content is one empty `PUT`.
- **Retries:** after a timeout, a connection failure, HTTP 408, 429, 500, 502, 503 or 504, or (on Java 8, where `HttpURLConnection` discards it) a 401 whose body cannot be read, the SDK waits (exponential backoff with full jitter, at most 1 s before the first retry and 30 s at most; or `Retry-After` on 429/503, capped at 30 s), asks the server how many bytes it has, and continues from there. A 308 that commits no new bytes counts as one failure, and the chunk is resent from the offset it reports. A chunk may fail `maxRetries` times in a row (default 3); the count resets only when the committed offset passes the highest one so far. When the server commits part of a chunk, the rest of that chunk is sent next.
- **Errors:** HTTP 404 or 410 to a chunk throws `UploadSessionExpiredException` (the SDK does not start a new session); another 4xx, a 2xx other than 200/201, or retries running out on an HTTP status throw `UploadException`; retries running out on timeouts or connection failures throw `ScalekitTimeoutException` / `ScalekitConnectionException`; responses that break the protocol (no `upload_id`, a bad `Range`, completion before the final chunk, a final body that is not a JSON object) throw `UploadProtocolException`. Upload errors carry `uploadId()`, `bytesCommitted()` and, when there was one, the response.
- **Progress:** `onProgress` is called on the uploading thread each time more bytes are committed and once on completion with the total; an exception it throws stops the upload and propagates.
- `timeout` (default 60 s) applies to each request, not to the whole upload. An interrupt stops the upload before the next request or during a wait (on Java 11+ also during a request) with `ScalekitConnectionException`. An upload that stops cannot be resumed by a later call.
- The path follows `ProxyRequest`'s rules and must not contain `?`, a space, a control character or DEL (percent-encode them).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Map<String, Object> file = client.actions().uploadResumable(
        ResumableUploadRequest.builder("googledrive", "user_123", "/upload/drive/v3/files")
                .content(Paths.get("big.mp4"))
                .contentType("video/mp4")
                .metadata(Collections.singletonMap("name", "big.mp4"))
                .onProgress(p -> System.out.println(p.bytesCommitted() + " bytes uploaded"))
                .build());
String fileId = (String) file.get("id");

try {
    client.actions().uploadResumable(
            ResumableUploadRequest.builder("googledrive", "user_123", "/upload/drive/v3/files/" + fileId)
                    .method("PATCH")
                    .content(inputStream)
                    .build());
} catch (UploadSessionExpiredException e) {
    // the session is gone: upload again from the start
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ResumableUploadRequest` - Built with `ResumableUploadRequest.builder(connectionName, identifier, path)` and one `content(...)`; optional `method` (default POST), `contentType` (default `application/octet-stream`), `metadata`, `queryParam`, `chunkSize` (default 4 MiB), `maxRetries` (default 3), `timeout` (default 60 s), `onProgress`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">searchTools</a>(query, params) -> List&lt;SearchedTool&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Tools](#tools). Calls `client.tools().search`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
List<SearchedTool> results = client.actions().searchTools("create a calendar event");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**query:** `String` - What the tool should do. Required; not blank.

</dd>
</dl>
<dl>
<dd>

**params:** `SearchToolsParams` - Optional. `identifier` (adds per-connection readiness and the identifier's custom MCP tools), `topK` (default 10, at most 50) and `timeout` (default 60 s). May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">listScopedTools</a>(identifier, params) -> Page&lt;ScopedTool&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Tools](#tools). Calls `client.tools().listScoped`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Page<ScopedTool> page = client.actions().listScopedTools("user_123",
        ListScopedToolsParams.builder().addProvider("GMAIL").build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**identifier:** `String` - Your identifier for the user or tenant. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `ListScopedToolsParams` - Required. The filter: at least one of `providers`, `toolNames` or `connectionNames` (`addProvider`, `addToolName`, `addConnectionName`); paging: `pageSize`, `pageToken`; and `timeout` (default 60 s).

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">listAvailableTools</a>(identifier, params) -> Page&lt;Tool&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Same as the matching method of [Tools](#tools). Calls `client.tools().listAvailable`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Page<Tool> page = client.actions().listAvailableTools("user_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**identifier:** `String` - Your identifier for the user or tenant. Required; trimmed.

</dd>
</dl>
<dl>
<dd>

**params:** `ListAvailableToolsParams` - Optional. Paging (`pageSize`, default 100; `pageToken`) and `timeout` (default 60 s). May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ActionsClient.java">listConnections</a>(params) -> Page&lt;AppConnection&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists one page of your environment's app connections: the connections your users' connected accounts belong to. Same as `client.connections().listAppConnections`; see [Connections](#connections).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
for (AppConnection connection : client.actions().listConnections().autoPager()) {
    System.out.println(connection.connectionName() + " (" + connection.provider() + ")");
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListAppConnectionsParams` - Optional. `provider`, `query` (3 to 100 characters), `pageSize` (at most 30) and `pageToken`. May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Actions › MCP

MCP configurations are named sets of connections and tools that Scalekit serves to agents as one MCP server. Reach them with `client.actions().mcp()`.

<details><summary><code>client.actions().mcp().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/McpClient.java">createConfig</a>(name, params) -> McpConfig</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an MCP configuration. The server requires at least one connection-tool mapping (at most 25); an empty tool list exposes every tool of the connection. A taken name throws `BadRequestException` (`DUPLICATE_IDENTIFIER`). Never retried. `mcpServerUrl()` is empty when your environment does not expose one.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
McpConfig config = client.actions().mcp().createConfig("support_agent",
        CreateMcpConfigParams.builder()
                .description("Mail tools for the support agent")
                .addConnectionToolMapping(McpConnectionToolMapping.of("gmail",
                        Arrays.asList("gmail_fetch_mails", "gmail_send_email")))
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` - Lower-case letters, digits, `_` and `-`; unique. Required.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateMcpConfigParams` - `description` and `connectionToolMappings`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().mcp().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/McpClient.java">getConfig</a>(configId) -> McpConfig</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets an MCP configuration. Throws `NotFoundException` when it does not exist.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
McpConfig config = client.actions().mcp().getConfig("config_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**configId:** `String` - The configuration ID. Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().mcp().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/McpClient.java">listConfigs</a>(params) -> Page&lt;McpConfig&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists one page of MCP configurations; `listConfigs()` lists all. `search` needs at least 3 characters; `pageSize` is at most 30.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
for (McpConfig config : client.actions().mcp().listConfigs(
        ListMcpConfigsParams.builder().search("support").build()).autoPager()) {
    System.out.println(config.name());
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListMcpConfigsParams` - Optional `search`, `pageSize`, `pageToken`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().mcp().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/McpClient.java">updateConfig</a>(configId, params) -> McpConfig</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates the description or mappings. The name cannot change. A blank description leaves the stored one; mappings, when given, replace the stored ones as a whole.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
McpConfig updated = client.actions().mcp().updateConfig("config_id",
        UpdateMcpConfigParams.builder().description("Updated").build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**configId:** `String` - The configuration ID. Required.

</dd>
</dl>
<dl>
<dd>

**params:** `UpdateMcpConfigParams` - `description` and `connectionToolMappings`. Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().mcp().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/McpClient.java">deleteConfig</a>(configId) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an MCP configuration. Deleting a missing one throws `NotFoundException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.actions().mcp().deleteConfig("config_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**configId:** `String` - The configuration ID. Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().mcp().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/McpClient.java">listConnectedAccounts</a>(configId, identifier, params) -> List&lt;McpConnectionAuthState&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists, for one user, the state of their account on each connection of the configuration. The list is complete (not paged). With `includeAuthLink(true)` each connection the user still has to authorize gets a link; this creates pending accounts where none exist.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
List<McpConnectionAuthState> states = client.actions().mcp().listConnectedAccounts("config_id", "user_123",
        ListMcpConnectedAccountsParams.builder().includeAuthLink(true).build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**configId:** `String` - The configuration ID. Required.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the user. Required.

</dd>
</dl>
<dl>
<dd>

**params:** `ListMcpConnectedAccountsParams` - Optional `includeAuthLink`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().mcp().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/McpClient.java">createSessionToken</a>(mcpConfigId, identifier, params) -> McpSessionToken</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a token that lets an agent call the configuration's MCP server for one user. The lifetime defaults to one hour; the server accepts 60 seconds to 24 hours. Never retried. The token is never printed by `toString()`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
McpSessionToken token = client.actions().mcp().createSessionToken("config_id", "user_123",
        CreateMcpSessionTokenParams.builder().expiry(Duration.ofMinutes(15)).build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**mcpConfigId:** `String` - The configuration ID. Required.

</dd>
</dl>
<dl>
<dd>

**identifier:** `String` - Your identifier for the user. Required.

</dd>
</dl>
<dl>
<dd>

**params:** `CreateMcpSessionTokenParams` - Optional `expiry` (a positive `Duration`).

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Actions › Custom Providers

Custom providers are connectors you define for services Scalekit does not ship. Reach them with `client.actions().providers()`, which also lists the providers Scalekit ships (`listProviders`). An auth pattern's or field's attributes that the SDK does not model are kept in `additionalProperties()` and sent back unchanged, so `provider.authPatterns()` can be passed straight to an update.

<details><summary><code>client.actions().providers().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ProvidersClient.java">createCustomProvider</a>(request) -> Provider</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a custom provider. `proxyEnabled` defaults to `true`. The returned `identifier()` names the provider in later calls. Never retried.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Provider provider = client.actions().providers().createCustomProvider(
        CustomProviderRequest.builder("Acme CRM", "https://api.acme.example")
                .addAuthPattern(AuthPattern.builder(AuthPatternType.BEARER, "API token")
                        .addField(AuthField.builder("token").label("Token").inputType("password").required(true).build())
                        .build())
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CustomProviderRequest` - Built with `CustomProviderRequest.builder(displayName, proxyUrl)`; `description`, `proxyEnabled`, `authPatterns`, `iconSrc`, `metadata`.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().providers().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ProvidersClient.java">updateCustomProvider</a>(identifier, request) -> Provider</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Replaces the provider's definition (PUT semantics): `proxyEnabled` is always sent and defaults to `true`, leaving `metadata` out clears it, and the server requires the auth patterns. Start from the stored values when you change one field.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Provider provider = client.actions().providers().createCustomProvider(
        CustomProviderRequest.builder("Acme CRM", "https://api.acme.example").build());
Provider updated = client.actions().providers().updateCustomProvider(provider.identifier(),
        CustomProviderRequest.builder(provider.displayName(), provider.proxyUrl().orElse("https://api.acme.example"))
                .description("CRM for the sales agent")
                .proxyEnabled(provider.proxyEnabled())
                .authPatterns(provider.authPatterns())
                .metadata(provider.metadata())
                .build());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**identifier:** `String` - The provider's `identifier()`. Required.

</dd>
</dl>
<dl>
<dd>

**request:** `CustomProviderRequest` - The full new definition.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.actions().providers().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ProvidersClient.java">deleteCustomProvider</a>(identifier) -> void</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes a custom provider. Fails with `BadRequestException` (`PROVIDER_HAS_EXISTING_CONNECTIONS`) while connections use it; a missing provider throws `NotFoundException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.actions().providers().deleteCustomProvider("ACMECRM:env_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**identifier:** `String` - The provider's `identifier()`. Required.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
<details><summary><code>client.actions().providers().<a href="https://github.com/scalekit-inc/scalekit-sdk-java/blob/main/src/main/java/com/scalekit/api/ProvidersClient.java">listProviders</a>(params) -> Page&lt;Provider&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists one page of providers. Without a type the server lists the providers Scalekit ships; `ProviderType.CUSTOM` lists your custom providers and `ProviderType.ALL` both. `listProviders()` uses the defaults. An invalid identifier throws `BadRequestException`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
Page<Provider> page = client.actions().providers().listProviders(ListProvidersParams.builder()
        .providerType(ProviderType.CUSTOM)
        .pageSize(20)
        .build());
for (Provider provider : page.autoPager()) {
    System.out.println(provider.identifier() + ": " + provider.displayName());
}
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**params:** `ListProvidersParams` - Optional. `providerType` (`DEFAULT`, `CUSTOM` or `ALL`), `identifier` (one provider), `pageSize` (default 10) and `pageToken`. May be null.

</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
