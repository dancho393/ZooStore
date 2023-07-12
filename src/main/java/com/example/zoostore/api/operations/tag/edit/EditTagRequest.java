package com.example.zoostore.api.operations.tag.edit;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditTagRequest {
    private UUID id;
    private String title;
}
