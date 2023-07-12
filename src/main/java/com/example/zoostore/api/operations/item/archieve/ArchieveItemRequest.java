package com.example.zoostore.api.operations.item.archieve;

import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ArchieveItemRequest {
    private UUID id;
}
