package com.example.zoostore.api.operations.tag.create;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateTagResponse implements OperationResponse {
    private String name;
}
