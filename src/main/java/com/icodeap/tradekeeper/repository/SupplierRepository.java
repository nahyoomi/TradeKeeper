package com.icodeap.tradekeeper.repository;


import com.icodeap.tradekeeper.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
