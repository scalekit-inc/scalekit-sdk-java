package com.scalekit.api.util;

import lombok.*;

import java.util.List;

/**
 * Filter and pagination options for listing the end-user consents granted
 * against a resource.
 *
 * {@code userIds} matches the consent's external user ID exactly and
 * case-sensitively and takes precedence over {@code search}: when it carries at
 * least one non-blank value, the server ignores {@code search}.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListUserConsentsOptions {
    /** Case-insensitive substring match on external user IDs. Ignored when userIds is set. */
    String search;
    /** Consents per page (max 30). 0 uses the server default. */
    int pageSize;
    /** Pagination cursor. */
    String pageToken;
    /** Exact, case-sensitive match on external user IDs (max 25). Takes precedence over search. */
    List<String> userIds;
}
