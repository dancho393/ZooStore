package com.example.zoostore.restexport;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagResponse;
import com.example.zoostore.api.operations.item.get.GetItemResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({"Content-Type: application/json"})
public interface ZooStoreRestClient {

    @RequestLine("GET /items/{itemId}")
    GetItemResponse getItemById(@Param String itemId);
    @RequestLine("GET /items/byTag/{tagId}/{page}")
    FindItemsByTagResponse getItemsByTag(@Param String tagId,@Param int page);
}
