package com.example.zoostore.services.IMPL;

import com.example.zoostore.dto.addVendorIO.VendorInput;
import com.example.zoostore.dto.addVendorIO.VendorOutput;
import com.example.zoostore.entities.Vendor;
import com.example.zoostore.mapper.VendorMapper;
import com.example.zoostore.repositories.VendorRepository;
import com.example.zoostore.services.VendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendorServiceIMPL implements VendorService {

    private final VendorMapper vendorMapper;

    private final VendorRepository vendorRepository;

    @Override
    public VendorOutput createVendor(VendorInput vendor){

        Vendor vendorEntity = vendorMapper.toEntity(vendor);
        vendorRepository.save(vendorEntity);
        VendorOutput output = vendorMapper.toVendorOutput(vendorEntity);
        return output;
    }
}
