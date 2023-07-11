package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.*;
import com.icodeap.tradekeeper.model.request.ItemRequestDelete;
import com.icodeap.tradekeeper.model.request.ItemSupplierRequest;
import com.icodeap.tradekeeper.model.response.ItemDetails;
import com.icodeap.tradekeeper.repository.ItemRepository;
import com.icodeap.tradekeeper.repository.Item_SupplierRepository;
import com.icodeap.tradekeeper.repository.PriceReductionRepository;
import com.icodeap.tradekeeper.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    private final SupplierRepository supplierRepository;
    private final PriceReductionRepository priceReductionRepository;
    private final Item_SupplierRepository item_supplierRepository;


    @Override
    public List<Item> getAllItems() {

        return itemRepository.findAll();
    }

    @Override
    public ItemDetails getItemByCode(Integer itemCode) {

        Item item = itemRepository.findByCustomCodeQuery(itemCode);
        item.setPriceReductions(item.getPriceReductions());
        item.setSuppliers(item.getSuppliers());

        ItemDetails ItemDetails = com.icodeap.tradekeeper.model.response.ItemDetails.builder()
                .item(item)
                .priceReductionList(item.getPriceReductions())
                .supplierList(null)
                .build();

        return ItemDetails;
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
    public Item_Supplier updateSupplier(ItemSupplierRequest item) {
        Item_Supplier item_supplier = new Item_Supplier();

        Item item1 = itemRepository.findById(item.getIdItem()).get();

        Supplier supplier = supplierRepository.findById(item.getSupplierId()).get();


        item_supplier.setIdItem(item1);
        item_supplier.setSupplierId(supplier);

        return item_supplierRepository.save(item_supplier);

    }
}
