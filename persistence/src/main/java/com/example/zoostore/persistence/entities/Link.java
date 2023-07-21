package com.example.zoostore.persistence.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "links")

public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private UUID id;

    @Column

    private String url;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;



}
