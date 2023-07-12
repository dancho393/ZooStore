package com.example.zoostore.api.operations.link.delete;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteLinkRequest {
    private UUID id;
}
