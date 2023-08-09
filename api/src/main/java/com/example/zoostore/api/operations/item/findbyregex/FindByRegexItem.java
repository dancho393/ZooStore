package com.example.zoostore.api.operations.item.findbyregex;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.aspectj.apache.bcel.generic.Tag;

import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class FindByRegexItem {
    private UUID id;
    private String title;
    private String description;
    private Set<String> tags;
    private String vendor;
    private Set<String> links;
}
