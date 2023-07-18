package com.example.zoostore.api.operations.vendor.get;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetVendorRequest implements OperationRequest {
    @NotBlank
    private UUID id;
}
