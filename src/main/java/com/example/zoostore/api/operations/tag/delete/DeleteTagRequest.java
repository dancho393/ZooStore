package com.example.zoostore.api.operations.tag.delete;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class DeleteTagRequest implements OperationRequest {
    @NotBlank
    private UUID id;
}
