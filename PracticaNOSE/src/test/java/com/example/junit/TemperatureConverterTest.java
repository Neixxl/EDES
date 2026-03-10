package com.example.junit;

import org.junit.Test;
import org.junit.Assert;

public class TemperatureConverterTest {
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testCelsiusToFahrenheit() {
        Assert.assertEquals("0 Celsius es 32 Fahrenheit", 32.0, converter.celsiusToFahrenheit(0), 0.001);
        Assert.assertEquals("100 Celsius es 212 Fahrenheit", 212.0, converter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        Assert.assertEquals("32 Fahrenheit es 0 Celsius", 0.0, converter.fahrenheitToCelsius(32), 0.001);
        Assert.assertEquals("212 Fahrenheit es 100 Celsius", 100.0, converter.fahrenheitToCelsius(212), 0.001);
    }
}
