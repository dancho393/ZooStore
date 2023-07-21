package com.example.zoostore.persistence.repositories;


import com.example.zoostore.persistence.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface VendorRepository extends JpaRepository<Vendor, UUID> {
    @Query(value = "SELECT * FROM vendor WHERE name = :name LIMIT 1",nativeQuery = true)
    Vendor findFirstByVendorName(String name);

}
