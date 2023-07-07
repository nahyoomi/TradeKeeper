package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.PriceReduction;
import com.icodeap.tradekeeper.repository.PriceReductionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PriceReductionImpl implements PriceReductionService {
    private final PriceReductionRepository priceReductionRepository;

    @Override
    public List<PriceReduction> getPriceReductions() {
        return priceReductionRepository.findAll();
    }

    @Override
    public PriceReduction createPriceReduction(PriceReduction priceReduction) {
        return priceReductionRepository.save(priceReduction);
    }
}
