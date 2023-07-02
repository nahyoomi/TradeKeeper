package com.icodeap.tradekeeper.model;


import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "idItem")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    public Item() {

    }

    public Item(int itemCode, String description, double price, String state, Date creationDate, String userId) {
        this.itemCode = itemCode;
        this.description = description;
        this.price = price;
        this.state = state;
        this.creationDate = creationDate;
        this.userId = userId;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
