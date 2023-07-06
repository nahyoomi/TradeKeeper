package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@SpringBootTest
class ItemServiceImplTest {

    @Mock
    private ItemRepository itemRepository;
    @InjectMocks
    private ItemServiceImpl itemService;

    @Test
    void getAllItems() {
    }

    @Test
    void getItemByCode() {
    }

    @Test
    void getItemsByState() {
    }

    @Test
    void createItem() {
        // Crear un objeto Item de prueba
        Item item = new Item();
        item.setItemCode(1001);
        item.setDescription("Descripción del item");
        item.setPrice(10.99);
        item.setUserId("user1");

        // Mockear el comportamiento del repositorio
        when(itemRepository.save(item)).thenReturn(item);


        Item result = itemService.createItem(item);


        assertEquals("Active", result.getState());
    }

    @Test
    void updateItem() {
    }

    @Test
    void updatePriceReduction() {
    }

    @Test
    void deactivateItem() {
    }

    @Test
    void updateSupplier() {
    }
}