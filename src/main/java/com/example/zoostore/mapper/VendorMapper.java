package com.example.zoostore.mapper;

import com.example.zoostore.dto.addVendorIO.VendorInput;
import com.example.zoostore.dto.addVendorIO.VendorOutput;
import com.example.zoostore.entities.Item;
import com.example.zoostore.entities.Vendor;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class VendorMapper {
    public Vendor toEntity(VendorInput vendor){

        Vendor vendorEntity = new Vendor();
        vendorEntity.setName(vendor.getName());
        vendorEntity.setItems(new HashSet<Item>());
        return vendorEntity;
    }
    public VendorOutput toVendorOutput(Vendor vendor){
        return new VendorOutput(vendor.getName());
    }
}
