package com.example.zoostore.bussiness.operations.vendor;

import com.example.zoostore.api.operations.vendor.create.CreateVendorRequest;
import com.example.zoostore.api.operations.vendor.create.CreateVendorResponse;
import com.example.zoostore.api.operations.vendor.create.CreateVendorService;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.entities.Vendor;
import com.example.zoostore.data.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class CreateVendorIMPL implements CreateVendorService {
    private final VendorRepository vendorRepository;

    @Override
    public CreateVendorResponse createVendor(CreateVendorRequest vendor) {
        Vendor vendorEntity =  Vendor.builder()
                .name(vendor.getName())
                .items(new HashSet<Item>())
                .build();
        vendorEntity = vendorRepository.save(vendorEntity);


        return CreateVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendor.getName())
                .build();
    }
}
