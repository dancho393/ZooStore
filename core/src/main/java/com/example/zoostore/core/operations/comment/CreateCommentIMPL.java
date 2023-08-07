package com.example.zoostore.core.operations.comment;

import com.example.zoostore.api.operations.comment.CreateCommentOperation;
import com.example.zoostore.api.operations.comment.CreateCommentRequest;
import com.example.zoostore.api.operations.comment.CreateCommentResponse;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Comment;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.repositories.CommentRepository;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCommentIMPL implements CreateCommentOperation {
    private final CommentRepository commentRepository;
    private final ItemRepository itemRepository;
    @Override
    public CreateCommentResponse process(CreateCommentRequest request) {

        Item item = itemRepository.findById(request.getItemId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
        Comment comment = Comment.builder()
                .comment(request.getComment())
                .rating(request.getRating())
                .item(item)
                .build();
        commentRepository.save(comment);
        return CreateCommentResponse.builder()
                .itemName(item.getTitle())
                .rating(comment.getRating())
                .comment(comment.getComment())
                .build();
    }
}
