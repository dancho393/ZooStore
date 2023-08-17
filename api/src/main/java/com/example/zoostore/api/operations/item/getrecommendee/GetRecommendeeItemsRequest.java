package com.example.zoostore.api.operations.item.getrecommendee;

import com.example.zoostore.api.operations.base.OperationRequest;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetRecommendeeItemsRequest implements OperationRequest {
    private  List<GetRecommendeeUser> purchaseList;
    private int page;
}
