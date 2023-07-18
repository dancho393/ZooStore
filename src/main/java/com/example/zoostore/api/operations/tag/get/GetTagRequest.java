package com.example.zoostore.api.operations.tag.get;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetTagRequest implements OperationRequest {
    private UUID id;
}
