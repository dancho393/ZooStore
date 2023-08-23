package com.example.zoostore.api.operations.item.get;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetItemResponse implements OperationResponse {
    private UUID id;
    private String title;
    private String description;

    private Set<String> links;
    private Set<String> tags;
    private Map<String,Float> comments;
    private String avgRating;
    private String vendorName;
    private String vendorCountry;
    private String vendorCity;
}
