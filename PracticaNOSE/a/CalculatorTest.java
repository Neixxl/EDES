package com.example.junit;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    public void testSum() {
        Assert.assertEquals("La suma debería ser 5", 5, calc.sum(2, 3));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals("La resta debería ser 1", 1, calc.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals("La multiplicación debería ser 6", 6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals("La división debería ser 2.0", 2.0, calc.divide(6, 3), 0.001);
    }

    @Test
    public void testDivideByZero() {
        Assert.assertThrows(ArithmeticException.class, () -> calc.divide(6, 0));
    }
}
