package com.example.zoostore.api.operations.item.findbytag;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.List;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindItemsByTagResponse implements OperationResponse {
    private String tagName;
    private List<ItemByTagRequest> items;
}
