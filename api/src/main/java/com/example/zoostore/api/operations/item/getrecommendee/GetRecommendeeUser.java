package com.example.zoostore.api.operations.item.getrecommendee;

import lombok.*;

import java.sql.Timestamp;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetRecommendeeUser {
    private UUID id;
    private Boolean successful;
    private Timestamp purchaseDate;
    private Map<UUID,Integer> items;
    private Float totalPrice;
    private UUID userId;
}
