package com.example.zoostore.api.operations.comment;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCommentsRequest implements OperationRequest {
    @NotBlank
    private UUID itemId;

    @NotBlank
    private UUID userId;
    @NotBlank
    private String comment;
    @DecimalMin(value = "1.0", inclusive = true)
    @DecimalMax(value = "5.0", inclusive = true)
    private Float rating;
}
