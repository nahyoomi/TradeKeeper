package com.icodeap.tradekeeper.controller;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.Supplier;
import com.icodeap.tradekeeper.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api/supplier")
@CrossOrigin
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/suppliers")
    public ResponseEntity<List<Supplier>> getSuppliers() {
        List<Supplier> suppliers = supplierService.getSuppliers();
        return ResponseEntity.ok()
                .header("Access-control-allow-origin", "*")
                .body(suppliers);
    }

    @PostMapping
    public ResponseEntity<Supplier> createSupplier(@Valid  @RequestBody Supplier supplier) {
        Supplier newSupplier = supplierService.createSupplier(supplier);
        return ResponseEntity.ok(newSupplier);
    }
}
