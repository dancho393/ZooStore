package com.example.zoostore.api.operations.vendor.delete;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteVendorRequest implements OperationRequest {
    private UUID id;
}
