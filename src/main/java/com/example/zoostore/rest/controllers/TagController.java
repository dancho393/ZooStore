package com.example.zoostore.rest.controllers;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.tag.attach.AttachTagRequest;
import com.example.zoostore.api.operations.tag.create.CreateTagRequest;
import com.example.zoostore.api.operations.tag.deattach.DetachTagRequest;
import com.example.zoostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zoostore.api.operations.tag.edit.EditTagRequest;
import com.example.zoostore.api.operations.tag.get.GetTagRequest;
import com.example.zoostore.core.operations.tag.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
@RequiredArgsConstructor
public class TagController {

    private final CreateTagIMPL createTagService;
    private final DeleteTagIMPL deleteTagService;
    private final EditTagIMPL editTag;
    private final GetTagIMPL getTagService;
    private final AttachTagIMPL attachTag;
    private final DetachTagIMPL detachTag;

    @PostMapping("/createTag")
    public ResponseEntity addTag(@Valid @RequestBody CreateTagRequest tag){
        return ResponseEntity.ok(createTagService.process(tag));
    }
    @DeleteMapping("/deleteTag")
    public ResponseEntity deleteTag(@Valid @RequestBody DeleteTagRequest tag){
        return ResponseEntity.ok(deleteTagService.process(tag));
    }
    @PutMapping("/editTag")
    public ResponseEntity editTag(@Valid @RequestBody EditTagRequest tag) throws ResourceNotFoundException {
        return ResponseEntity.ok(editTag.process(tag));
    }
    @GetMapping("getTag")
    public ResponseEntity getTag(@Valid @RequestBody GetTagRequest tag) throws ResourceNotFoundException {
        return ResponseEntity.ok(getTagService.process(tag));
    }
    @PostMapping("/attachTag")
    public ResponseEntity attachTagToItem(@Valid @RequestBody AttachTagRequest input) throws ResourceNotFoundException {
        return ResponseEntity.ok(attachTag.process(input));
    }
    @PutMapping("/detachTag")
    public ResponseEntity detachTagToItem(@Valid @RequestBody DetachTagRequest tagItem) throws ResourceNotFoundException {
        return ResponseEntity.ok(detachTag.process(tagItem));
    }

}
