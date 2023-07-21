package com.example.zoostore.api.operations.tag.create;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateTagRequest implements OperationRequest {
    @NotBlank
    private String title;
}
