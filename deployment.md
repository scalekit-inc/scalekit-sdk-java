# Deployment Guide

This SDK is published to Maven Central via the [Sonatype Central Portal](https://central.sonatype.com), under the `com.scalekit` namespace. Publishing is **not automated in CI** — there is no `release.yml`/`publish.yml` workflow. It is a manual `mvn deploy` run from a maintainer's machine, using the `central-publishing-maven-plugin` and `maven-gpg-plugin` configured in `pom.xml`.

This guide assumes you are the **namespace owner** for `com.scalekit` (i.e. you have (or are creating) the account that owns/verified the namespace, not someone being added as an additional publisher by an existing owner).

## 1. Create a Central Portal account

1. Go to [central.sonatype.com](https://central.sonatype.com) and sign up using **username/password** (not Google/GitHub SSO — SSO-only accounts don't correctly surface OSSRH-migrated namespaces).
2. Verify your email.

## 2. Register/verify the namespace

1. Go to **Publish → Namespace** ([central.sonatype.com/publishing/namespaces](https://central.sonatype.com/publishing/namespaces)).
2. Add the namespace `com.scalekit`.
3. Since `com.scalekit` is a domain-based namespace, verify ownership via the DNS TXT record challenge Sonatype provides (add the TXT record to the `scalekit.com` DNS zone).
4. Once verified, the namespace shows as active under your account.

## 3. Generate a Central Portal token

1. In the Central Portal, go to your account → **Generate User Token**.
2. This gives you a `username` / `password` pair (a token, not your login password) — copy both, they're only shown once.

## 4. Add the token to your local Maven settings

Add a `<server>` entry to `~/.m2/settings.xml` with the id `central` (this must match `publishingServerId` in `pom.xml`):

```xml
<settings>
  <servers>
    <server>
      <id>central</id>
      <username>YOUR_TOKEN_USERNAME</username>
      <password>YOUR_TOKEN_PASSWORD</password>
    </server>
  </servers>
</settings>
```

Never commit this file or these values to the repo.

## 5. Set up GPG signing

Maven Central requires every published artifact to be signed. The `maven-gpg-plugin` runs at the `verify` phase and needs a local GPG key.

1. Generate a key if you don't have one:
   ```bash
   gpg --full-generate-key
   ```
2. Upload the **public** key to a keyserver so Sonatype can verify signatures:
   ```bash
   gpg --keyserver keyserver.ubuntu.com --send-keys YOUR_KEY_ID
   ```
3. Make sure `gpg-agent` is running so Maven can access the key without a passphrase prompt hanging the build, or configure the passphrase via `~/.m2/settings.xml`:
   ```xml
   <settings>
     <servers>
       <server>
         <id>central</id>
         <username>YOUR_TOKEN_USERNAME</username>
         <password>YOUR_TOKEN_PASSWORD</password>
       </server>
     </servers>
     <profiles>
       <profile>
         <id>gpg-sign</id>
         <activation>
           <activeByDefault>true</activeByDefault>
         </activation>
         <properties>
           <gpg.passphrase>YOUR_GPG_PASSPHRASE</gpg.passphrase>
         </properties>
       </profile>
     </profiles>
   </settings>
   ```

## 6. Bump the version

Update the `<version>` in `pom.xml` before releasing (Maven Central does not allow re-publishing an existing version).

## 7. Deploy

From the repo root:

```bash
mvn clean deploy
```

This runs the full build (compile, test, javadoc jar, sources jar, shade, GPG sign) and uploads a deployment bundle to Central via the `central-publishing-maven-plugin`.

`autoPublish` is set to `false` in `pom.xml`, so the deployment lands in a **pending** state:

1. Go to [central.sonatype.com/publishing/deployments](https://central.sonatype.com/publishing/deployments).
2. Find the deployment, review it (Sonatype validates POM metadata, signatures, javadoc/sources presence).
3. Click **Publish** to release it to Maven Central, or **Drop** to discard it.

Once published, artifacts typically become searchable on [search.maven.org](https://search.maven.org) within ~30 minutes, and syncable to Maven Central proper within a few hours.

## Adding another publisher to the namespace

Namespace user management is not self-service. As the namespace owner:

1. Have the person create their own Central Portal account (username/password, not SSO-only).
2. Email **central-support@sonatype.com** requesting they be added as a publisher on `com.scalekit`, including their account email.
3. Once added, they follow steps 3–5 above (their own token + their own GPG key) to deploy from their own machine — namespace access does not share credentials.

You can view current publishers under **Publish → Namespace → (⋮ menu on the `com.scalekit` row) → View Users**.
