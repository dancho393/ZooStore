package com.example.zoostore.dto;

import lombok.Data;

import java.util.Set;

@Data
public class TagDTO {
    private String title;

    private Set<ItemDTO> items;
}
