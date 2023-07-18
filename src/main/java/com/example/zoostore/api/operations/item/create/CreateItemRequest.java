package com.example.zoostore.api.operations.item.create;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateItemRequest implements OperationRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private UUID vendor;
}
