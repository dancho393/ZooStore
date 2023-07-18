package com.example.zoostore.core.operations.vendor;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorRequest;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorResponse;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorService;
import com.example.zoostore.persistence.entities.Vendor;
import com.example.zoostore.persistence.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteVendorIMPL implements DeleteVendorService {
    private final VendorRepository vendorRepository;
    @Override
    public DeleteVendorResponse process(DeleteVendorRequest vendor) throws ResourceNotFoundException {
        Vendor vendorEntity = vendorRepository.findById(vendor.getId())
                .orElseThrow(()->new ResourceNotFoundException("Vendor Not Found"));
        vendorRepository.delete(vendorEntity);
        return DeleteVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendorEntity.getName())
                .build();
    }
}
