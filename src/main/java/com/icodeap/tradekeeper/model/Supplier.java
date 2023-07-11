package com.icodeap.tradekeeper.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supplier")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    @Id
    @Column(name = "supplierId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplierId")
    @SequenceGenerator(name="supplierId", sequenceName="supplierId" , initialValue=4, allocationSize=1)
    public Integer supplierId;

    public String name;
    public String country;

    @ManyToMany(mappedBy = "suppliers")
    private List<Item> items;
}
