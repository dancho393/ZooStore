package com.example.zoostore.bussiness.operations.vendor;

import com.example.zoostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zoostore.api.operations.vendor.edit.EditVendorResponse;
import com.example.zoostore.api.operations.vendor.edit.EditVendorService;
import com.example.zoostore.data.entities.Vendor;
import com.example.zoostore.data.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditVendorIMPL implements EditVendorService {
    private final VendorRepository vendorRepository;

    @Override
    public EditVendorResponse edinVendor(EditVendorRequest vendor) {
        Vendor vendorEntity = vendorRepository.findById(vendor.getId()).orElse(null);
        vendorEntity.setName(vendor.getName());
        vendorRepository.save(vendorEntity);
        return EditVendorResponse.builder()
                .id(vendor.getId())
                .name(vendor.getName())
                .build();
    }
}
