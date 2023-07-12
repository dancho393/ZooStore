package com.example.zoostore.bussiness.mapper;

import com.example.zoostore.models.createVendorIO.VendorInput;
import com.example.zoostore.models.createVendorIO.VendorOutput;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.entities.Vendor;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class VendorMapper {
    public Vendor toEntity(VendorInput vendor){

        Vendor vendorEntity =  Vendor.builder()
                .name(vendor.getName())
                .items(new HashSet<Item>())
                .build();
        return vendorEntity;
    }
    public VendorOutput toVendorOutput(Vendor vendor){
        return new VendorOutput(vendor.getId(), vendor.getName());
    }
}