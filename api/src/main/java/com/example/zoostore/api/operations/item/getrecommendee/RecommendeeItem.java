package com.example.zoostore.api.operations.item.getrecommendee;

import lombok.*;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RecommendeeItem {
    private UUID id;
    private String title;
    private String description;
    private String vendorName;
    private Set<String> links;
    private Set<String> tags;
    private Map<String,Float> comments;
    private String avgRating;
}
