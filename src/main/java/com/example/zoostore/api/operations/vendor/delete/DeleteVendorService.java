package com.example.zoostore.api.operations.vendor.delete;

import com.example.zoostore.api.operations.Operation;
import com.example.zoostore.api.operations.OperationRequest;
import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface DeleteVendorService extends Operation<DeleteVendorResponse,DeleteVendorRequest> {
    public DeleteVendorResponse process(DeleteVendorRequest vendor);
}
