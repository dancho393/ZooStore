package com.example.zoostore.api.operations.vendor.get;

import org.springframework.stereotype.Service;

@Service
public interface GetVendorService {
    public GetVendorResponse getVendor(GetVendorRequest vendor);
}
