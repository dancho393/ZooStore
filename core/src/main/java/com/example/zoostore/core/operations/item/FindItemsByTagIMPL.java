package com.example.zoostore.core.operations.item;

import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagRequest;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagResponse;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagOperation;
import com.example.zoostore.api.operations.item.findbytag.ItemByTagRequest;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
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


        List<Item> allItems=itemRepository.findAll();

        ArrayList<ItemByTagRequest> itemsWithCertainTag = allItems.stream()
                .filter(item -> item.getTags().stream()
                        .anyMatch(cTag -> cTag.getId().equals(tag.getTagId())))
                .map(item -> {
                    ItemByTagRequest request = new ItemByTagRequest();
                    request.setTitle(item.getTitle());
                    request.setDescription(item.getDescription());
                    return request;
                })
                .collect(Collectors.toCollection(ArrayList::new));


        FindItemsByTagResponse response = new FindItemsByTagResponse();
        response.setItems(itemsWithCertainTag);

        return response;
    }
}
