package com.example.zoostore.api.operations.vendor.create;

import org.springframework.stereotype.Service;

@Service
public interface CreateVendorService {
    public CreateVendorResponse createVendor(CreateVendorRequest vendor);
}
