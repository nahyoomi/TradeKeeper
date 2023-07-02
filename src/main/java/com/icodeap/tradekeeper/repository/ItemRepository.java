package com.icodeap.tradekeeper.repository;

import com.icodeap.tradekeeper.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    @Query("SELECT i FROM Item i WHERE i.state = :state")
    List<Item> findByCustomStateQuery(@Param("state")String state);
}
