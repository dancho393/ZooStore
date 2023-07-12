package com.example.zoostore.api.operations.vendor.create;

import com.example.zoostore.api.operations.item.create.CreateItemResponse;
import org.springframework.stereotype.Service;

@Service
public interface CreateVendorService {
    public CreateVendorResponse createVendor(CreateVendorRequest vendor);
}
