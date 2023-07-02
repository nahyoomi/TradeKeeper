package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.ItemRequestDelete;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService {
    public List<Item> getAllItems();
    public Item getItemByCode(Integer itemCode);
    public List<Item> getItemsByState(String state);
    public Item createItem(Item item);
    public Item updateItem(Item item);
    public Item updatePriceReduction(Item item);
    public Item deactivateItem(ItemRequestDelete item) throws Exception;

}
