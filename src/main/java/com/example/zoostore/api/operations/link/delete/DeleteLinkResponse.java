package com.example.zoostore.api.operations.link.delete;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteLinkResponse implements OperationResponse {
    private UUID id;
    private String url;
}
