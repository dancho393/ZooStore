package com.example.zoostore.api.operations.tag.get;

import org.springframework.stereotype.Service;

@Service
public interface GetTagService {
    public GetTagResponce getTag(GetTagRequest tag);
}
