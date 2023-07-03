package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Supplier;
import com.icodeap.tradekeeper.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SupplierServiceImpl implements SupplierService{
    private final SupplierRepository supplierRepository;
    @Override
    public List<Supplier> getSuppliers() {
        return supplierRepository.findAll();
    }
    @Override
    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
