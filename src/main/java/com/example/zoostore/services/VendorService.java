package com.example.zoostore.services;

import com.example.zoostore.models.addVendorIO.VendorInput;
import com.example.zoostore.models.addVendorIO.VendorOutput;
import org.springframework.stereotype.Service;

@Service
public interface VendorService {
    public VendorOutput createVendor(VendorInput vendor);




}
