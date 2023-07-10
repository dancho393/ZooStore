package com.example.zoostore.services.IMPL;

import com.example.zoostore.repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceIMPL {
    @Autowired
    private VendorRepository vendorRepository;
}
