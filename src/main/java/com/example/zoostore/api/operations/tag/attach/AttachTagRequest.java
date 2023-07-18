package com.example.zoostore.api.operations.tag.attach;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttachTagRequest implements OperationRequest {
    private UUID itemId;
    private UUID tagId;
}
