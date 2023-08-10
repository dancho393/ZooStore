package com.example.zoostore.rest.controllers;

import com.example.zoostore.api.operations.link.create.CreateLinkOperation;
import com.example.zoostore.api.operations.link.create.CreateLinkRequest;
import com.example.zoostore.api.operations.link.delete.DeleteLinkOperation;
import com.example.zoostore.api.operations.link.delete.DeleteLinkRequest;
import com.example.zoostore.api.operations.link.edit.EditLinkOperation;
import com.example.zoostore.api.operations.link.edit.EditLinkRequest;
import com.example.zoostore.api.operations.link.get.GetLinkOperation;
import com.example.zoostore.api.operations.link.get.GetLinkRequest;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/links")
@RequiredArgsConstructor
public class LinkController {

    private final CreateLinkOperation createLinkOperation;
    private final DeleteLinkOperation deleteLinkOperation;
    private final EditLinkOperation editLinkOperation;
    private final GetLinkOperation getLinkOperation;

    @PostMapping("/new")
    public ResponseEntity createLink(@Valid  @RequestBody CreateLinkRequest link){

        return ResponseEntity.ok(createLinkOperation.process(link));
    }
    @DeleteMapping ("/deleteLink")
    public ResponseEntity deleteLink(@Valid @RequestBody DeleteLinkRequest link){

        return ResponseEntity.ok(deleteLinkOperation.process(link));
    }
    @PutMapping("/editLink")
    public ResponseEntity editLink(@Valid @RequestBody EditLinkRequest link) throws ResourceNotFoundException {

        return ResponseEntity.ok(editLinkOperation.process(link));
    }
    @GetMapping("/getLink")
    public ResponseEntity getLink(@Valid @RequestBody GetLinkRequest link) throws ResourceNotFoundException {

        return ResponseEntity.ok(getLinkOperation.process(link));
    }


}
