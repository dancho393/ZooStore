package com.example.zoostore.api.operations.tag.delete;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class DeleteTagRequest implements OperationRequest {
    private UUID id;
}
