package com.example.zoostore.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendors")

public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column

    private UUID id;
    @Column
    private String name;

    @OneToMany(mappedBy = "vendor")
    private Set<Item> items;


}
