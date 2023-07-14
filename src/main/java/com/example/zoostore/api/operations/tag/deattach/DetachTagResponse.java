package com.example.zoostore.api.operations.tag.deattach;

import com.example.zoostore.data.entities.Item;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetachTagResponse {
    private UUID id;
    private String title;
    private Set<Item> itemNames;
}
