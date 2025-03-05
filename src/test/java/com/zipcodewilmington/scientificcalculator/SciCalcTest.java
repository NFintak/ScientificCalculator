package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SciCalcTest {

    @Test
    void log() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.log(5);
        assertEquals(1.6094379124341003, actual, 0.001);
    }

    @Test
    void log2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.log(10);
        assertEquals(2.302585092994046, actual, 0.001);
    }

    @Test
    void log3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.log(25);
        assertEquals(3.2188758248682006, actual, 0.001);
    }

    @Test
    void inverseLog() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.inverseLog(120);
        assertEquals(2.0791812460476247, actual, 0.001);
    }

    @Test
    void inverseLog2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.inverseLog(1);
        assertEquals(0.0, actual, 0.001);
    }

    @Test
    void inverseLog3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.inverseLog(10);
        assertEquals(1.0, actual, 0.001);
    }

    @Test
    void ln() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.ln(100);
        assertEquals(4.605170185988092, actual, 0.1);
    }

    @Test
    void ln2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.ln(10);
        assertEquals(2.302585092994046, actual, 0.1);
    }

    @Test
    void ln3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.ln(90);
        assertEquals(4.499809670330265, actual, 0.1);
    }

    @Test
    void ex() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.ex(1);
        assertEquals(2.718281828459045, actual, 0.001);
    }

    @Test
    void ex2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.ex(0);
        assertEquals(1, actual, 0.001);
    }

    @Test
    void ex3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.ex(10);
        assertEquals(22026.465794806718, actual, 0.001);
    }

    @Test
    void binaryString() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.BinaryString(5);
        assertEquals("101", actual);
    }

    @Test
    void binaryString2() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.BinaryString(12);
        assertEquals("1100", actual);
    }

    @Test
    void binaryString3() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.BinaryString(17);
        assertEquals("10001", actual);
    }

    @Test
    void octalString() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.OctalString(527);
        assertEquals("1017", actual);
    }

    @Test
    void octalString2() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.OctalString(16);
        assertEquals("20", actual);
    }

    @Test
    void octalString3() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.OctalString(33);
        assertEquals("41", actual);
    }

    @Test
    void decimal() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.Decimal(33);
        assertEquals("33.00000000", actual);
    }

    @Test
    void decimal2() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.Decimal(33.123456781);
        assertEquals("33.12345678", actual);
    }

    @Test
    void decimal3() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.Decimal(33.123456789);
        assertEquals("33.12345679", actual);
    }

    @Test
    void hexString() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.HexString(11);
        assertEquals("b", actual);
    }

    @Test
    void hexString2() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.HexString(234);
        assertEquals("ea", actual);
    }

    @Test
    void hexString3() {
        SciCalc sciCalc1 = new SciCalc();
        String actual = sciCalc1.HexString(12);
        assertEquals("c", actual);
    }

    @Test
    void sine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.sine(5);
        assertEquals(0.08715574, actual, 0.001);
    }

    @Test
    void sine2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.sine(45);
        assertEquals(0.70710678, actual, 0.001);
    }

    @Test
    void sine3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.sine(90);
        assertEquals(1, actual, 0.001);
    }



    @Test
    void aSine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.aSine(0.5);
        assertEquals(0.52359877, actual, 0.001);
    }

    @Test
    void aSine2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.aSine(1);
        assertEquals(1.5707963267949, actual, 0.001);
    }

    @Test
    void aSine3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.aSine(0.9);
        assertEquals(1.1197695149986, actual, 0.001);
    }


    @Test
    void cosine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.cosine(30);
        assertEquals(0.8660254, actual, 0.001);
    }

    @Test
    void cosine2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.cosine(90);
        assertEquals(0, actual, 0.001);
    }

    @Test
    void cosine3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.cosine(45);
        assertEquals(0.70710678, actual, 0.001);
    }

    @Test
    void inverseCosine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.inverseCosine(0.5);
        assertEquals(1.04719755, actual, 0.001);
    }

    @Test
    void tangent() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Tangent(45);
        assertEquals(1, actual, 0.001);
    }

    @Test
    void tangent2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Tangent(30);
        assertEquals(0.57735026, actual, 0.001);
    }

    @Test
    void tangent3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Tangent(15);
        assertEquals(0.26794919, actual, 0.001);
    }

    @Test
    void inverseTangent() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.InverseTangent(1);
        assertEquals(0.78539816339745, actual, 0.001);
    }

    @Test
    void inverseTangent2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.InverseTangent(0.5);
        assertEquals(0.46364760900081, actual, 0.001);
    }

    @Test
    void inverseTangent3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.InverseTangent(-0.5);
        assertEquals(-0.46364760900081, actual, 0.001);
    }

    @Test
    void radians() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Radians(30);
        assertEquals(0.52359878, actual, 0.001);
    }

    @Test
    void radians2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Radians(45);
        assertEquals(0.78539816, actual, 0.001);
    }

    @Test
    void radians3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Radians(90);
        assertEquals(1.57079633, actual, 0.001);
    }

    @Test
    void degrees() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Degrees(0.52359878);
        assertEquals(30, actual, 0.001);
    }

    @Test
    void degrees2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Degrees(0.78539816);
        assertEquals(45, actual, 0.001);
    }

    @Test
    void degrees3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Degrees(1.57079633);
        assertEquals(90, actual, 0.001);
    }

    @Test
    void factorial() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.factorial(5);
        assertEquals(120, actual, 0.001);
    }

    @Test
    void factorial2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.factorial(12);
        assertEquals(479001600, actual, 0.001);
    }

    @Test
    void factorial3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.factorial(10);
        assertEquals(3628800, actual, 0.001);
    }
}