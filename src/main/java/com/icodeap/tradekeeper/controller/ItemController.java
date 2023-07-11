package com.icodeap.tradekeeper.controller;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.Item_Supplier;
import com.icodeap.tradekeeper.model.request.ItemRequestDelete;
import com.icodeap.tradekeeper.model.request.ItemSupplierRequest;
import com.icodeap.tradekeeper.model.response.ItemDetails;
import com.icodeap.tradekeeper.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping (value="/api/item")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;
    public ItemController(ItemServiceImpl itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items/{state}")
    public ResponseEntity<List<Item>> getAllItems(@PathVariable String state) {
        List<Item> items;

        if (state.matches("Active|Deactive")) {
            items = itemService.getItemsByState(state);
        } else {
            items = itemService.getAllItems();
        }

         return ResponseEntity.ok()
                .header("Access-control-allow-origin", "*")
                .body(items);
    }

    @GetMapping("/{itemCode}")
    public ResponseEntity<ItemDetails>getItemDetails(@PathVariable Integer itemCode){
        ItemDetails item = itemService.getItemByCode(itemCode);
        return ResponseEntity.ok()
                .header("Access-control-allow-origin", "*")
                .body(item);
    }
    @PostMapping
    public ResponseEntity<Item> createItem(@Valid @RequestBody Item item) {

        Item newItem = itemService.createItem(item);

        return ResponseEntity.ok(newItem);
    }

    @PutMapping("/update")
    public ResponseEntity<Item> updateItem(@Valid @RequestBody Item item){

        Item updateItem = itemService.updateItem(item);

        return  ResponseEntity.ok(updateItem);
    }

    @DeleteMapping("/remove/{idItem}/{reason}")
    public ResponseEntity<Item> deactivateItem(@Valid @PathVariable Integer idItem, @PathVariable String reason){

        ItemRequestDelete itemRequestDelete = new ItemRequestDelete(idItem, reason);
        Item deactivateItem = itemService.deactivateItem(itemRequestDelete);


        return ResponseEntity.ok(deactivateItem);
    }

    @PutMapping("/priceReduction")
    public ResponseEntity<Item> updatePriceReduction(@Valid @RequestBody Item item){

        Item updateItem = itemService.updatePriceReduction(item);

        return  ResponseEntity.ok(updateItem);
    }

    @PutMapping("/supplier")
    public ResponseEntity<Item_Supplier> updateSupplier(@Valid @RequestBody ItemSupplierRequest item){

        Item_Supplier Item_Supplier = itemService.updateSupplier(item);

        return  ResponseEntity.ok(Item_Supplier);
    }



}