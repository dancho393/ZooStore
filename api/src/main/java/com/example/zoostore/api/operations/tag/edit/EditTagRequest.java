package com.example.zoostore.api.operations.tag.edit;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditTagRequest implements OperationRequest {
    @NotBlank
    private UUID id;
    @NotBlank
    private String title;
}
