package com.example.zoostore.api.operations.item.findbytag;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;
import org.springframework.data.domain.Page;


import java.util.List;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindItemsByTagResponse implements OperationResponse {
    private List<ItemByTagRequest> items;
}
