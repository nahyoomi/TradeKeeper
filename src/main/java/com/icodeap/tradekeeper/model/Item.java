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
    @Column(name = "idItem")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idItem")
    @SequenceGenerator(name="idItem", sequenceName="idItem" , initialValue=4, allocationSize=1)
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

    @ManyToMany
    @JoinTable(name = "Item_Supplier",
            joinColumns = @JoinColumn(name = "idItem"),
            inverseJoinColumns = @JoinColumn(name = "supplierId"))
    private List<Supplier> suppliers;

}
