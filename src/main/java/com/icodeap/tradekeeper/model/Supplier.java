package com.icodeap.tradekeeper.model;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @Column(name = "supplierId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public String supplierId;
    @Column(name = "name")
    public String name;
    @Column(name = "country")
    public String country;

    public Supplier() {

    }

    public Supplier(String supplierId, String name, String country) {
        this.supplierId = supplierId;
        this.name = name;
        this.country = country;
    }
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
