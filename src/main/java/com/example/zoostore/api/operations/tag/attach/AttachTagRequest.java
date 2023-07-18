package com.example.zoostore.api.operations.tag.attach;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttachTagRequest implements OperationRequest {
    @NotBlank
    private UUID itemId;
    @NotBlank
    private UUID tagId;
}
