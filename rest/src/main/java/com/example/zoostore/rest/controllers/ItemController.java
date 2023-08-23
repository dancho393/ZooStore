package com.example.zoostore.rest.controllers;

import com.example.zoostore.api.operations.item.archieve.ArchieveItemOperation;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemRequest;
import com.example.zoostore.api.operations.item.create.CreateItemOperation;
import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.api.operations.item.edit.EditItemOperation;
import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import com.example.zoostore.api.operations.item.findbyregex.FindByRegexOperation;
import com.example.zoostore.api.operations.item.findbyregex.FindByRegexRequest;
import com.example.zoostore.api.operations.item.findbyregex.FindByRegexResponse;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagRequest;
import com.example.zoostore.api.operations.item.get.GetItemOperation;
import com.example.zoostore.api.operations.item.get.GetItemRequest;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsOperation;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsRequest;
import com.example.zoostore.api.operations.item.getrecommendee.GetRecommendeeItemsResponse;
import com.example.zoostore.core.operations.item.FindItemsByTagIMPL;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private final ArchieveItemOperation archieveItemOperation;
    private final CreateItemOperation createItemOperation;
    private final EditItemOperation editItemOperation;
    private final GetItemOperation getItemOperation;
    private final FindItemsByTagIMPL findItemsByTagIMPL;
    private final FindByRegexOperation findByRegex;
    private final GetRecommendeeItemsOperation getRecommendeeItems;
    @PostMapping("/new")
    public ResponseEntity createItem(@Valid  @RequestBody CreateItemRequest item){;

       return ResponseEntity.ok(createItemOperation.process(item));
            }
            @PostMapping("/archieved")
    public ResponseEntity archieveItem(@Valid @RequestBody ArchieveItemRequest item)  {
        return ResponseEntity.ok(archieveItemOperation.process(item));

    }
    @PutMapping("/editItem")
    public ResponseEntity editItem(@Valid @RequestBody EditItemRequest item)  {
        return ResponseEntity.ok(editItemOperation.process(item));
    }

    @GetMapping(path = "/{itemId}")
    public ResponseEntity getItemById(@PathVariable UUID itemId) {
        return ResponseEntity.ok(getItemOperation.process(GetItemRequest.builder()
                .id(itemId)
                .build()));
    }

    @GetMapping("/byTag/{tagId}/{page}")
    public ResponseEntity getItemsByTag( @PathVariable UUID tagId,@PathVariable int page){

        return ResponseEntity.ok(findItemsByTagIMPL.process(FindItemsByTagRequest.builder()
                .tagId(tagId)
                .page(page)
                .build()));
    }
    @GetMapping("/regex/{keyword}/{page}")
    public ResponseEntity<FindByRegexResponse> findByRegexResponse(@PathVariable String keyword,@PathVariable int page){
        return ResponseEntity.ok(findByRegex.process(FindByRegexRequest.builder()
                .keyWord(keyword)
                .page(page)
                .build()));
    }
    @PostMapping("/recommend")
    public ResponseEntity<GetRecommendeeItemsResponse> getRecommendeeItems(@RequestBody GetRecommendeeItemsRequest request){
        return ResponseEntity.ok(getRecommendeeItems.process(request));

    }
    @GetMapping("/vaucher")
    public ResponseEntity vaucherWheel(){

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        DayOfWeek currentDay=zonedDateTime.getDayOfWeek();
        return ResponseEntity.ok(currentDay);
    }

}
