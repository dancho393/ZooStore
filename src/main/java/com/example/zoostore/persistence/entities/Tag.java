package com.example.zoostore.persistence.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tags")

public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column

    private UUID id;

    @Column
    @NotBlank
    private String title;

    @ManyToMany(mappedBy = "tags")
    private Set<Item> items;


}
