package com.example.zoostore.api.operations.item.edit;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemResponse implements OperationResponse {
    private UUID id;
    private String title;
    private String description;
    private String vendor;
}
