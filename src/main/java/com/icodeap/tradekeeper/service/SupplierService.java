package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Supplier;

import java.util.List;

public interface SupplierService {

    List<Supplier> getSuppliers();

    Supplier createSupplier(Supplier supplier);
}
