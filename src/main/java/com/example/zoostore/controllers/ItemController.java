package com.example.zoostore.controllers;

import com.example.zoostore.entities.Item;
import com.example.zoostore.models.archieveItem.archieveItemRequest;
import com.example.zoostore.models.createItemIO.ItemInput;
import com.example.zoostore.models.addTagToItem.addTagToItemRequest;
import com.example.zoostore.services.IMPL.ItemServiceIMPL;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {


    private final ItemServiceIMPL itemService;

    @PostMapping("/createItem")
    @Tag(name = "add Item",description = "Create new item that will be added(title,description,vendors,links,tags)")
    public ResponseEntity createItem(@RequestBody ItemInput item){
        Item itemEntity= itemService.createItem(item);

       return ResponseEntity.ok(itemEntity);
            }

    public ResponseEntity archieveItem(@RequestBody archieveItemRequest id){
        return ResponseEntity.ok(null);

    }





}
