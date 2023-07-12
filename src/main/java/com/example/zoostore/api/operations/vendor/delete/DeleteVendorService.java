package com.example.zoostore.api.operations.vendor.delete;

import org.springframework.stereotype.Service;

@Service
public interface DeleteVendorService {
    public DeleteVendorResponse deleteVendor(DeleteVendorRequest vendor);
}
