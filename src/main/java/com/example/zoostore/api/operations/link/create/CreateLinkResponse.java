package com.example.zoostore.api.operations.link.create;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateLinkResponse {
    private UUID id;
    private String url;
    private String itemTitle;
}