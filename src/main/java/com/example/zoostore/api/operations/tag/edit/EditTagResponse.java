package com.example.zoostore.api.operations.tag.edit;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditTagResponse implements OperationResponse {
    private String title;
}
