package com.example.zoostore.core.operations.vendor;

import com.example.zoostore.api.operations.vendor.create.CreateVendorOperation;
import com.example.zoostore.api.operations.vendor.create.CreateVendorRequest;
import com.example.zoostore.api.operations.vendor.create.CreateVendorResponse;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Vendor;
import com.example.zoostore.persistence.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class CreateVendorIMPL implements CreateVendorOperation {
    private final VendorRepository vendorRepository;

    @Override
    public CreateVendorResponse process(CreateVendorRequest vendor) {
        Vendor vendorEntity =  Vendor.builder()
                .name(vendor.getName())
                .items(new HashSet<Item>())
                .country(vendor.getCountry())
                .city(vendor.getCity())
                .continent(vendor.getContinent())
                .build();
        vendorEntity = vendorRepository.save(vendorEntity);


        return CreateVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendor.getName())
                .build();
    }
}
