package com.example.zoostore.api.operations.vendor.edit;

import com.example.zoostore.api.operations.Operation;
import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface EditVendorService extends Operation<EditVendorResponse,EditVendorRequest> {
    public EditVendorResponse process(EditVendorRequest vendor);
}
