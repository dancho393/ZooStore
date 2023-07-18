package com.example.zoostore.api.operations.item.edit;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemRequest implements OperationRequest {
    @NotBlank
    private UUID id;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private UUID vendor;
}
