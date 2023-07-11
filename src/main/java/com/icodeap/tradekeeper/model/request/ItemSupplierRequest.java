package com.icodeap.tradekeeper.model.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class ItemSupplierRequest {
    @NotNull
    public Integer idItem;

    @NotNull
    public Integer supplierId;
}
