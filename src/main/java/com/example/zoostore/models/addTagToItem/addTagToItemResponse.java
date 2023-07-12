package com.example.zoostore.models.addTagToItem;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class addTagToItemResponse {
    private String itemName;

    private String tagName;
}
