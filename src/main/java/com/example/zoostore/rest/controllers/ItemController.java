package com.example.zoostore.rest.controllers;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemRequest;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemService;
import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.api.operations.item.create.CreateItemService;
import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import com.example.zoostore.api.operations.item.edit.EditItemService;
import com.example.zoostore.api.operations.item.get.GetItemRequest;
import com.example.zoostore.api.operations.item.get.GetItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
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
    public ResponseEntity createItem(@Valid  @RequestBody CreateItemRequest item){;

       return ResponseEntity.ok(createItemService.process(item));
            }
            @PostMapping("/archieve")
    public ResponseEntity archieveItem(@Valid @RequestBody ArchieveItemRequest item) throws ResourceNotFoundException {
        return ResponseEntity.ok(archieveItemService.process(item));

    }
    @PutMapping("/editItem")
    public ResponseEntity editItem(@Valid @RequestBody EditItemRequest item) throws ResourceNotFoundException {
        return ResponseEntity.ok(editItemService.process(item));
    }
    @GetMapping("/getItem")
    public ResponseEntity getItem(@Valid @RequestBody GetItemRequest item) throws ResourceNotFoundException {
        return ResponseEntity.ok(getItemService.process(item));
    }





}
