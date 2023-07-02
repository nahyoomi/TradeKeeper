package com.icodeap.tradekeeper.controller;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.ItemRequestDelete;
import com.icodeap.tradekeeper.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping (value="item")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;
    public ItemController(ItemServiceImpl itemService) {
        this.itemService = itemService;
    }
    //Lista de articulos ofrecidos, incluir filtrado de estado, debe contener code art, descrip,estado,precio, fechas de creacion y creador.
    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems(@RequestParam(required = false) String state) {
        List<Item> items;

        if (state != null) {
            items = itemService.getItemsByState(state);
        } else {
            items = itemService.getAllItems();
        }

        return ResponseEntity.ok(items);
    }
    //AQUI FALTA METODO - Info de un articulo, incluya proveedores y reduccciones de precios asociadas al art.

    //crear un art, campos obligatorios codigo del art y descripcion, establecer estado como activo, establecer la fecha de creacion.
    @PostMapping
    public ResponseEntity<Item> createItem(@Valid @RequestBody Item item) {


        Item newItem = itemService.createItem(item);

        return ResponseEntity.ok(newItem);
    }

    //Ediccion de todos los campos menos  codigo art, incluir opcionpara asociar proveedor al art y verificar que no haya sido asociado antes, opcion de insertar reducciones de precios.
    @PutMapping("/update")
    public ResponseEntity<Item> updateItem(@Valid @RequestBody Item item){

        Item updateItem = itemService.updateItem(item);

        return  ResponseEntity.ok(updateItem);
    }

    //que cambie a estado inactivo, razon por la cual se quita el articulo, registar usuario que realiza el cambio.
    @DeleteMapping("/remove")
    public ResponseEntity<Item> deactivateItem(@Valid @RequestBody ItemRequestDelete item){

        Item deactivateItem = itemService.deactivateItem(item);


        return ResponseEntity.ok(deactivateItem);
    }

}