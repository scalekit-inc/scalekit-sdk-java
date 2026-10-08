# Changelog

All notable changes to this SDK are documented in this file. The format follows
[Keep a Changelog](https://keepachangelog.com/en/1.1.0/), and versions follow
[Semantic Versioning](https://semver.org/).

Changes that users can notice are described in files under `.changes/unreleased/`; release
tooling writes each version's section here from those files when the version is released.
Don't edit released sections by hand.

Sections up to and including 2.5.0 were imported from [GitHub Releases](https://github.com/scalekit-inc/scalekit-sdk-java/releases). Their wording is kept, with small corrections.

## [2.5.0] - 2026-10-05

### Changes

- [SK-2043] chore: update proto to v0.1.150.0 (v2.4.1) ([#78](https://github.com/scalekit-inc/scalekit-sdk-java/pull/78))
- feat: accept multiple issuers in token validation (SK-2080) ([#79](https://github.com/scalekit-inc/scalekit-sdk-java/pull/79))
- Add Create/Update/Delete/List/Get to ResourceClient ([#77](https://github.com/scalekit-inc/scalekit-sdk-java/pull/77))
- [SK-2144] fix: unbreak release build on broken Javadoc reference ([#81](https://github.com/scalekit-inc/scalekit-sdk-java/pull/81))

## [2.4.0] - 2026-09-11

### Changes

- [SK-1912] Add resources client for listing and revoking user consents ([#75](https://github.com/scalekit-inc/scalekit-sdk-java/pull/75))
- [SK-1867] fix: enable keepAliveWithoutCalls to detect dead idle connections ([#74](https://github.com/scalekit-inc/scalekit-sdk-java/pull/74))

## [2.3.1] - 2026-08-11

### Changes

- [SK-1568] fix: bump jackson-databind to 2.18.8 (patch GHSA-r7wm-3cxj-wff9) ([#73](https://github.com/scalekit-inc/scalekit-sdk-java/pull/73))

## [2.3.0] - 2026-07-24

### Changes

- [SK-1314] chore: update proto to v0.1.139.2 and add LoginClient (v2.3.0) ([#72](https://github.com/scalekit-inc/scalekit-sdk-java/pull/72))

## [2.2.0] - 2026-07-21

### Changes

- feat: regenerate protos from v0.1.123.0 and add slug/logo_url to CreateOrganizationOptions ([#66](https://github.com/scalekit-inc/scalekit-sdk-java/pull/66))
- feat(users): add external_id lookup methods ([#67](https://github.com/scalekit-inc/scalekit-sdk-java/pull/67))
- chore: update proto to v0.1.137.0 ([#68](https://github.com/scalekit-inc/scalekit-sdk-java/pull/68))
- [SK-1309] update sonatype version ([#69](https://github.com/scalekit-inc/scalekit-sdk-java/pull/69))

## [2.1.2] - 2026-05-20

### Changes

- feat: organization session policy SDK methods ([#56](https://github.com/scalekit-inc/scalekit-sdk-java/pull/56))
- fix: HTTP connection eviction and gRPC keepalive ([#64](https://github.com/scalekit-inc/scalekit-sdk-java/pull/64))

## [2.1.1] - 2026-05-07

### Changes

- Convert relative href URLs to absolute GitHub URLs in reference.md ([#39](https://github.com/scalekit-inc/scalekit-sdk-java/pull/39))
- chore: add CODEOWNERS ([#41](https://github.com/scalekit-inc/scalekit-sdk-java/pull/41))
- Adding All Token Claims to Access Token and IDToken ([#40](https://github.com/scalekit-inc/scalekit-sdk-java/pull/40))
- [Revert] Add Claim Set ([#42](https://github.com/scalekit-inc/scalekit-sdk-java/pull/42))
- CI updates ([#43](https://github.com/scalekit-inc/scalekit-sdk-java/pull/43))
- feature/api tokens ([#37](https://github.com/scalekit-inc/scalekit-sdk-java/pull/37))
- [SK-2602] - Verify getOrganizationRoleUsersCount in Java SDK ([#45](https://github.com/scalekit-inc/scalekit-sdk-java/pull/45))
- fix(org): add deleteOrganizationRoleBase(orgId), deprecate deleteRoleBase() ([#47](https://github.com/scalekit-inc/scalekit-sdk-java/pull/47))
- [SK-2657] feat(token): add update() method for UpdateToken RPC ([#46](https://github.com/scalekit-inc/scalekit-sdk-java/pull/46))
- [SK-2664] feat(m2m): add M2MClient (ClientService org-client CRUD) ([#48](https://github.com/scalekit-inc/scalekit-sdk-java/pull/48))
- [SK-2668] feat(users): add listUserRoles and listUserPermissions ([#49](https://github.com/scalekit-inc/scalekit-sdk-java/pull/49))
- docs: add getLogoutUrl method and rename to REFERENCE.md ([#50](https://github.com/scalekit-inc/scalekit-sdk-java/pull/50))
- [SK-2671] feat(roles): add updateDefaultRoles and listDependentRoles ([#51](https://github.com/scalekit-inc/scalekit-sdk-java/pull/51))
- [SK-2601][SK-2607] feat: API discrepancy fixes (Java) ([#44](https://github.com/scalekit-inc/scalekit-sdk-java/pull/44))
- docs: API tokens, M2M, and table of contents in REFERENCE ([#54](https://github.com/scalekit-inc/scalekit-sdk-java/pull/54))
- refactor(m2m): standardize method names to add/remove convention ([#53](https://github.com/scalekit-inc/scalekit-sdk-java/pull/53))
- docs: Update README with agent-first positioning ([#55](https://github.com/scalekit-inc/scalekit-sdk-java/pull/55))
- feat(users): add searchUsers and searchOrganizationUsers ([#57](https://github.com/scalekit-inc/scalekit-sdk-java/pull/57))
- update version ([#58](https://github.com/scalekit-inc/scalekit-sdk-java/pull/58))

## [2.0.11] - 2026-02-07

### Changes

- Remove sl4j nop dependency and remove from jar ([#38](https://github.com/scalekit-inc/scalekit-sdk-java/pull/38))

## [2.0.10] - 2026-02-04

### Changes

- Add comprehensive reference documentation for ScalekitClient in Java SDK ([#34](https://github.com/scalekit-inc/scalekit-sdk-java/pull/34))
- Remove header from reference.md ([#35](https://github.com/scalekit-inc/scalekit-sdk-java/pull/35))
- Retry on Unavailable ([#36](https://github.com/scalekit-inc/scalekit-sdk-java/pull/36))

## [2.0.9] - 2026-01-14

### Changes

#### Version 2.0.9

#### Domains API Release Notes

- added domain type changes ([#33](https://github.com/scalekit-inc/scalekit-sdk-java/pull/33))

#### New Feature: Domain List API Type Filtering

Added optional type filtering to `listDomainsByOrganizationId()` method. Filter domains by `ALLOWED_EMAIL_DOMAIN` or `ORGANIZATION_DOMAIN` type.

**API:**
```java
// List all domains (no filter)
List<Domain> domains = client.domains().listDomainsByOrganizationId("org_123456");

// Filter by type
List<Domain> domains = client.domains().listDomainsByOrganizationId(
    "org_123456",
    DomainType.ALLOWED_EMAIL_DOMAIN  // or DomainType.ORGANIZATION_DOMAIN
);
```

**Highlights:**
- ✅ Fully backward compatible
- ✅ Uses `DomainType` enum for type safety
- ✅ Comprehensive test coverage
- ✅ No migration required

#### Changes

**Added:**
- Type filtering parameter in `listDomainsByOrganizationId(String organizationId, DomainType domainType)`
- Method overload to maintain backward compatibility

**Improved:**
- Type safety for domain filtering using enum values
- Better code clarity with explicit domain type filtering

---

#### Migration

**No migration needed** - existing code works unchanged. The new overloaded method with `DomainType` parameter is optional.

---

**Documentation:** [Domain API Docs](https://docs.scalekit.com/apis/#tag/domains)

## [2.0.8] - 2025-12-22

### Changes

- Add WebAuthn client support to ScalekitClient  in https://github.com/scalekit-inc/scalekit-sdk-java/pull/32

## [2.0.7] - 2025-11-24

### Changes

**New sdk methods**
- Add **upsertUserManagementSettings()** to OrganizationClient ([#31](https://github.com/scalekit-inc/scalekit-sdk-java/pull/31))

## [2.0.6] - 2025-11-18

### Changes

- Generate proto files to support given_name and family_name in user object in https://github.com/scalekit-inc/scalekit-sdk-java/pull/29

## [2.0.5] - 2025-11-13

### Changes

- Add Session management sdk methods in https://github.com/scalekit-inc/scalekit-sdk-java/pull/24

## [2.0.4] - 2025-10-10

### Changes

- Add role and permission management sdk methods ([#23](https://github.com/scalekit-inc/scalekit-sdk-java/pull/23))

## [2.0.3] - 2025-09-18

### Changes

- Add resend invite functionality to UserClient ([#20](https://github.com/scalekit-inc/scalekit-sdk-java/pull/20))
- Add support for domain type in domain creation ([#21](https://github.com/scalekit-inc/scalekit-sdk-java/pull/21))

## [2.0.1] - 2025-07-31

### Changes

- fix some tests in user ([#17](https://github.com/scalekit-inc/scalekit-sdk-java/pull/17))
- add passwordless sdk methods ([#18](https://github.com/scalekit-inc/scalekit-sdk-java/pull/18))

## [2.0.0] - 2025-07-11

### Changes

- Implemented user CRUD methods and refresh token handling in SDK. ([#14](https://github.com/scalekit-inc/scalekit-sdk-java/pull/14))
- update README.md ([#16](https://github.com/scalekit-inc/scalekit-sdk-java/pull/16))

## [1.1.3] - 2025-03-19

### Changes

- Minimum Requirements
- Add Connection and Directory Delete
- update README.md

## [1.1.2] - 2025-01-16

### Changes

- Add features for generating Customer portal

## [1.1.1] - 2025-01-14

### Changes

- add grpc per call deadline

## [1.1.0] - 2025-01-08

### Changes

- Added Create Connection and Create Directory
- Added Token Refresh

## [1.0.3] - 2024-12-06

### Changes

- Add support for java 1.8 https://github.com/scalekit-inc/scalekit-sdk-java/pull/7

## [1.0.2] - 2024-11-22

### Changes

- Add [SCIM](https://docs.scalekit.com/scim/quickstart) provisioning support in https://github.com/scalekit-inc/scalekit-sdk-java/pull/5
- Update javadocs by in https://github.com/scalekit-inc/scalekit-sdk-java/pull/6

## [1.0.1] - 2024-08-22

### Changes

- IDP Initiated SSO DX v2 ([#3](https://github.com/scalekit-inc/scalekit-sdk-java/pull/3))
- updated version to v1.0.1 ([#4](https://github.com/scalekit-inc/scalekit-sdk-java/pull/4))

## [1.0.0] - 2024-07-24

### Changes

#### Initial Release

[2.5.0]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.5.0
[2.4.0]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.4.0
[2.3.1]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.3.1
[2.3.0]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.3.0
[2.2.0]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.2.0
[2.1.2]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.1.2
[2.1.1]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.1.1
[2.0.11]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.11
[2.0.10]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.10
[2.0.9]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.9
[2.0.8]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.8
[2.0.7]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.7
[2.0.6]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.6
[2.0.5]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.5
[2.0.4]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.4
[2.0.3]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.3
[2.0.1]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.1
[2.0.0]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v2.0.0
[1.1.3]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.1.3
[1.1.2]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.1.2
[1.1.1]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.1.1
[1.1.0]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.1.0
[1.0.3]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.0.3
[1.0.2]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.0.2
[1.0.1]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.0.1
[1.0.0]: https://github.com/scalekit-inc/scalekit-sdk-java/releases/tag/v1.0.0
