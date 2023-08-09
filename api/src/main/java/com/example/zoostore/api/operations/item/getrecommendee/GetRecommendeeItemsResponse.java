package com.example.zoostore.api.operations.item.getrecommendee;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetRecommendeeItemsResponse  implements OperationResponse {
    private List items;

}
