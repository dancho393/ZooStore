package com.example.zoostore.api.operations.item.findbyregex;

import com.example.zoostore.api.operations.base.Operation;

public interface FindByRegexOperation extends Operation<FindByRegexResponse,FindByRegexRequest> {
    FindByRegexResponse process(FindByRegexRequest request);
}
