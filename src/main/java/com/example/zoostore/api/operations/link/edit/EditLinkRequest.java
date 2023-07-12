package com.example.zoostore.api.operations.link.edit;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditLinkRequest {
    private UUID id;
    private String url;
}
