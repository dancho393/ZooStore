package com.example.zoostore.api.operations.item.create;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemResponse {
    private UUID id;
    private String title;
    private String vendorName;

}
