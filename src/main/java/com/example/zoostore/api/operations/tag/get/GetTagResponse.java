package com.example.zoostore.api.operations.tag.get;

import com.example.zoostore.api.operations.OperationResponse;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetTagResponse implements OperationResponse {
    private UUID id;
    private String title;
}
