package com.icodeap.tradekeeper.model;

import java.util.Date;

public class PriceReduction {
    public double reducedPrice;
    public Date startDate;
    public Date endDate;

    public PriceReduction(double reducedPrice, Date startDate, Date endDate) {
        this.reducedPrice = reducedPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public double getReducedPrice() {
        return reducedPrice;
    }

    public void setReducedPrice(double reducedPrice) {
        this.reducedPrice = reducedPrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
