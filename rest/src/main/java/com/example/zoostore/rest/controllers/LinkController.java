package com.example.zoostore.rest.controllers;

import com.example.zoostore.api.operations.link.create.CreateLinkRequest;
import com.example.zoostore.api.operations.link.create.CreateLinkService;
import com.example.zoostore.api.operations.link.delete.DeleteLinkRequest;
import com.example.zoostore.api.operations.link.delete.DeleteLinkService;
import com.example.zoostore.api.operations.link.edit.EditLinkRequest;
import com.example.zoostore.api.operations.link.edit.EditLinkService;
import com.example.zoostore.api.operations.link.get.GetLinkRequest;
import com.example.zoostore.api.operations.link.get.GetLinkService;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/link")
@RequiredArgsConstructor
public class LinkController {

    private final CreateLinkService createLinkService;
    private final DeleteLinkService deleteLinkService;
    private final EditLinkService editLinkService;
    private final GetLinkService getLinkService;

    @PostMapping("/createLink")
    public ResponseEntity createLink(@Valid  @RequestBody CreateLinkRequest link){

        return ResponseEntity.ok(createLinkService.process(link));
    }
    @DeleteMapping ("/deleteLink")
    public ResponseEntity deleteLink(@Valid @RequestBody DeleteLinkRequest link){

        return ResponseEntity.ok(deleteLinkService.process(link));
    }
    @PutMapping("/editLink")
    public ResponseEntity editLink(@Valid @RequestBody EditLinkRequest link) throws ResourceNotFoundException {

        return ResponseEntity.ok(editLinkService.process(link));
    }
    @GetMapping("/getLink")
    public ResponseEntity getLink(@Valid @RequestBody GetLinkRequest link) throws ResourceNotFoundException {

        return ResponseEntity.ok(getLinkService.process(link));
    }


}