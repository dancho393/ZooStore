package com.example.zoostore.api.operations.item.edit;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemResponse {
    private UUID id;
    private String title;
    private String description;
    private String vendor;
}
