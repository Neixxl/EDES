package com.example.junit;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class ListManagerTest {
    private ListManager manager;

    @Before
    public void setup() {
        manager = new ListManager();
    }

    @Test
    public void testAddElement() {
        manager.addElement("Test");
        Assert.assertEquals(1, manager.size());
    }

    @Test
    public void testRemoveByValue() {
        manager.addElement("Test");
        manager.removeByValue("Test");
        Assert.assertTrue(manager.isEmpty());
    }

    @Test
    public void testRemoveByIndexSuccess() {
        manager.addElement("Item1");
        manager.addElement("Item2");
        manager.removeByIndex(0);
        Assert.assertEquals(1, manager.size());
    }

    @Test
    public void testRemoveByIndexFailure() {
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> manager.removeByIndex(0));
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue("Debería estar vacía al inicio", manager.isEmpty());
        manager.addElement("Item");
        Assert.assertFalse("No debería estar vacía tras añadir", manager.isEmpty());
    }
}
