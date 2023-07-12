package com.example.zoostore.api.operations.tag.create;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateTagRequest {
    private String title;
}