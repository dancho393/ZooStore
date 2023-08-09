package com.example.zoostore.api.operations.item.findbyregex;

import com.example.zoostore.api.operations.base.OperationRequest;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class FindByRegexRequest implements OperationRequest {
    private String keyWord;
    private int page;

}
