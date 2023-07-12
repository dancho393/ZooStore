package com.example.zoostore.controllers;

import com.example.zoostore.api.operations.tag.attach.AttachTagRequest;
import com.example.zoostore.api.operations.tag.create.CreateTagRequest;
import com.example.zoostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zoostore.api.operations.tag.edit.EditTagRequest;
import com.example.zoostore.api.operations.tag.get.GetTagRequest;
import com.example.zoostore.bussiness.operations.tag.*;
import com.example.zoostore.models.addTagToItem.addTagToItemRequest;
import com.example.zoostore.models.createTagIO.TagInput;
import com.example.zoostore.services.TagService;
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

    @PostMapping("/createTag")
    public ResponseEntity addTag(@RequestBody CreateTagRequest tag){
        return ResponseEntity.ok(createTagService.createTag(tag));
    }
    @DeleteMapping("/deleteTag")
    public ResponseEntity deleteTag(@RequestBody DeleteTagRequest tag){
        return ResponseEntity.ok(deleteTagService.deleteTag(tag));
    }
    @PutMapping("/editTag")
    public ResponseEntity editTag(@RequestBody EditTagRequest tag){
        return ResponseEntity.ok(editTag.editTag(tag));
    }
    @GetMapping("getTag")
    public ResponseEntity getTag(@RequestBody GetTagRequest tag){
        return ResponseEntity.ok(getTagService.getTag(tag));
    }
    @PostMapping("/attachTag")
    public ResponseEntity attachTagToItem(@RequestBody AttachTagRequest input){
        return ResponseEntity.ok(attachTag.attachTag(input));
    }

}
