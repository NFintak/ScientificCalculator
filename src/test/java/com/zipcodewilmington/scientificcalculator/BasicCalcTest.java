package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicCalcTest extends TestCase{
    @Test
    public void test1addTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.addTwoNumbers(5.00, 5.00);
        assertEquals(10.00, actual, 0.001);
    }

    @Test
    public void test2addTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.addTwoNumbers(-8.50, 6.50);
        assertEquals(-2.00, actual, 0.001);
    }

    @Test
    public void test3addTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.addTwoNumbers(240.50, 6.50);
        assertEquals(247.00, actual, 0.001);
    }

    @Test
    public void test1subTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.subTwoNumbers(10, 5);
        assertEquals(5.00, actual, 0.001);
    }

    @Test
    public void test2subTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.subTwoNumbers(2.50, 5.00);
        assertEquals(-2.50, actual, 0.001);
    }

    @Test
    public void test3subTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.subTwoNumbers(-12.50, 5.00);
        assertEquals(-17.50, actual, 0.001);
    }

    @Test
    public void test1multiplyTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.multiplyTwoNumbers(10, 10);
        assertEquals(100.00, actual, 0.001);
    }

    @Test
    public void test2multiplyTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.multiplyTwoNumbers(-5, 3);
        assertEquals(-15.00, actual, 0.001);
    }

    @Test
    public void test3multiplyTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.multiplyTwoNumbers(-5, -3);
        assertEquals(15.00, actual, 0.001);
    }

    @Test
    public void test1divTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.divTwoNumbers(8, 2);
        assertEquals(4, actual, 0.001);
    }

    @Test
    public void test2divTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.divTwoNumbers(5, 2);
        assertEquals(2.50, actual, 0.001);
    }

    @Test
    public void test3divTwoNumbers() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.divTwoNumbers(-15, -2);
        assertEquals(7.50, actual, 0.001);
    }

    @Test
    public void test1inverseNumber() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.inverseNumber(8);
        assertEquals(.125, actual, 0.001);
    }

    @Test
    public void test2inverseNumber() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.inverseNumber(.5);
        assertEquals(2, actual, 0.001);
    }

    @Test
    public void test1squaredNumber() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.squareNumber(5);
        assertEquals(25.00, actual, 0.001);
    }

    @Test
    public void test2squaredNumber() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.squareNumber(-3);
        assertEquals(9.00, actual, 0.001);
    }

    @Test
    public void test1varExponent() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.varExponent(5, 3);
        assertEquals(125.00, actual, 0.001);
    }

    @Test
    public void test2varExponent() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.varExponent(-4, 3);
        assertEquals(-64, actual, 0.001);
    }

    @Test
    public void test1squareRoot() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.squareRoot(36);
        assertEquals(6, actual, 0.001);
    }

    @Test
    public void test2squareRoot() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.squareRoot(100);
        assertEquals(10, actual, 0.001);
    }

    @Test
    public void test1invertSign() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.invertSign(15);
        assertEquals(-15, actual, 0.001);
    }

    @Test
    public void test2invertSign() {
        BasicCalc basicCalc1 = new BasicCalc();
        double actual = basicCalc1.invertSign(-95);
        assertEquals(95, actual, 0.001);
    }
}