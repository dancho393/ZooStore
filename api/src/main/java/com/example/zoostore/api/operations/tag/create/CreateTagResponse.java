package com.example.zoostore.api.operations.tag.create;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTagResponse implements OperationResponse {
    private String name;
}
