package com.example.zoostore.repositories;

import com.example.zoostore.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface VendorRepository extends JpaRepository<Vendor, UUID> {
    @Query(value = "SELECT * FROM vendor WHERE name = :name LIMIT 1",nativeQuery = true)
    Vendor findFirstByVendorName(String name);

}
