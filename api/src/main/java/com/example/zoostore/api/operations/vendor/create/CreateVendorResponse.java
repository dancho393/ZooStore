package com.example.zoostore.api.operations.vendor.create;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateVendorResponse implements OperationResponse {
    private UUID id;
    private String name;
}
