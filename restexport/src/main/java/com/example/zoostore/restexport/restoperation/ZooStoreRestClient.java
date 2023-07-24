package com.example.zoostore.restexport.restoperation;
import com.example.zoostore.api.operations.item.get.GetItemResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.UUID;

@Headers({"Content-Type: application/json"})
public interface ZooStoreRestClient {

    @RequestLine("GET /items/{itemId}")
    GetItemResponse getItemById(@Param String itemId);
}
