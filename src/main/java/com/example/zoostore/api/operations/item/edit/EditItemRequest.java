package com.example.zoostore.api.operations.item.edit;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemRequest implements OperationRequest {
    private UUID id;
    private String title;
    private String description;
    private UUID vendor;
}
