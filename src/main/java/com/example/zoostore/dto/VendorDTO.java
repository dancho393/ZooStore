package com.example.zoostore.dto;

import lombok.Data;

import java.util.Set;

@Data
public class VendorDTO {
    private String name;

    private Set<ItemDTO> items;
}
