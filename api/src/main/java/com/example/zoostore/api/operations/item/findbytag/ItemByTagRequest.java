package com.example.zoostore.api.operations.item.findbytag;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemByTagRequest {
    private UUID id;
    private String vendorName;
    private String title;
    private String description;
    private int quantity;
    private Float price;

}
