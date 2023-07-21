package com.example.zoostore.api.operations.link.create;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateLinkResponse implements OperationResponse {
    private UUID id;
    private String url;
    private String itemTitle;
}
