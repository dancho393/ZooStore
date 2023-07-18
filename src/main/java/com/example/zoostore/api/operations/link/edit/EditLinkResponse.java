package com.example.zoostore.api.operations.link.edit;

import com.example.zoostore.api.operations.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditLinkResponse implements OperationResponse {
    private UUID id;
    private String url;
}
