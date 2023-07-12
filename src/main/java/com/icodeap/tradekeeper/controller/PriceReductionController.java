package com.icodeap.tradekeeper.controller;

import com.icodeap.tradekeeper.model.PriceReduction;
import com.icodeap.tradekeeper.service.PriceReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="priceReduction")
@CrossOrigin
public class PriceReductionController {
    @Autowired
    private PriceReductionService priceReductionService;

    @GetMapping("/priceReductions")
    public ResponseEntity<List<PriceReduction>> getPriceReductions() {
        List<PriceReduction> priceReductions = priceReductionService.getPriceReductions();
        return ResponseEntity.ok()
                .header("Access-control-allow-origin", "*")
                .body(priceReductions);
    }
    @PostMapping
    public ResponseEntity<PriceReduction> createPriceReduction(@Valid @RequestBody PriceReduction priceReduction) {
        PriceReduction newPriceReduction = priceReductionService.createPriceReduction(priceReduction);
        return ResponseEntity.ok(newPriceReduction);
    }
}
