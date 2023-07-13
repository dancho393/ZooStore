package com.example.zoostore.data.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    private String url;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;



}
