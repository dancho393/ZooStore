package com.example.zoostore.api.operations.tag.attach;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttachTagResponse implements OperationResponse {
    private String itemName;

    private String tagName;
}
