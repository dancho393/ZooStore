package com.example.zoostore.api.operations.tag.deattach;

import com.example.zoostore.api.operations.base.OperationResponse;
import com.example.zoostore.persistence.entities.Item;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetachTagResponse implements OperationResponse {
    private UUID id;
    private String title;
    private Set<Item> itemNames;
}
