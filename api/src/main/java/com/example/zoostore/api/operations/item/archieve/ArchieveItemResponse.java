package com.example.zoostore.api.operations.item.archieve;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArchieveItemResponse implements OperationResponse {
    private UUID id;
    private String title;
    private String vendorName;
    private boolean archived;
}
