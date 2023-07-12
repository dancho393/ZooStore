package com.example.zoostore.api.operations.vendor.get;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetVendorResponse {
    private UUID id;
    private String name;
}
