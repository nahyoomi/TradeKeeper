package com.icodeap.tradekeeper.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item_supplier")
@Data
public class Item_Supplier {
    @Id
    @Column(name = "item_supplierId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_supplierId")
    @SequenceGenerator(name="item_supplierId", sequenceName="item_supplierId" , initialValue=4, allocationSize=1)
    public Integer item_supplierId;

    public Integer supplierId;
    public Integer idItem;

}
