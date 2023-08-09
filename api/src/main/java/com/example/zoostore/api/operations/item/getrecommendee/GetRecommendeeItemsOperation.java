package com.example.zoostore.api.operations.item.getrecommendee;

import com.example.zoostore.api.operations.base.Operation;

public interface GetRecommendeeItemsOperation extends Operation<GetRecommendeeItemsResponse,GetRecommendeeItemsRequest> {
    public GetRecommendeeItemsResponse process(GetRecommendeeItemsRequest request);

}
