package com.example.zoostore.api.operations.tag.deattach;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetachTagRequest {
    private UUID tagId;
    private UUID itemId;
}
