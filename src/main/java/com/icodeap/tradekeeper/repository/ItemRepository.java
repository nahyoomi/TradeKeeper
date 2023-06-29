package com.icodeap.tradekeeper.repository;

import com.icodeap.tradekeeper.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
