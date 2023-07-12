package com.example.zoostore.api.operations.vendor.delete;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteVendorResponse {
    private UUID id;
    private String name;
}
