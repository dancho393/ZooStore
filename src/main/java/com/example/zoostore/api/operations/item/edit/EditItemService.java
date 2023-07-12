package com.example.zoostore.api.operations.item.edit;

import com.example.zoostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zoostore.api.operations.vendor.edit.EditVendorResponse;
import org.springframework.stereotype.Service;

@Service
public interface EditItemService {
    public EditVendorResponse editItem(EditItemRequest item);
}
