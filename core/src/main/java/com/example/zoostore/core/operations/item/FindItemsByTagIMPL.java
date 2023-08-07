package com.example.zoostore.core.operations.item;

import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagRequest;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagResponse;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagOperation;
import com.example.zoostore.api.operations.item.findbytag.ItemByTagRequest;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class FindItemsByTagIMPL implements FindItemsByTagOperation {
    private final ItemRepository itemRepository;
    @Override
    public FindItemsByTagResponse process(FindItemsByTagRequest tag) {
        Pageable pageable = PageRequest.of(tag.getPage(),5);
        Page<Item> taggedItems=itemRepository.findAllByTags_Id(tag.getTagId(),pageable);
        List<Item> list=taggedItems.getContent();

        List<ItemByTagRequest> responseList=
                taggedItems.getContent().stream()
                        .map(item -> ItemByTagRequest.builder()
                                .id(item.getId())
                                .title(item.getTitle())
                                .description(item.getDescription())
                                .vendorName(item.getVendor().getName())
                                .build())
                        .collect(Collectors.toList());


        return FindItemsByTagResponse.builder()
                .items(responseList)
                .build();
    }
}
