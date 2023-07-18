package com.example.zoostore.api.operations.vendor.edit;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditVendorRequest implements OperationRequest {
    private UUID id;
    private String name;
}
