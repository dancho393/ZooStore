package com.example.zoostore.api.operations.link.get;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetLinkRequest {
    private UUID id;

}
