package com.example.zoostore.api.operations.link.delete;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteLinkRequest implements OperationRequest {
    @NotBlank
    private UUID id;
}
