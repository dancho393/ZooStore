package com.example.zoostore.rest.controllers;

import com.example.zoostore.api.operations.vendor.create.CreateVendorRequest;
import com.example.zoostore.api.operations.vendor.create.CreateVendorOperation;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorRequest;
import com.example.zoostore.api.operations.vendor.delete.DeleteVendorOperation;
import com.example.zoostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zoostore.api.operations.vendor.edit.EditVendorOperation;
import com.example.zoostore.api.operations.vendor.get.GetVendorRequest;
import com.example.zoostore.api.operations.vendor.get.GetVendorOperation;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vendor")
public class VendorController {

    private final CreateVendorOperation createVendorOperation;
    private final DeleteVendorOperation deleteVendorOperation;
    private final EditVendorOperation editVendorOperation;
    private final GetVendorOperation getVendorOperation;

    @PostMapping("/createVendor")
    public ResponseEntity createVendor(@Valid @RequestBody CreateVendorRequest vendor){
        return ResponseEntity.ok(createVendorOperation.process(vendor));
    }
    @DeleteMapping("/deleteVendor")
    public ResponseEntity deleteVendor(@Valid @RequestBody DeleteVendorRequest vendor) throws ResourceNotFoundException {
        return ResponseEntity.ok(deleteVendorOperation.process(vendor));
    }
    @PutMapping("/editVendor")
    public ResponseEntity editVendor(@Valid @RequestBody EditVendorRequest vendor) throws ResourceNotFoundException {
        return ResponseEntity.ok(editVendorOperation.process(vendor));
    }
    @GetMapping("/getVendor")
    public ResponseEntity getVendor(@Valid @RequestBody GetVendorRequest vendor) throws ResourceNotFoundException {
        return ResponseEntity.ok(getVendorOperation.process(vendor));
    }
}
