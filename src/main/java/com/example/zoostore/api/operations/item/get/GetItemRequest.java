package com.example.zoostore.api.operations.item.get;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetItemRequest implements OperationRequest {
    private UUID id;
}
