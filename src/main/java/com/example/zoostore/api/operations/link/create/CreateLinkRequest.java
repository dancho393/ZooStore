package com.example.zoostore.api.operations.link.create;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateLinkRequest implements OperationRequest {
    private String url;
    private UUID itemId;
}
