package com.example.zoostore.api.operations.link.get;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetLinkResponse implements OperationResponse {
    private UUID id;
    private String url;
    private String itemName;
}
