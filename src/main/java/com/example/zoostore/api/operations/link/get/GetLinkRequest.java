package com.example.zoostore.api.operations.link.get;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetLinkRequest implements OperationRequest {
    private UUID id;

}
