package com.icodeap.tradekeeper.model;


import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "item")
@Data
public class Item {
    @Id
    @Column(name = "id_item")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_item")
    @SequenceGenerator(name="id_item", sequenceName="id_item" , initialValue=4, allocationSize=1)
    public Integer idItem;
    @Column(name = "itemCode", nullable = false)
    @NotNull
    public Integer itemCode;
    @Column(name = "description", nullable = false)
    @NotNull
    public String description;
    @Column(name = "price")
    public double price;
    @Column(name = "state")
    public String state;
    @Column(name = "creationDate")
    public Date creationDate;
    @Column(name = "userId")
    public String userId;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PriceReduction> priceReductions;

    @OneToMany
    @JoinTable(name = "Item_Supplier",
            joinColumns = @JoinColumn(name = "id_item"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id"))
    private List<Item_Supplier> suppliers;

}
