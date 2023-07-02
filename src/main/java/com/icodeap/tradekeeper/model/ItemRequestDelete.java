package com.icodeap.tradekeeper.model;

import javax.validation.constraints.NotNull;

public class ItemRequestDelete {
    @NotNull
    public Integer idItem;
    @NotNull
    public String reason;

    public ItemRequestDelete(Integer idItem, String reason) {
        this.idItem = idItem;
        this.reason = reason;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
