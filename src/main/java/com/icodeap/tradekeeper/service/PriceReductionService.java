package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.PriceReduction;

import java.util.List;

public interface PriceReductionService {
    List<PriceReduction> getPriceReductions();
    PriceReduction createPriceReduction(PriceReduction priceReduction);
}
