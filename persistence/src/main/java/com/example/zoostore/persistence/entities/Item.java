package com.example.zoostore.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "items")

public class Item {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    @Id
    private UUID Id;

    @Column

    private String title;

    @Column

    private String description;

    @Column
    private boolean archived;

    @ManyToMany
    @JoinTable(
            name = "item_tag",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @JsonIgnore
    private Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    @JsonBackReference // Add this annotation
    private Vendor vendor;

    @OneToMany(mappedBy = "item")
    private Set<Link> links;

}
