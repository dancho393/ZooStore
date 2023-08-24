package com.example.zoostore.api.operations.comment;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCommentsResponse implements OperationResponse {
    private String itemName;
    private String comment;
    private Float rating;
}
