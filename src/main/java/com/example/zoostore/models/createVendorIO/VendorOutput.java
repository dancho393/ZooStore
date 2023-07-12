package com.example.zoostore.models.createVendorIO;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VendorOutput {
    private UUID id;
    private String name;

}
