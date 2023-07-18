package com.example.zoostore.api.operations.vendor.edit;

import com.example.zoostore.api.operations.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditVendorResponse implements OperationResponse {
    private UUID id;
    private String name;
}
