package com.example.zoostore.api.operations.vendor.create;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorRequest implements OperationRequest {
    private String name;
}
