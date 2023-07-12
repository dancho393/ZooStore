package com.example.zoostore.bussiness.operations.tag;

import com.example.zoostore.api.operations.tag.edit.EditTagRequest;
import com.example.zoostore.api.operations.tag.edit.EditTagResponse;
import com.example.zoostore.api.operations.tag.edit.EditTagService;
import com.example.zoostore.data.entities.Tag;
import com.example.zoostore.data.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditTagIMPL implements EditTagService {
    private final TagRepository tagRepository;
    @Override
    public EditTagResponse editTag(EditTagRequest tag) {
       Tag tagEntity = tagRepository.findById(tag.getId()).orElse(null);
       tagEntity.setTitle(tag.getTitle());
       tagRepository.save(tagEntity);
        return EditTagResponse.builder()
                .title(tagEntity.getTitle())
                .build();
    }
}
