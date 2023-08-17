package com.example.zoostore.restexport;

import com.example.zoostore.api.operations.comment.CreateCommentRequest;
import com.example.zoostore.api.operations.comment.CreateCommentResponse;
import com.example.zoostore.api.operations.item.findbyregex.FindByRegexResponse;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagResponse;
import com.example.zoostore.api.operations.item.get.GetItemResponse;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsRequest;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;

@Headers({"Content-Type: application/json"})
public interface ZooStoreRestClient {

    @RequestLine("GET /items/{itemId}")

    GetItemResponse getItemById(@Param String itemId);
    @RequestLine("GET /items/byTag/{tagId}/{page}")

    FindItemsByTagResponse getItemsByTag(@Param String tagId,@Param int page);

    @RequestLine("POST /comments")

    CreateCommentResponse createComment(@RequestBody CreateCommentRequest request);

    @RequestLine("GET /items/regex/{keyword}/{page}")

    FindByRegexResponse findByRegex(@Param String keyword,@Param int page);

    @RequestLine("POST /items/recommend")

    GetRecommendeeItemsResponse recommendedItems(@RequestBody GetRecommendeeItemsRequest request);
}
