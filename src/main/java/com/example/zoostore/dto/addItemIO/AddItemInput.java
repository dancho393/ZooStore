package com.example.zoostore.dto.addItemIO;

import lombok.*;

import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddItemInput {
    private String title;

    private String description;

    private Set<String> links;

    private Set<String> tags;

    private Set<String> vendors;
}
