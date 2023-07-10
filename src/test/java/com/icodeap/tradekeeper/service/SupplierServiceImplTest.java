package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Supplier;
import com.icodeap.tradekeeper.repository.SupplierRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class SupplierServiceImplTest {
    @Mock
    private SupplierRepository supplierRepository;

    @InjectMocks
    private SupplierServiceImpl supplierService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetSuppliers() {
        // Mock data
        List<Supplier> suppliers = new ArrayList<>();
        suppliers.add(new Supplier());
        when(supplierRepository.findAll()).thenReturn(suppliers);

        // Test
        List<Supplier> result = supplierService.getSuppliers();

        // Verify
        assertEquals(1, result.size());
        verify(supplierRepository, times(1)).findAll();
    }

    @Test
    void testCreateSupplier() {
        // Mock data
        Supplier supplier = new Supplier();
        when(supplierRepository.save(supplier)).thenReturn(supplier);

        // Test
        Supplier result = supplierService.createSupplier(supplier);

        // Verify
        assertEquals(supplier, result);
        verify(supplierRepository, times(1)).save(supplier);
    }
}