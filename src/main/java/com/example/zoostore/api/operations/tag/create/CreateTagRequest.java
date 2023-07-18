package com.example.zoostore.api.operations.tag.create;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateTagRequest implements OperationRequest {
    private String title;
}
