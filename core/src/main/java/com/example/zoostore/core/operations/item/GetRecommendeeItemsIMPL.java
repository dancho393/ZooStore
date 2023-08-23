package com.example.zoostore.core.operations.item;



import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsOperation;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsRequest;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsResponse;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeUser;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GetRecommendeeItemsIMPL implements GetRecommendeeItemsOperation {

    private final ItemRepository itemRepository;
    @Override
    public GetRecommendeeItemsResponse process(GetRecommendeeItemsRequest request) {
        //This stream gets all the purchases from one month ago
        List<GetRecommendeeUser> recomendList= filterByDate(request.getPurchaseList());
        Map<UUID,Integer> tags= findCountTags(recomendList);

        //Get the most bought tag
        Optional<Map.Entry<UUID, Integer>> maxTagEntry = tags.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue));

        maxTagEntry.ifPresent(entry -> {
            UUID maxTagId = entry.getKey();
            int maxTagValue = entry.getValue();
        });

        Pageable pageable= PageRequest.of(request.getPage(), 5);
        List<Item> recItems=itemRepository.findAllByTags_IdOrderByRatingDesc(
                maxTagEntry.get().getKey(),pageable).getContent();

        return GetRecommendeeItemsResponse.builder()
                .items(recItems)
                .build();
    }


    private List filterByDate(List<GetRecommendeeUser> list){
        LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);

        return list.stream()
                .filter(getUserPurchase -> {
                    LocalDate purchaseLocalDate = getUserPurchase.getPurchaseDate().toLocalDateTime().toLocalDate();
                    return !purchaseLocalDate.isBefore(oneMonthAgo) &&
                            !purchaseLocalDate.isAfter(LocalDate.now());
                })
                .collect(Collectors.toList());
    }
    private Map<UUID,Integer> findCountTags(List<GetRecommendeeUser> recomendList){
        Map<UUID,Integer> tags= new HashMap<>();
        recomendList.stream().forEach(purchase ->{
            purchase.getItems().entrySet().stream().forEach(itemId->{
                Item item =itemRepository.findById(itemId.getKey())
                        .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
                item.getTags().forEach(tag->{
                    if(tags.containsKey(tag.getId())){
                        itemId.setValue(itemId.getValue()+ tags.get(tag.getId()));
                        tags.put(tag.getId(), itemId.getValue());
                    }
                    tags.put(tag.getId(),itemId.getValue());
                });
            });
        });
        return tags;
    }
    }

