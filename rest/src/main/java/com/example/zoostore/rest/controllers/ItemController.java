package com.example.zoostore.rest.controllers;

import com.example.zoostore.api.operations.item.archieve.ArchieveItemRequest;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemService;
import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.api.operations.item.create.CreateItemService;
import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import com.example.zoostore.api.operations.item.edit.EditItemService;
import com.example.zoostore.api.operations.item.findbytag.FindItemsByTagRequest;
import com.example.zoostore.api.operations.item.get.GetItemRequest;
import com.example.zoostore.api.operations.item.get.GetItemService;
import com.example.zoostore.core.operations.item.FindItemsByTagIMPL;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private final ArchieveItemService archieveItemService;
    private final CreateItemService createItemService;
    private final EditItemService editItemService;
    private final GetItemService getItemService;
    private final FindItemsByTagIMPL findItemsByTagIMPL;

    @PostMapping("/createItem")
    public ResponseEntity createItem(@Valid  @RequestBody CreateItemRequest item){;

       return ResponseEntity.ok(createItemService.process(item));
            }
            @PostMapping("/archieve")
    public ResponseEntity archieveItem(@Valid @RequestBody ArchieveItemRequest item)  {
        return ResponseEntity.ok(archieveItemService.process(item));

    }
    @PutMapping("/editItem")
    public ResponseEntity editItem(@Valid @RequestBody EditItemRequest item)  {
        return ResponseEntity.ok(editItemService.process(item));
    }

    @GetMapping(path = "/{itemId}")
    public ResponseEntity getItemById(@PathVariable UUID itemId) {
        return ResponseEntity.ok(getItemService.process(GetItemRequest.builder()
                .id(itemId)
                .build()));
    }


    @GetMapping("/getItemsByTag")
    public ResponseEntity getItemsByTag(@Valid @RequestBody FindItemsByTagRequest ItemsByTag){
        return ResponseEntity.ok(findItemsByTagIMPL.process(ItemsByTag));
    }





}
