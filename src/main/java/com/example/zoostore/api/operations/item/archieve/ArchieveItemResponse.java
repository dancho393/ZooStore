package com.example.zoostore.api.operations.item.archieve;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchieveItemResponse {
    private UUID id;
    private String title;
    private String vendorName;
    private boolean archived;
}
