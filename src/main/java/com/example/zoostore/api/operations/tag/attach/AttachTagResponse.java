package com.example.zoostore.api.operations.tag.attach;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttachTagResponse {
    private String itemName;

    private String tagName;
}
