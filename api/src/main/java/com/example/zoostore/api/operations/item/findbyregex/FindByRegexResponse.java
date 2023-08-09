package com.example.zoostore.api.operations.item.findbyregex;

import com.example.zoostore.api.operations.base.OperationResponse;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class FindByRegexResponse implements OperationResponse {
    private String keyWord;
    private List<FindByRegexItem> items;
}
