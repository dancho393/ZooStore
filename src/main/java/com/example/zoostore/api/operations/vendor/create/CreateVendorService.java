package com.example.zoostore.api.operations.vendor.create;

import com.example.zoostore.api.operations.Operation;
import com.example.zoostore.api.operations.OperationRequest;
import org.springframework.stereotype.Service;

@Service
public interface CreateVendorService   extends Operation<CreateVendorResponse,CreateVendorRequest> {
    public CreateVendorResponse process(CreateVendorRequest vendor);
}
