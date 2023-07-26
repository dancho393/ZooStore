package com.example.zoostore.api.operations.vendor.edit;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface EditVendorOperation extends Operation<EditVendorResponse,EditVendorRequest> {
    public EditVendorResponse process(EditVendorRequest vendor);
}
