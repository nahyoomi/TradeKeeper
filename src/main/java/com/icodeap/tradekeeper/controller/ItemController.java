package com.icodeap.tradekeeper.controller;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value="item")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;
    public ItemController(ItemServiceImpl itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
        /*List<Item> items = getAllItems();

        if (items.isEmpty()) {
            String message = "No items avaible";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        } else {
            return ResponseEntity.ok("All items listed");
        }*/
        List<Item> items = itemService.getAllItems();

        return ResponseEntity.ok(items);
    }

    @PostMapping
    public ResponseEntity<Item> createItem(Item item) {

        Item newItem = itemService.createItem(item);

        return ResponseEntity.ok(newItem);
    }

    @PutMapping("/update")
    public ResponseEntity<Item> updateItem(Item item){

        Item updateItem = itemService.updateItem(item);

        return  ResponseEntity.ok(updateItem);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<Item> deactivateItem(Item item){

        Item deactivateItem = itemService.deactivateItem(item);


        return ResponseEntity.ok(deactivateItem);
    }

}