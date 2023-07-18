package com.example.zoostore.persistence.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "vendors")

public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column

    private UUID id;
    @Column
    @NotBlank
    private String name;

    @OneToMany(mappedBy = "vendor")
    @JsonManagedReference
    private Set<Item> items;


}
