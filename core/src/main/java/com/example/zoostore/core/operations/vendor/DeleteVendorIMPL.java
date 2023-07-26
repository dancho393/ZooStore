package com.example.zoostore.core.operations.vendor;


import com.example.zoostore.api.operations.vendor.delete.DeleteVendorRequest;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorResponse;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorOperation;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Vendor;
import com.example.zoostore.persistence.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteVendorIMPL implements DeleteVendorOperation {
    private final VendorRepository vendorRepository;
    @Override
    public DeleteVendorResponse process(DeleteVendorRequest vendor) {
        Vendor vendorEntity = vendorRepository.findById(vendor.getId())
                .orElseThrow(()->new ResourceNotFoundException("Vendor Not Found"));
        vendorRepository.delete(vendorEntity);
        return DeleteVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendorEntity.getName())
                .build();
    }
}
