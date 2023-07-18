package com.example.zoostore.api.operations.tag.deattach;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetachTagRequest implements OperationRequest {
    private UUID tagId;
    private UUID itemId;
}
