package com.scalekit.api.util;

import lombok.*;

import java.util.List;

/**
 * Filter and pagination options for listing the end-user consents granted
 * against a resource.
 *
 * Priority order: {@code consentIds}, then {@code userIds}, then {@code search}.
 * A filter with at least one non-blank value silently overrides the lower-priority
 * ones; a blank-only filter falls through to the next.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListUserConsentsOptions {
    /** Case-insensitive substring match on external user IDs. Ignored when consentIds or userIds is set. */
    String search;
    /** Consents per page (max 30). 0 uses the server default. */
    int pageSize;
    /** Pagination cursor. */
    String pageToken;
    /** Exact, case-sensitive match on external user IDs (max 25). Ignored when consentIds is set; takes precedence over search. */
    List<String> userIds;
    /**
     * Exact match on consent IDs (format: usrcnst_xxxxx), max 25 distinct. Takes precedence over
     * userIds and search; blank-only values are ignored. IDs that do not exist or belong to another resource
     * are omitted. An older server ignores this filter, so confirm each returned id is one you asked for before revoking.
     */
    List<String> consentIds;
}
