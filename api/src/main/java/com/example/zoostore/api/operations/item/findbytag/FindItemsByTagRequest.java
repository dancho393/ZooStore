package com.example.zoostore.api.operations.item.findbytag;

import com.example.zoostore.api.operations.base.OperationRequest;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindItemsByTagRequest implements OperationRequest {
    @NotBlank
    private UUID tagId;
    private int page;

}
