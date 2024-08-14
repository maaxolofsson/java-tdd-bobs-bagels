package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    public BasketTest() {

    }

    @Test
    public void testAddBagel() {
        Basket b = new Basket();
        Assertions.assertTrue(b.add("testBagel"));
    }

    @Test
    public void testRemoveBagel() {
        Basket b = new Basket();
        b.add("test");
        Assertions.assertTrue(b.remove("test"));
    }

}
