package com.icodeap.tradekeeper.repository;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.PriceReduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PriceReductionRepository extends JpaRepository<PriceReduction, Integer> {

}