package com.example.zoostore.controllers;

import com.example.zoostore.dto.ItemDTO;
import com.example.zoostore.entities.Item;
import com.example.zoostore.mapper.ItemMapper;
import com.example.zoostore.services.IMPL.ItemServiceIMPL;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {


    ItemServiceIMPL itemService;


    @PostMapping("/addItem")
    @Tag(name = "add Item",description = "Create new item that will be added(title,description,vendors,links,tags)")
    public ResponseEntity addItem(@RequestBody ItemDTO itemDTO){

       return ResponseEntity.ok(null);
            }

    @GetMapping("/getItem")
    @Tag(name = "Get item",description = "get certain item")
    public ResponseEntity getItem(){
        return null;
    }


}
