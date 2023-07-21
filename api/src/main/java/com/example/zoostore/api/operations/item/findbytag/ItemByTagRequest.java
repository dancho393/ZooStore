package com.example.zoostore.api.operations.item.findbytag;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemByTagRequest {
    private String title;
    private String description;
}
