package com.example.zoostore.services;

import com.example.zoostore.dto.addVendorIO.VendorInput;
import com.example.zoostore.dto.addVendorIO.VendorOutput;
import com.example.zoostore.mapper.VendorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public interface VendorService {
    public VendorOutput createVendor(VendorInput vendor);




}
