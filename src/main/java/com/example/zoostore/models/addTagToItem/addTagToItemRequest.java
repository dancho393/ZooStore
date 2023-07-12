package com.example.zoostore.models.addTagToItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class addTagToItemRequest {
    private UUID itemId;
    private UUID tagId;

}
