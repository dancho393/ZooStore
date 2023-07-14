package com.example.zoostore.api.operations.vendor.delete;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface DeleteVendorService {
    public DeleteVendorResponse deleteVendor(DeleteVendorRequest vendor) throws ResourceNotFoundExpcetion;
}
