package com.icodeap.tradekeeper.model;

import java.util.Date;

public class Item {
    public int itemCode;
    public String description;
    public double price;
    public String state;
    public Date creationDate;
    public User creator;

    public Item() {

    }

    public Item(int itemCode, String description, double price, String state, Date creationDate, User creator) {
        this.itemCode = itemCode;
        this.description = description;
        this.price = price;
        this.state = state;
        this.creationDate = creationDate;
        this.creator = creator;
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

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
