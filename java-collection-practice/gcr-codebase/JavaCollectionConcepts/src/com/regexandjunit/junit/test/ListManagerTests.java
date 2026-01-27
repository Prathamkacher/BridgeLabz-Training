package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.listops.ListManager;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTests {

    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);

        manager.removeElement(list, 5);

        assertFalse(list.contains(5));
        assertEquals(1, list.size());
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 1);
        manager.addElement(list, 2);
        manager.addElement(list, 3);

        assertEquals(3, manager.getSize(list));
    }
}
