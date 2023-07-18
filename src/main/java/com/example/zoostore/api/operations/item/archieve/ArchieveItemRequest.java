package com.example.zoostore.api.operations.item.archieve;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ArchieveItemRequest implements OperationRequest {
    private UUID id;
}
