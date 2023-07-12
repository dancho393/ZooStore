package com.example.zoostore.api.operations.link.get;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetLinkResponse {
    private UUID id;
    private String url;
    private String itemName;
}
