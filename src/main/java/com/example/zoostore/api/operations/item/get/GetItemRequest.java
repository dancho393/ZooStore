package com.example.zoostore.api.operations.item.get;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetItemRequest {
    private UUID id;
}
