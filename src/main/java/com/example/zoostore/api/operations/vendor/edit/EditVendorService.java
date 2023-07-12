package com.example.zoostore.api.operations.vendor.edit;

import org.springframework.stereotype.Service;

@Service
public interface EditVendorService {
    public EditVendorResponse edinVendor(EditVendorRequest vendor);
}
