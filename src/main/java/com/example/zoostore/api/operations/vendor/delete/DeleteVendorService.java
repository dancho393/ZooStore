package com.example.zoostore.api.operations.vendor.delete;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface DeleteVendorService extends Operation<DeleteVendorResponse,DeleteVendorRequest> {
    public DeleteVendorResponse process(DeleteVendorRequest vendor);
}
