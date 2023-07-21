package com.example.zoostore.api.operations.vendor.get;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface GetVendorService extends Operation<GetVendorResponse,GetVendorRequest> {
    public GetVendorResponse process(GetVendorRequest vendor);
}
