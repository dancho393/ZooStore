package com.example.zoostore.services;

import com.example.zoostore.data.entities.Vendor;
import com.example.zoostore.models.createVendorIO.VendorInput;
import com.example.zoostore.models.createVendorIO.VendorOutput;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface VendorService {
    public VendorOutput createVendor(VendorInput vendor);
    public Vendor getById(UUID id);
    public Vendor saveVendor(Vendor vendor);



}
