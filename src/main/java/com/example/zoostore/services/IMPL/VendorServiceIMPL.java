package com.example.zoostore.services.IMPL;

import com.example.zoostore.entities.Item;
import com.example.zoostore.exceptions.EntityNotFoundException;
import com.example.zoostore.models.addVendorIO.VendorInput;
import com.example.zoostore.models.addVendorIO.VendorOutput;
import com.example.zoostore.entities.Vendor;
import com.example.zoostore.mapper.VendorMapper;
import com.example.zoostore.repositories.VendorRepository;
import com.example.zoostore.services.VendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VendorServiceIMPL implements VendorService {

    private final VendorMapper vendorMapper;

    private final VendorRepository vendorRepository;

    @Override
    public VendorOutput createVendor(VendorInput vendor){

        Vendor vendorEntity = vendorMapper.toEntity(vendor);
        vendorEntity = vendorRepository.save(vendorEntity);
        VendorOutput output = vendorMapper.toVendorOutput(vendorEntity);

        return output;

    }
    public Vendor getById(UUID id){

       return vendorRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Vendor Not Found"));
    }
    public Vendor saveVendor(Vendor vendor){
        return vendorRepository.save(vendor);
    }






}
