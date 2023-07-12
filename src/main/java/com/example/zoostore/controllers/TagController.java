package com.example.zoostore.controllers;

import com.example.zoostore.models.addTagToItem.addTagToItemRequest;
import com.example.zoostore.models.createTagIO.TagInput;
import com.example.zoostore.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    @PostMapping("/createTag")
    public ResponseEntity addTag(@RequestBody TagInput tag){
        return ResponseEntity.ok(tagService.createTag(tag));
    }
    @PostMapping("/attachTag")
    public ResponseEntity attachTagToItem(@RequestBody addTagToItemRequest input){
        return ResponseEntity.ok(tagService.attachTag(input));
    }

}
