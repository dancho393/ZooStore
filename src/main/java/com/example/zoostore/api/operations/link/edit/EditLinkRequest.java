package com.example.zoostore.api.operations.link.edit;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditLinkRequest  implements OperationRequest {
    private UUID id;
    private String url;
}
