package com.example.zoostore.rest.controllers;

import com.example.zoostore.api.operations.comment.CreateCommentOperation;
import com.example.zoostore.api.operations.comment.CreateCommentsRequest;
import com.example.zoostore.api.operations.comment.CreateCommentsResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/comments")
public class CommentController {
    private final CreateCommentOperation createCommentOperation;
    @PostMapping
    public ResponseEntity<CreateCommentsResponse> createItem(@RequestBody @Valid CreateCommentsRequest request){
        return ResponseEntity.ok(createCommentOperation.process(request));
    }
}
