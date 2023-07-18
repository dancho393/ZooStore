package com.example.zoostore.api.operations.item.create;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateItemRequest implements OperationRequest {
    private String title;

    private String description;

    private UUID vendor;
}
