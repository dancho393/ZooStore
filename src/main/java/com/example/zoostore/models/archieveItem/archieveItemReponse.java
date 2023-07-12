package com.example.zoostore.models.archieveItem;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class archieveItemReponse {
    private UUID itemId;
    private String title;
    private boolean archieve;
}
