package com.example.zoostore.api.operations.item.findbyregex;

import lombok.*;

import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class FindByRegexItem {
    private UUID id;
    private String title;
    private String description;
    private Set<String> tags;
    private String vendor;
    private Set<String> links;
}
