package com.example.zoostore.core.operations.vendor;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.vendor.get.GetVendorRequest;
import com.example.zoostore.api.operations.vendor.get.GetVendorResponse;
import com.example.zoostore.api.operations.vendor.get.GetVendorService;
import com.example.zoostore.persistence.entities.Vendor;
import com.example.zoostore.persistence.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetVendorIMPL implements GetVendorService {
    private final VendorRepository vendorRepository;
    @Override
    public GetVendorResponse process(GetVendorRequest vendor) {
        Vendor vendorEntity =vendorRepository.findById(vendor.getId())
                .orElseThrow(()->new ResourceNotFoundException("Tag Not Found"));
        return GetVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendorEntity.getName())
                .build();
    }
}
