package com.icodeap.tradekeeper.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item_supplier")
@Data
public class Item_Supplier {
    @Id
    @Column(name = "item_supplier_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_supplier_id")
    @SequenceGenerator(name = "item_supplier_id", sequenceName = "item_supplier_id", initialValue = 3, allocationSize = 1)
    public Integer item_supplierId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_item")
    private Item idItem;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplierId;
}
