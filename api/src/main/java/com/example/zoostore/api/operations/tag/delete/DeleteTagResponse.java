package com.example.zoostore.api.operations.tag.delete;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteTagResponse implements OperationResponse {
    private UUID id;

}
