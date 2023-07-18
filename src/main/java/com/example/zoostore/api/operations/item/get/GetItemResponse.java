package com.example.zoostore.api.operations.item.get;

import com.example.zoostore.api.operations.OperationResponse;
import lombok.*;

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
    private String vendorName;
    private Set<String> links;
    private Set<String> tags;
}
