package com.example.zoostore.api.operations.item.get;

import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetItemResponse {
    private UUID id;
    private String title;
    private String description;
    private String vendorName;
    private Set<String> links;
    private Set<String> tags;
}
