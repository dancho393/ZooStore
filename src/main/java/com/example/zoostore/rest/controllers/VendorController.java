package com.example.zoostore.rest.controllers;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.vendor.create.CreateVendorRequest;
import com.example.zoostore.api.operations.vendor.create.CreateVendorService;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorRequest;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorService;
import com.example.zoostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zoostore.api.operations.vendor.edit.EditVendorService;
import com.example.zoostore.api.operations.vendor.get.GetVendorRequest;
import com.example.zoostore.api.operations.vendor.get.GetVendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vendor")
public class VendorController {

    private final CreateVendorService createVendorService;
    private final DeleteVendorService deleteVendorService;
    private final EditVendorService editVendorService;
    private final GetVendorService getVendorService;

    @PostMapping("/createVendor")
    public ResponseEntity createVendor(@RequestBody CreateVendorRequest vendor){
        return ResponseEntity.ok(createVendorService.process(vendor));
    }
    @DeleteMapping("/deleteVendor")
    public ResponseEntity deleteVendor(@RequestBody DeleteVendorRequest vendor) throws ResourceNotFoundException {
        return ResponseEntity.ok(deleteVendorService.process(vendor));
    }
    @PutMapping("/editVendor")
    public ResponseEntity editVendor(@RequestBody EditVendorRequest vendor) throws ResourceNotFoundException {
        return ResponseEntity.ok(editVendorService.process(vendor));
    }
    @GetMapping("/getVendor")
    public ResponseEntity getVendor(@RequestBody GetVendorRequest vendor) throws ResourceNotFoundException {
        return ResponseEntity.ok(getVendorService.process(vendor));
    }
}
