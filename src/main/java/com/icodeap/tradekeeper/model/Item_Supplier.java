package com.icodeap.tradekeeper.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item_supplier")
@Data
public class Item_Supplier {
    @Id
    @Column(name = "item_supplierId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer item_supplierId;

    public Integer supplierId;
    public Integer idItem;

}
