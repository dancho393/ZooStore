package com.example.zoostore.core.operations.comment;

import com.example.zoostore.api.operations.comment.CreateCommentOperation;
import com.example.zoostore.api.operations.comment.CreateCommentsRequest;
import com.example.zoostore.api.operations.comment.CreateCommentsResponse;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Comment;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.repositories.CommentRepository;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CreateCommentIMPL implements CreateCommentOperation {
    private final CommentRepository commentRepository;
    private final ItemRepository itemRepository;
    @Override
    public CreateCommentsResponse process(CreateCommentsRequest request) {

        Item item = itemRepository.findById(request.getItemId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
        Comment comment = Comment.builder()
                .comment(request.getComment())
                .rating(request.getRating())
                .item(item)
                .build();
        commentRepository.save(comment);
        item.setRating(calculateRating(item));
        itemRepository.save(item);

        return CreateCommentsResponse.builder()
                .itemName(item.getTitle())
                .rating(comment.getRating())
                .comment(comment.getComment())
                .build();
    }

    private Float calculateRating(Item item){
        List<Comment> commentList = commentRepository.findAllByItem(item);
        Double sum=commentList.stream().mapToDouble(comment->comment.getRating()).sum();
        Double rating=sum/commentList.size();
        float roundedRating = (float) Math.round(rating * 10) / 10;
        return roundedRating;
    }
}

