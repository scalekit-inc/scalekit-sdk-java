package com.scalekit.api.util;


import com.google.protobuf.Timestamp;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListDirectoryResourceOptions {
    int pageSize;
    String pageToken;
    boolean includeDetail;
    Timestamp updatedAfter;
}
