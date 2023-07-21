package com.example.zoostore.restexport.restoperation;
import com.example.zoostore.api.operations.item.get.GetItemResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.UUID;

@Headers({"Content-Type: application/json"})
//@FeignClient(value = "zoostore",url = "http://localhost:8080")
public interface ZooStoreRestClient {
@RequestLine("GET /{id}")
    GetItemResponse getItemById(@Param("id") UUID id);
}
