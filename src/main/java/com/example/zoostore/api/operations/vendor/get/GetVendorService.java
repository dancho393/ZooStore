package com.example.zoostore.api.operations.vendor.get;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface GetVendorService {
    public GetVendorResponse getVendor(GetVendorRequest vendor) throws ResourceNotFoundExpcetion;
}
