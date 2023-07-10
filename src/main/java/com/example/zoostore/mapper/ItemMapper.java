package com.example.zoostore.mapper;

import com.example.zoostore.dto.ItemDTO;
import com.example.zoostore.dto.LinkDTO;
import com.example.zoostore.dto.TagDTO;
import com.example.zoostore.dto.VendorDTO;
import com.example.zoostore.entities.Item;
import com.example.zoostore.entities.Link;
import com.example.zoostore.entities.Tag;
import com.example.zoostore.entities.Vendor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ItemMapper {
    public ItemDTO toDTO(Item item){
            String title = item.getTitle();
            String description = item.getDescription();

            Set<String> links =item.getLinks()
                    .stream()
                    .map(Link::getUrl)
                    .collect(Collectors.toSet());

            Set<String> tags=item.getTags()
                    .stream()
                    .map(Tag::getTitle)
                    .collect(Collectors.toSet());

            Set<String> vendors = item.getVendors()
                    .stream()
                    .map(Vendor::getName)
                    .collect(Collectors.toSet());
            ItemDTO itemDTO = new ItemDTO(title,description,links,tags,vendors);

            return itemDTO;

    }

    public Item toItem(ItemDTO itemDTO){
       Item item = Item.builder()
               .title(itemDTO.getTitle())
               .description(itemDTO.getDescription())
               .links(new HashSet<Link>())
               .tags(new HashSet<Tag>())
               .vendors(new HashSet<Vendor>())
               .build();
        return item;
    }

}
