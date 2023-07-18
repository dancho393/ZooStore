package com.example.zoostore.api.operations.vendor.delete;

import com.example.zoostore.api.operations.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteVendorResponse implements OperationResponse {
    private UUID id;
    private String name;
}
