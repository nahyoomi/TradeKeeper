package com.icodeap.tradekeeper.service;

import com.icodeap.tradekeeper.model.Item;
import com.icodeap.tradekeeper.model.request.ItemRequestDelete;
import com.icodeap.tradekeeper.repository.ItemRepository;
import com.icodeap.tradekeeper.repository.Item_SupplierRepository;
import com.icodeap.tradekeeper.repository.PriceReductionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ItemServiceImplTest {
    @Mock
    private ItemRepository itemRepository;

    @Mock
    private PriceReductionRepository priceReductionRepository;

    @Mock
    private Item_SupplierRepository item_supplierRepository;

    @InjectMocks
    private ItemServiceImpl itemService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllItems() {
        // Mock data
        List<Item> items = new ArrayList<>();
        items.add(new Item());
        when(itemRepository.findAll()).thenReturn(items);

        // Test
        List<Item> result = itemService.getAllItems();

        // Verify
        assertEquals(1, result.size());
        verify(itemRepository, times(1)).findAll();
    }

    @Test
    void testGetItemByCode() {
        // Mock data
        Item item = new Item();
        item.setItemCode(123);
        when(itemRepository.findByCustomCodeQuery(123)).thenReturn(item);

        // Test
        Item result = itemService.getItemByCode(123);

        // Verify
        assertNotNull(result);
        assertEquals(123, result.getItemCode());
        verify(itemRepository, times(1)).findByCustomCodeQuery(123);
    }

    @Test
    void testGetItemsByState() {
        // Mock data
        List<Item> items = new ArrayList<>();
        items.add(new Item());
        when(itemRepository.findByCustomStateQuery("Active")).thenReturn(items);

        // Test
        List<Item> result = itemService.getItemsByState("Active");

        // Verify
        assertEquals(1, result.size());
        verify(itemRepository, times(1)).findByCustomStateQuery("Active");
    }

    @Test
    void testCreateItem() {
        // Mock data
        Item item = new Item();
        item.setState("Active");
        Date currentDate = new Date();
        item.setCreationDate(currentDate);
        when(itemRepository.save(item)).thenReturn(item);

        // Test
        Item result = itemService.createItem(item);

        // Verify
        assertNotNull(result);
        assertEquals("Active", result.getState());
        verify(itemRepository, times(1)).save(item);
        }
    }
