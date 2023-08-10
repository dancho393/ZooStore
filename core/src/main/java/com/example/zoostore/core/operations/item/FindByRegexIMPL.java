package com.example.zoostore.core.operations.item;

import com.example.zoostore.api.operations.item.findbyregex.FindByRegexItem;
import com.example.zoostore.api.operations.item.findbyregex.FindByRegexOperation;
import com.example.zoostore.api.operations.item.findbyregex.FindByRegexRequest;
import com.example.zoostore.api.operations.item.findbyregex.FindByRegexResponse;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class FindByRegexIMPL implements FindByRegexOperation {
    private final ItemRepository itemRepository;

    @Override
    public FindByRegexResponse process(FindByRegexRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), 5);
        List<Item> items = itemRepository.findAllByTitleRegex(request.getKeyWord(),pageable).getContent();
        List<FindByRegexItem> itemList = new ArrayList<>();
        items.forEach(item -> {
            Set<String> links = new HashSet<>();
            item.getLinks().forEach(link -> {
                links.add(link.getUrl());
            });
            Set<String> tags = new HashSet<>();
            item.getTags().forEach(tag -> {
               tags.add( tag.getTitle());
            });
            itemList.add(FindByRegexItem.builder()
                            .id(item.getId())
                            .title(item.getTitle())
                            .vendor(item.getVendor().getName())
                            .description(item.getDescription())
                            .tags(tags)
                            .links(links)

                    .build());
        });
        return FindByRegexResponse.builder()
                .keyWord(request.getKeyWord())
                .items(itemList)
                .build();
    }
}
