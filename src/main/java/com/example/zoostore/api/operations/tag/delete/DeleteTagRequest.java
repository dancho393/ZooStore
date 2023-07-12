package com.example.zoostore.api.operations.tag.delete;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class DeleteTagRequest {
    private UUID id;
}
