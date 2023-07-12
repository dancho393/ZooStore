package com.example.zoostore.api.operations.tag.get;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetTagRequest {
    private UUID id;
}
