package com.example.zoostore.controllers;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
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
        return ResponseEntity.ok(createVendorService.createVendor(vendor));
    }
    @DeleteMapping("/deleteVendor")
    public ResponseEntity deleteVendor(@RequestBody DeleteVendorRequest vendor) throws ResourceNotFoundExpcetion {
        return ResponseEntity.ok(deleteVendorService.deleteVendor(vendor));
    }
    @PutMapping("/editVendor")
    public ResponseEntity editVendor(@RequestBody EditVendorRequest vendor) throws ResourceNotFoundExpcetion {
        return ResponseEntity.ok(editVendorService.edinVendor(vendor));
    }
    @GetMapping("/getVendor")
    public ResponseEntity getVendor(@RequestBody GetVendorRequest vendor) throws ResourceNotFoundExpcetion {
        return ResponseEntity.ok(getVendorService.getVendor(vendor));
    }
}
