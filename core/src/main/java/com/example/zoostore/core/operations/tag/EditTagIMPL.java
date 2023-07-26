package com.example.zoostore.core.operations.tag;


import com.example.zoostore.api.operations.tag.edit.EditTagRequest;
import com.example.zoostore.api.operations.tag.edit.EditTagResponse;
import com.example.zoostore.api.operations.tag.edit.EditTagOperation;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditTagIMPL implements EditTagOperation {
    private final TagRepository tagRepository;
    @Override
    public EditTagResponse process(EditTagRequest tag) {
       Tag tagEntity = tagRepository.findById(tag.getId())
               .orElseThrow(()->new ResourceNotFoundException("Tag Not Found"));
       tagEntity.setTitle(tag.getTitle());
       tagRepository.save(tagEntity);
        return EditTagResponse.builder()
                .title(tagEntity.getTitle())
                .build();
    }
}
