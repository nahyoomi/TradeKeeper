package com.icodeap.tradekeeper.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "priceReduction")
public class PriceReduction {
    @Id
    @Column(name = "priceReductionId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public String priceReductionId;
    @Column(name = "reducedPrice")
    public double reducedPrice;
    @Column(name = "startDate")
    public Date startDate;
    @Column(name = "endDate")
    public Date endDate;

    public PriceReduction() {
    }

    public PriceReduction(String priceReductionId, double reducedPrice, Date startDate, Date endDate) {
        this.priceReductionId = priceReductionId;
        this.reducedPrice = reducedPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public String getPriceReductionId() {
        return priceReductionId;
    }

    public void setPriceReductionId(String priceReductionId) {
        this.priceReductionId = priceReductionId;
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
