package com.example.zoostore.controllers;

import com.example.zoostore.models.createVendorIO.VendorInput;
import com.example.zoostore.services.IMPL.VendorServiceIMPL;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vendor")
public class VendorController {

    private final VendorServiceIMPL vendorService;

    @PostMapping("/createVendor")
    public ResponseEntity createVendor(@RequestBody VendorInput vendor){
        return ResponseEntity.ok(vendorService.createVendor(vendor));
    }
}
