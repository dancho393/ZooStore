package com.example.zoostore.api.operations.vendor.edit;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface EditVendorService {
    public EditVendorResponse edinVendor(EditVendorRequest vendor) throws ResourceNotFoundExpcetion;
}
