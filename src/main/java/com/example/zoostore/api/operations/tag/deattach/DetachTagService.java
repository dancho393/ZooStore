package com.example.zoostore.api.operations.tag.deattach;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public interface DetachTagService {
    public DetachTagResponse detachTag(DetachTagRequest tagItem) throws ResourceNotFoundExpcetion;
}
