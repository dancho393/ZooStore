package com.example.zoostore.models.archieveItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class archieveItemReponse {
    private UUID itemId;
    private String title;
    private boolean archieve;
}
