package com.example.zoostore.api.operations.vendor.create;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateVendorResponse {
    private UUID id;
    private String name;
}
