package com.example.zoostore.api.operations.tag.edit;

import com.example.zoostore.api.operations.OperationRequest;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditTagRequest implements OperationRequest {
    private UUID id;
    private String title;
}
