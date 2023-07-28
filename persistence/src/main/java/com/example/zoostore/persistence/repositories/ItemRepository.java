package com.example.zoostore.persistence.repositories;


import com.example.zoostore.persistence.entities.Item;
import feign.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID> {
    Page<Item> findAllByTags_Id(UUID tagId, Pageable pageable);


}
