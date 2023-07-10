package com.example.zoostore.dto;

import com.example.zoostore.entities.Item;
import lombok.Data;

import java.util.Set;

@Data
public class LinkDTO {
    private String url;

    private Set<ItemDTO> items;
}
