package com.example.zoostore.core.operations.vendor;


import com.example.zoostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zoostore.api.operations.vendor.edit.EditVendorResponse;
import com.example.zoostore.api.operations.vendor.edit.EditVendorService;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Vendor;
import com.example.zoostore.persistence.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditVendorIMPL implements EditVendorService {
    private final VendorRepository vendorRepository;

    @Override
    public EditVendorResponse process(EditVendorRequest vendor) {
        Vendor vendorEntity = vendorRepository.findById(vendor.getId())
                .orElseThrow(()->new ResourceNotFoundException("Vendor Not Found"));
        vendorEntity.setName(vendor.getName());
        vendorRepository.save(vendorEntity);
        return EditVendorResponse.builder()
                .id(vendor.getId())
                .name(vendor.getName())
                .build();
    }
}
