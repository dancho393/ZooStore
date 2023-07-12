package com.example.zoostore.api.operations.tag.attach;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttachTagRequest {
    private UUID itemId;
    private UUID tagId;
}
