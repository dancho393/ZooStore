package com.example.zoostore.api.operations.item.create;

import com.example.zoostore.models.createTagIO.TagInput;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateItemRequest {
    private String title;

    private String description;

    private UUID vendor;
}
