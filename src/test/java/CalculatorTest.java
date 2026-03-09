//package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        Assert.assertEquals(calc.add(10, 5), 15);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calc.subtract(10, 5), 5);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(calc.multiply(10, 5), 50);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calc.divide(10, 5), 2);
    }
}