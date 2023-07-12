package com.example.zoostore.bussiness.operations.vendor;

import com.example.zoostore.api.operations.vendor.get.GetVendorRequest;
import com.example.zoostore.api.operations.vendor.get.GetVendorResponse;
import com.example.zoostore.api.operations.vendor.get.GetVendorService;
import com.example.zoostore.data.entities.Vendor;
import com.example.zoostore.data.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetVendorIMPL implements GetVendorService {
    private final VendorRepository vendorRepository;
    @Override
    public GetVendorResponse getVendor(GetVendorRequest vendor) {
        Vendor vendorEntity =vendorRepository.findById(vendor.getId()).orElse(null);
        return GetVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendorEntity.getName())
                .build();
    }
}
