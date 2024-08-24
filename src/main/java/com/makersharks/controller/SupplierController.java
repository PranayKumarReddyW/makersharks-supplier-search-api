package com.makersharks.controller;

import com.makersharks.model.*;
import com.makersharks.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> searchSuppliers(
            @RequestParam String location,
            @RequestParam NatureOfBusiness natureOfBusiness,
            @RequestParam ManufacturingProcess manufacturingProcess) {

        List<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcess);
        return ResponseEntity.ok(suppliers);
    }
}
