package com.example.zoostore.api.operations.tag.delete;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteTagResponse {
    private UUID id;

}
