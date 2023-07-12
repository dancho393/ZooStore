package com.example.zoostore.api.operations.link.create;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateLinkRequest {
    private String url;
    private UUID itemId;
}
