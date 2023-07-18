package com.example.zoostore.api.operations.vendor.get;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetVendorRequest implements OperationRequest {
    private UUID id;
}
