package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.*;
import com.icodeap.tradekeeper.repository.ItemRepository;
import com.icodeap.tradekeeper.repository.Item_SupplierRepository;
import com.icodeap.tradekeeper.repository.PriceReductionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
    private final PriceReductionRepository priceReductionRepository;
    private final Item_SupplierRepository item_supplierRepository;


    @Override
    public List<Item> getAllItems() {

        return itemRepository.findAll();
    }

    @Override
    public Item getItemByCode(Integer itemCode) {
        Item item = itemRepository.findByCustomCodeQuery(itemCode);
        item.setPriceReductions(item.getPriceReductions());
        return item;
    }

    @Override
    public List<Item> getItemsByState(String state) {
        return itemRepository.findByCustomStateQuery(state);
    }

    @Override
    public Item createItem(Item item) {
        item.setState("Active");
        Date currentDate = new Date();
        item.setCreationDate(currentDate);

        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        Date currentDate = new Date();
        return itemRepository.save(item);
    }

    @Override
    public Item updatePriceReduction(Item item) {

        PriceReduction priceReduction = new PriceReduction();
        /*Date currentDate = new Date();
        priceReduction.setReducedPrice(9.99);
        priceReduction.setStartDate(currentDate);
        priceReduction.setEndDate(currentDate);
        priceReduction.setItem(1);*/
        priceReduction = item.getPriceReductions().get(0);
        priceReductionRepository.save(priceReduction);

        return item;
    }

    @Override
    public Item deactivateItem(ItemRequestDelete itemRequestDelete) throws NoSuchElementException {
        LocalDateTime currentDate = LocalDateTime.now();

        Item item = itemRepository.findById(itemRequestDelete.getIdItem())
                .orElseThrow(() -> new NoSuchElementException("El objeto Item no existe"));


        item.setState("Deactive");
        return itemRepository.save(item);
    }

    @Override
    public Item updateSupplier(Item item) {
        Item_Supplier item_supplier = new Item_Supplier();
        item_supplier.setSupplierId(item.getSuppliers().get(0).getSupplierId());
        item_supplier.setIdItem(item.getIdItem());
        item_supplierRepository.save(item_supplier);
        return item;
    }
}
