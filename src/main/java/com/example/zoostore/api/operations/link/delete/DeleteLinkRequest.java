package com.example.zoostore.api.operations.link.delete;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteLinkRequest implements OperationRequest {
    private UUID id;
}
