package com.example.zoostore.controllers;

import com.example.zoostore.entities.Item;
import com.example.zoostore.models.addItemIO.ItemInput;
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

    @GetMapping("/addTag")
    @Tag(name = "Add Tag",description = "Add Tag To Item")
    public ResponseEntity addTag(@RequestBody String tag){
        return null;

    }


}
