# Reference

## ScalekitClient

<details><summary><code>new <a href="/src/main/java/com/scalekit/ScalekitClient.java">ScalekitClient</a>(siteName, clientId, clientSecret) -> ScalekitClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new Scalekit client instance configured for your environment, and provides access to all API clients (organizations, users, connections, directories, etc).
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">organizations</a>() -> OrganizationClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns an <a href="/src/main/java/com/scalekit/api/OrganizationClient.java">OrganizationClient</a> for managing organizations (tenants).
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">connections</a>() -> ConnectionClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/ConnectionClient.java">ConnectionClient</a> for managing SSO connections.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">users</a>() -> UserClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/UserClient.java">UserClient</a> for managing users and org memberships.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">domains</a>() -> DomainClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/DomainClient.java">DomainClient</a> for managing organization domains.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">directories</a>() -> DirectoryClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/DirectoryClient.java">DirectoryClient</a> for managing directories and directory resources (users/groups).
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">sessions</a>() -> SessionClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/SessionClient.java">SessionClient</a> for session retrieval and revocation.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">roles</a>() -> RoleClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/RoleClient.java">RoleClient</a> for environment and organization role management.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">permissions</a>() -> PermissionClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/PermissionClient.java">PermissionClient</a> for permission management and role-permission relationships.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">passwordless</a>() -> PasswordlessClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/PasswordlessClient.java">PasswordlessClient</a> for passwordless auth flows (magic links / OTP).
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">webAuthn</a>() -> WebAuthnClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/api/WebAuthnClient.java">WebAuthnClient</a> for WebAuthn credential management.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">authentication</a>() -> AuthClient</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns an <a href="/src/main/java/com/scalekit/api/AuthClient.java">AuthClient</a> for OAuth flows, token validation, and token exchange.
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

<details><summary><code>client.<a href="/src/main/java/com/scalekit/ScalekitClient.java">webhook</a>() -> Webhook</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a <a href="/src/main/java/com/scalekit/webhooks/Webhook.java">Webhook</a> verifier for validating Scalekit webhook payload signatures.
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

<details><summary><code>client.webhook().<a href="/src/main/java/com/scalekit/webhooks/Webhook.java">verifyWebhookPayload</a>(secret, headers, payload) -> boolean</code></summary>
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

<details><summary><code>new <a href="/src/main/java/com/scalekit/webhooks/ScalekitInterceptor.java">ScalekitInterceptor</a>().verifyInterceptorPayload(secret, headers, payload) -> boolean</code></summary>
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

## Organizations

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">create</a>(organization) -> Organization</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">getById</a>(id) -> Organization</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">getByExternalId</a>(externalId) -> Organization</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">updateById</a>(id, organization) -> Organization</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">updateByExternalId</a>(externalId, organization) -> Organization</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">deleteById</a>(id) -> void</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">deleteByExternalId</a>(externalId) -> void</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">listOrganizations</a>(pageSize, pageToken) -> ListOrganizationsResponse</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">generatePortalLink</a>(organizationId) -> Link</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">generatePortalLink</a>(organizationId, features) -> Link</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">updateOrganizationSettings</a>(organizationId, settings) -> Organization</code></summary>
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

<details><summary><code>client.organizations().<a href="/src/main/java/com/scalekit/api/OrganizationClient.java">upsertUserManagementSettings</a>(organizationId, settings) -> OrganizationUserManagementSettings</code></summary>
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

<details><summary><code>client.connections().<a href="/src/main/java/com/scalekit/api/ConnectionClient.java">getConnectionById</a>(connectionId, organizationId) -> Connection</code></summary>
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

<details><summary><code>client.connections().<a href="/src/main/java/com/scalekit/api/ConnectionClient.java">listConnectionsByDomain</a>(domain) -> ListConnectionsResponse</code></summary>
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

<details><summary><code>client.connections().<a href="/src/main/java/com/scalekit/api/ConnectionClient.java">listConnectionsByOrganization</a>(organizationId) -> ListConnectionsResponse</code></summary>
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

<details><summary><code>client.connections().<a href="/src/main/java/com/scalekit/api/ConnectionClient.java">enableConnection</a>(connectionId, organizationId) -> ToggleConnectionResponse</code></summary>
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

<details><summary><code>client.connections().<a href="/src/main/java/com/scalekit/api/ConnectionClient.java">disableConnection</a>(connectionId, organizationId) -> ToggleConnectionResponse</code></summary>
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

<details><summary><code>client.connections().<a href="/src/main/java/com/scalekit/api/ConnectionClient.java">createConnection</a>(organizationId, connection) -> Connection</code></summary>
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

<details><summary><code>client.connections().<a href="/src/main/java/com/scalekit/api/ConnectionClient.java">deleteConnection</a>(connectionId, organizationId) -> void</code></summary>
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

## Users

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">createUserAndMembership</a>(organizationId, request) -> CreateUserAndMembershipResponse</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">getUser</a>(userId) -> GetUserResponse</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">listUsers</a>(request) -> ListUsersResponse</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">updateUser</a>(userId, request) -> UpdateUserResponse</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">deleteUser</a>(userId) -> void</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">createMembership</a>(organizationId, userId, request) -> CreateMembershipResponse</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">deleteMembership</a>(organizationId, userId) -> void</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">updateMembership</a>(organizationId, userId, request) -> UpdateMembershipResponse</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">listOrganizationUsers</a>(organizationId, request) -> ListOrganizationUsersResponse</code></summary>
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

<details><summary><code>client.users().<a href="/src/main/java/com/scalekit/api/UserClient.java">resendInvite</a>(organizationId, userId) -> ResendInviteResponse</code></summary>
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

<details><summary><code>client.domains().<a href="/src/main/java/com/scalekit/api/DomainClient.java">createDomain</a>(organizationId, domainName) -> Domain</code></summary>
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

<details><summary><code>client.domains().<a href="/src/main/java/com/scalekit/api/DomainClient.java">createDomain</a>(organizationId, domainName, domainType) -> Domain</code></summary>
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

<details><summary><code>client.domains().<a href="/src/main/java/com/scalekit/api/DomainClient.java">createDomain</a>(request) -> Domain</code></summary>
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

<details><summary><code>client.domains().<a href="/src/main/java/com/scalekit/api/DomainClient.java">getDomainById</a>(organizationId, domainId) -> Domain</code></summary>
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

<details><summary><code>client.domains().<a href="/src/main/java/com/scalekit/api/DomainClient.java">listDomainsByOrganizationId</a>(organizationId) -> List&lt;Domain&gt;</code></summary>
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

<details><summary><code>client.domains().<a href="/src/main/java/com/scalekit/api/DomainClient.java">listDomainsByOrganizationId</a>(organizationId, domainType) -> List&lt;Domain&gt;</code></summary>
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

<details><summary><code>client.domains().<a href="/src/main/java/com/scalekit/api/DomainClient.java">deleteDomain</a>(organizationId, domainId) -> void</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">getDirectory</a>(directoryId, organizationId) -> Directory</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">listDirectories</a>(organizationId) -> ListDirectoriesResponse</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">listDirectoryUsers</a>(directoryId, organizationId, options) -> ListDirectoryUserResponse</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">listDirectoryGroups</a>(directoryId, organizationId, options) -> ListDirectoryGroupResponse</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">enableDirectory</a>(directoryId, organizationId) -> ToggleDirectoryResponse</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">disableDirectory</a>(directoryId, organizationId) -> ToggleDirectoryResponse</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">getPrimaryDirectoryByOrganizationId</a>(organizationId) -> Directory</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">createDirectory</a>(organizationId, directory) -> Directory</code></summary>
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

<details><summary><code>client.directories().<a href="/src/main/java/com/scalekit/api/DirectoryClient.java">deleteDirectory</a>(directoryId, organizationId) -> void</code></summary>
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

<details><summary><code>client.sessions().<a href="/src/main/java/com/scalekit/api/SessionClient.java">getSession</a>(sessionId) -> SessionDetails</code></summary>
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

<details><summary><code>client.sessions().<a href="/src/main/java/com/scalekit/api/SessionClient.java">getUserSessions</a>(userId, pageSize, pageToken, filter) -> UserSessionDetails</code></summary>
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

<details><summary><code>client.sessions().<a href="/src/main/java/com/scalekit/api/SessionClient.java">revokeSession</a>(sessionId) -> RevokeSessionResponse</code></summary>
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

<details><summary><code>client.sessions().<a href="/src/main/java/com/scalekit/api/SessionClient.java">revokeAllUserSessions</a>(userId) -> RevokeAllUserSessionsResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">createRole</a>(request) -> CreateRoleResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">getRole</a>(roleName) -> GetRoleResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">listRoles</a>() -> ListRolesResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">updateRole</a>(roleName, request) -> UpdateRoleResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">deleteRole</a>(roleName) -> void</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">deleteRole</a>(roleName, reassignRoleName) -> void</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">getRoleUsersCount</a>(roleName) -> GetRoleUsersCountResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">createOrganizationRole</a>(orgId, request) -> CreateOrganizationRoleResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">getOrganizationRole</a>(orgId, roleName) -> GetOrganizationRoleResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">listOrganizationRoles</a>(orgId) -> ListOrganizationRolesResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">updateOrganizationRole</a>(orgId, roleName, request) -> UpdateOrganizationRoleResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">deleteOrganizationRole</a>(orgId, roleName) -> void</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">deleteOrganizationRole</a>(orgId, roleName, reassignRoleName) -> void</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">updateDefaultOrganizationRoles</a>(orgId, request) -> UpdateDefaultOrganizationRolesResponse</code></summary>
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

<details><summary><code>client.roles().<a href="/src/main/java/com/scalekit/api/RoleClient.java">deleteRoleBase</a>(roleName) -> void</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">createPermission</a>(request) -> CreatePermissionResponse</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">getPermission</a>(permissionName) -> GetPermissionResponse</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">listPermissions</a>() -> ListPermissionsResponse</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">listPermissions</a>(pageToken) -> ListPermissionsResponse</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">updatePermission</a>(permissionName, request) -> UpdatePermissionResponse</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">deletePermission</a>(permissionName) -> void</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">listRolePermissions</a>(roleName) -> ListRolePermissionsResponse</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">addPermissionsToRole</a>(roleName, request) -> AddPermissionsToRoleResponse</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">removePermissionFromRole</a>(roleName, permissionName) -> void</code></summary>
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

<details><summary><code>client.permissions().<a href="/src/main/java/com/scalekit/api/PermissionClient.java">listEffectiveRolePermissions</a>(roleName) -> ListEffectiveRolePermissionsResponse</code></summary>
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

<details><summary><code>client.passwordless().<a href="/src/main/java/com/scalekit/api/PasswordlessClient.java">sendPasswordlessEmail</a>(email, options) -> SendPasswordlessResponse</code></summary>
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

<details><summary><code>client.passwordless().<a href="/src/main/java/com/scalekit/api/PasswordlessClient.java">sendPasswordlessEmail</a>(email) -> SendPasswordlessResponse</code></summary>
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

<details><summary><code>client.passwordless().<a href="/src/main/java/com/scalekit/api/PasswordlessClient.java">verifyPasswordlessEmail</a>(credential, authRequestId) -> VerifyPasswordLessResponse</code></summary>
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

<details><summary><code>client.passwordless().<a href="/src/main/java/com/scalekit/api/PasswordlessClient.java">verifyPasswordlessEmail</a>(credential) -> VerifyPasswordLessResponse</code></summary>
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

<details><summary><code>client.passwordless().<a href="/src/main/java/com/scalekit/api/PasswordlessClient.java">resendPasswordlessEmail</a>(authRequestId) -> SendPasswordlessResponse</code></summary>
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

<details><summary><code>client.webAuthn().<a href="/src/main/java/com/scalekit/api/WebAuthnClient.java">listCredentials</a>(userId) -> ListCredentialsResponse</code></summary>
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

<details><summary><code>client.webAuthn().<a href="/src/main/java/com/scalekit/api/WebAuthnClient.java">updateCredential</a>(credentialId, displayName) -> UpdateCredentialResponse</code></summary>
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

<details><summary><code>client.webAuthn().<a href="/src/main/java/com/scalekit/api/WebAuthnClient.java">deleteCredential</a>(credentialId) -> DeleteCredentialResponse</code></summary>
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

<details><summary><code>client.authentication().<a href="/src/main/java/com/scalekit/api/AuthClient.java">getAuthorizationUrl</a>(redirectUri, options) -> URL</code></summary>
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

<details><summary><code>client.authentication().<a href="/src/main/java/com/scalekit/api/AuthClient.java">authenticateWithCode</a>(code, redirectUri, options) -> AuthenticationResponse</code></summary>
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

<details><summary><code>client.authentication().<a href="/src/main/java/com/scalekit/api/AuthClient.java">getIdpInitiatedLoginClaims</a>(idpInitiatedLoginToken) -> IdpInitiatedLoginClaims</code></summary>
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

<details><summary><code>client.authentication().<a href="/src/main/java/com/scalekit/api/AuthClient.java">refreshAccessToken</a>(refreshToken) -> AuthenticationResponse</code></summary>
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

<details><summary><code>client.authentication().<a href="/src/main/java/com/scalekit/api/AuthClient.java">validateAccessToken</a>(jwt) -> boolean</code></summary>
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

<details><summary><code>client.authentication().<a href="/src/main/java/com/scalekit/api/AuthClient.java">validateAccessTokenAndGetClaims</a>(jwt) -> Map&lt;String, Object&gt;</code></summary>
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

<details><summary><code>client.authentication().<a href="/src/main/java/com/scalekit/api/AuthClient.java">getClientAccessToken</a>() -> String</code></summary>
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
