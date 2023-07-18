package com.example.zoostore.api.operations.vendor.get;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetVendorResponse implements OperationResponse {
    private UUID id;
    private String name;
}
