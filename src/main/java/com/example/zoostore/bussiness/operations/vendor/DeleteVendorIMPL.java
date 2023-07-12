package com.example.zoostore.bussiness.operations.vendor;

import com.example.zoostore.api.operations.vendor.delete.DeleteVendorRequest;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorResponse;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorService;
import com.example.zoostore.data.entities.Vendor;
import com.example.zoostore.data.repositories.VendorRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteVendorIMPL implements DeleteVendorService {
    private final VendorRepository vendorRepository;
    @Override
    public DeleteVendorResponse deleteVendor(DeleteVendorRequest vendor) {
        Vendor vendorEntity = vendorRepository.findById(vendor.getId()).orElse(null);
        vendorRepository.delete(vendorEntity);
        return DeleteVendorResponse.builder()
                .id(vendorEntity.getId())
                .name(vendorEntity.getName())
                .build();
    }
}
