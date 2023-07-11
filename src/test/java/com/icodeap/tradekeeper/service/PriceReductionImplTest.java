package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.PriceReduction;
import com.icodeap.tradekeeper.repository.PriceReductionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class PriceReductionImplTest {
    @Mock
    private PriceReductionRepository priceReductionRepository;

    @InjectMocks
    private PriceReductionImpl priceReductionService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetPriceReductions() {
        // Mock data
        List<PriceReduction> priceReductions = new ArrayList<>();
        priceReductions.add(new PriceReduction());
        when(priceReductionRepository.findAll()).thenReturn(priceReductions);

        // Test
        List<PriceReduction> result = priceReductionService.getPriceReductions();

        // Verify
        assertEquals(1, result.size());
        verify(priceReductionRepository, times(1)).findAll();
    }

    @Test
    void testCreatePriceReduction() {
        // Mock data
        PriceReduction priceReduction = new PriceReduction();
        when(priceReductionRepository.save(priceReduction)).thenReturn(priceReduction);

        // Test
        PriceReduction result = priceReductionService.createPriceReduction(priceReduction);

        // Verify
        assertEquals(priceReduction, result);
        verify(priceReductionRepository, times(1)).save(priceReduction);
    }
}