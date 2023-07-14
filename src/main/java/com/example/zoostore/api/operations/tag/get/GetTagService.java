package com.example.zoostore.api.operations.tag.get;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface GetTagService {
    public GetTagResponce getTag(GetTagRequest tag) throws ResourceNotFoundExpcetion;
}
