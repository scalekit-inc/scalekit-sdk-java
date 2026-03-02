package com.scalekit.internal.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class IdTokenClaims {
    @JsonProperty("sub")
    private String id;

    @JsonProperty("preferred_username")
    private String username;

    private String name;

    @JsonProperty("given_name")
    private String givenName;

    @JsonProperty("family_name")
    private String familyName;

    private String email;

    @JsonProperty("email_verified")
    private boolean emailVerified;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("phone_number_verified")
    private boolean phoneNumberVerified;

    private String profile;
    private String picture;
    private String gender;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("zone_info")
    private String zoneInfo;

    private String locale;

    @JsonProperty("updated_at")
    private String updatedAt;

    private List<Identity> identities;
    private String metadata;

    @Getter
    @Setter
    public static class Identity {
        @JsonProperty("connection_id")
        private String connectionId;

        @JsonProperty("organization_id")
        private String organizationId;

        @JsonProperty("connection_type")
        private String connectionType;

        @JsonProperty("provider_name")
        private String providerName;

        private boolean social;

        @JsonProperty("provider_raw_attributes")
        private String providerRawAttributes;
    }
}
