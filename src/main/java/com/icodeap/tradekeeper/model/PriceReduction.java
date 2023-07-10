package com.icodeap.tradekeeper.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "priceReduction")
public class PriceReduction {
    @Id
    @Column(name = "priceReductionId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "priceReductionId")
    @SequenceGenerator(name="priceReductionId", sequenceName="priceReductionId" , initialValue=4, allocationSize=1)
    public Integer priceReductionId;
    @Column(name = "reducedPrice")
    public double reducedPrice;
    @Column(name = "startDate")
    public Date startDate;
    @Column(name = "endDate")
    public Date endDate;
    @Column(name = "item_id")
    private Integer item;

    public PriceReduction() {
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public PriceReduction(Integer priceReductionId, double reducedPrice, Date startDate, Date endDate) {
        this.priceReductionId = priceReductionId;
        this.reducedPrice = reducedPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public Integer getPriceReductionId() {
        return priceReductionId;
    }

    public void setPriceReductionId(Integer priceReductionId) {
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
