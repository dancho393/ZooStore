package com.example.zoostore.core.operations.item;


import com.example.zoostore.api.operations.item.get.GetItemRequest;
import com.example.zoostore.api.operations.item.get.GetItemResponse;
import com.example.zoostore.api.operations.item.get.GetItemOperation;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Comment;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Link;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.CommentRepository;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetItemIMPL implements GetItemOperation {
    private final ItemRepository itemRepository;
    private final CommentRepository commentRepository;
    @Override
    public GetItemResponse process(GetItemRequest item)  {
        Item itemEntity = itemRepository.findById(item.getId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
        List<Comment> comments = commentRepository.findAllByItem(itemEntity);

        Set<String> links = itemEntity.getLinks()
                .stream()
                .map(Link::getUrl)
                .collect(Collectors.toSet());

        Set<String> tags = itemEntity.getTags()
                .stream()
                .map(Tag::getTitle)
                .collect(Collectors.toSet());

        Map<String,Float> newComments=new HashMap<>();
        comments.stream().forEach(comment -> {
            newComments.put(comment.getComment(),comment.getRating());
        });
        OptionalDouble averageRating = comments.stream()
                .mapToDouble(Comment::getRating)
                .average();
        String avgRatingString = averageRating.isPresent() ? String.format("%.1f", averageRating.getAsDouble()) : "N/A";


        return GetItemResponse.builder()
                .id(itemEntity.getId())
                .title(itemEntity.getTitle())
                .description(itemEntity.getDescription())
                .vendorName(itemEntity.getVendor().getName())
                .links(links)
                .tags(tags)
                .comments(newComments)
                .avgRating(avgRatingString)
                .build();
    }
}
