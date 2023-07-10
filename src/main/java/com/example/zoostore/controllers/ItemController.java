package com.example.zoostore.controllers;

import com.example.zoostore.dto.ItemDTO;
import com.example.zoostore.entities.Item;
import com.example.zoostore.mapper.ItemMapper;
import com.example.zoostore.services.IMPL.ItemServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemServiceIMPL itemService;
    @Autowired
    ItemMapper itemMapper;

    @PostMapping("/addItem")
    public ResponseEntity addItem(@RequestBody ItemDTO itemDTO){

       Item item = itemMapper.toItem(itemDTO);
       itemService.createItem(item);
       return ResponseEntity.ok(item);
            }
    @GetMapping("/getItem")
    public ResponseEntity getItem(){
        return null;
    }


}
