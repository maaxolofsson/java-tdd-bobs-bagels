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

    @Test
    public void testIsBasketFull() {
        Basket b = new Basket();
        b.add("test");
        b.add("test2");
        b.add("test3");
        b.add("test4");
        b.add("test5");
        b.add("test6");
        b.add("test7");
        b.add("test8");
        b.add("test9");
        b.add("test10");
        Assertions.assertTrue(b.isFull());
    }

}
