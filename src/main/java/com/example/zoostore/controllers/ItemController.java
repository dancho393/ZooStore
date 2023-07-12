package com.example.zoostore.controllers;

import com.example.zoostore.api.operations.item.archieve.ArchieveItemRequest;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemService;
import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.api.operations.item.create.CreateItemService;
import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import com.example.zoostore.api.operations.item.edit.EditItemService;
import com.example.zoostore.api.operations.item.get.GetItemRequest;
import com.example.zoostore.api.operations.item.get.GetItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {
    private final ArchieveItemService archieveItemService;
    private final CreateItemService createItemService;
    private final EditItemService editItemService;
    private final GetItemService getItemService;

    @PostMapping("/createItem")
    @Tag(name = "add Item",description = "Create new item that will be added(title,description,vendors,links,tags)")
    public ResponseEntity createItem(@RequestBody CreateItemRequest item){;

       return ResponseEntity.ok(createItemService.createItem(item));
            }
            @PostMapping("/archieve")
    public ResponseEntity archieveItem(@RequestBody ArchieveItemRequest item){
        return ResponseEntity.ok(archieveItemService.archieveItem(item));

    }
    @PutMapping("/editItem")
    public ResponseEntity editItem(@RequestBody EditItemRequest item){
        return ResponseEntity.ok(editItemService.editItem(item));
    }
    @GetMapping("/getItem")
    public ResponseEntity getItem(@RequestBody GetItemRequest item){
        return ResponseEntity.ok(getItemService.getItem(item));
    }





}
