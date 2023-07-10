package com.example.zoostore.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private UUID Id;

    @Column
    private String title;

    @Column
    private String description;

    @ManyToMany()
    @JoinTable(
            name = "item_vendor",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "vendor_id")
    )

    private Set<Vendor> vendors ;

    @OneToMany(mappedBy = "item")
    private Set<Tag> tags;

    @OneToMany(mappedBy = "item")
    private Set<Link> links;

}
