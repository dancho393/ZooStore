package com.example.zoostore.api.operations.tag.get;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetTagRequest implements OperationRequest {
    @NotBlank
    private UUID id;
}
