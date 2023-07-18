package com.example.zoostore.api.operations.item.create;

import com.example.zoostore.api.operations.OperationResponse;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemResponse implements OperationResponse {
    private UUID id;
    private String title;
    private String vendorName;

}
