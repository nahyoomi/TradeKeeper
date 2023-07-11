package com.icodeap.tradekeeper.model.response;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.PriceReduction;
import com.icodeap.tradekeeper.model.Supplier;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ItemDetails {
    Item item;
    List<PriceReduction> priceReductionList;
    List<String> supplierList;

}
