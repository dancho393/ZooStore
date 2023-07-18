package com.example.zoostore.api.operations.tag.deattach;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetachTagRequest implements OperationRequest {
    @NotBlank
    private UUID tagId;
    @NotBlank
    private UUID itemId;
}
