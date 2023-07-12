package com.example.zoostore.models.createItemIO;

import com.example.zoostore.models.createTagIO.TagInput;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemInput {
    private String title;

    private String description;

    private Set<String> links;

    private Set<TagInput> tags;

    private UUID vendor;


}
