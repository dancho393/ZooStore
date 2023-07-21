package com.example.zoostore.api.operations.link.create;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateLinkRequest implements OperationRequest {
    @NotBlank
    private String url;
    @NotBlank
    private UUID itemId;
}
