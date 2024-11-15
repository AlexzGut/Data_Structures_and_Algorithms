package com.alexzgut.dsa.DataStructures;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.alexzgut.dsa.DataStructures.Array.ArrayX;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArrayXTests {

    private static ArrayX array;
    @BeforeAll
    static void setUp() {
        array = new ArrayX(10);
    }

    @Test
    @Order(1)
    void insertingItemInEmptyArray() {
        array.insert(1);

        assertEquals(1, array.get(0));
        assertEquals(1, array.size());
    }

    @Test
    @Order(2)
    void insertingMultipleItems() {
        int itemsToInsert = 5;
        for (int i = 1; i <= itemsToInsert; i++) {
            array.insert(i + 1);
        }

        for (int i = 1; i <= itemsToInsert; i++) {
            assertEquals(i+1, array.get(i));
        }

        assertEquals(6, array.size());
    }

    @Test
    @Order(3)
    void insertingItemAtSpecificPosition() {
        array.insert(2, 10);

        assertEquals(10, array.get(2));
        assertEquals(7, array.size());
    }

    @Test
    @Order(4)
    void deletionOfAnItemByValue() {
        array.delete(3L);

        assertEquals(6, array.size());
    }

    @Test
    @Order(5)
    void deletionOfAnItemByPosition() {
        array.delete(3);

        assertEquals(5, array.size());
    }

    @Test
    @Order(6)
    void containsAnItem() {
        assertTrue(array.contains(5));
    }

    @Test
    @Order(7)
    void doesNotContainAnItem() {
        assertFalse(array.contains(3));
    }

    @Test
    @Order(8)
    void SearchingForAnExistingItem() {
        assertEquals(2, array.indexOf(10));
    }

    @Test
    @Order(9)
    void SearchingForANonExistingItem() {
        assertEquals(-1, array.indexOf(100));
    }
}
