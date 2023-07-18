package com.example.zoostore.api.operations.vendor.delete;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteVendorRequest implements OperationRequest {
    @NotBlank
    private UUID id;
}
