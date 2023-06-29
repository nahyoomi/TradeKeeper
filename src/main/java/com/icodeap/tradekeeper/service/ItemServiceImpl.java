package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.repository.ItemRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAllItems() {
        Date currentDate = new Date();
        Item item_1 = new Item(1,"lorem ipsum", 2.67, "Active", currentDate, null );
        Item item_2 = new Item(2,"lorem ipsum", 7.23, "Deactive", currentDate, null );
        Item item_3 = new Item(3,"lorem ipsum", 17.40, "Active", currentDate, null );

        List<Item> listItem = new ArrayList<>();
        listItem.add(item_1);
        listItem.add(item_2);
        listItem.add(item_3);

        return itemRepository.findAll();
    }

    @Override
    public Item createItem(Item item) {
        Date currentDate = new Date();

        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        Date currentDate = new Date();
        return itemRepository.save(item);
    }

    @Override
    public Item deactivateItem(Item item) {
        Date currentDate = new Date();
        item.setState("Deactive");
        return itemRepository.save(item);
    }
}
