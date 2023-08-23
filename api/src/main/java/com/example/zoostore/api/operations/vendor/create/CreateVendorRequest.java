package com.example.zoostore.api.operations.vendor.create;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorRequest implements OperationRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String city;
    @NotBlank
    private String country;
    @NotBlank
    private String continent;
}
