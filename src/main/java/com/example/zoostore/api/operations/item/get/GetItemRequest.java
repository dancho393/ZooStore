package com.example.zoostore.api.operations.item.get;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetItemRequest implements OperationRequest {
    @NotBlank
    private UUID id;
}
