package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.Item_Supplier;
import com.icodeap.tradekeeper.model.request.ItemRequestDelete;
import com.icodeap.tradekeeper.model.request.ItemSupplierRequest;
import com.icodeap.tradekeeper.model.response.ItemDetails;

import java.util.List;

public interface ItemService {
    public List<Item> getAllItems();
    public ItemDetails getItemByCode(Integer itemCode);
    public List<Item> getItemsByState(String state);
    public Item createItem(Item item);
    public Item updateItem(Item item);
    public Item updatePriceReduction(Item item);
    public Item deactivateItem(ItemRequestDelete item) throws Exception;
    public Item_Supplier updateSupplier(ItemSupplierRequest item);
}
