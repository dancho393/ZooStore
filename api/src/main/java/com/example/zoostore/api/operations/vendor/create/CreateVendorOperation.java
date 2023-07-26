package com.example.zoostore.api.operations.vendor.create;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface CreateVendorOperation extends Operation<CreateVendorResponse,CreateVendorRequest> {
    public CreateVendorResponse process(CreateVendorRequest vendor);
}
