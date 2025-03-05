package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SciCalcTest {

//    @Test
//    void log() {
//        SciCalc sciCalc1 = new SciCalc();
//        double actual = sciCalc1.log("5");
//        assertEquals(0.69897000, actual, 0.001);
//    }
//
//    @Test
//    void inverseLog() {
//    }
//
//    @Test
//    void ln() {
//    }
//
//    @Test
//    void ex() {
//    }
//
//    @Test
//    void binaryString() {
//        SciCalc sciCalc1 = new SciCalc();
//        String actual = sciCalc1.BinaryString("5");
//        assertEquals("101", actual);
//    }
//
//    @Test
//    void octalString() {
//    }
//
//    @Test
//    void decimal() {
//    }
//
//    @Test
//    void hexString() {
//    }
//
    @Test
    void sine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.sine("5");
        assertEquals(0.08715574, actual, 0.001);
    }

    @Test
    void sine2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.sine("45");
        assertEquals(0.70710678, actual, 0.001);
    }

    @Test
    void sine3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.sine("90");
        assertEquals(1, actual, 0.001);
    }



    @Test
    void aSine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.aSine("0.5");
        assertEquals(0.52359877, actual, 0.001);
    }


    @Test
    void cosine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.cosine("30");
        assertEquals(0.8660254, actual, 0.001);
    }

    @Test
    void cosine2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.cosine("90");
        assertEquals(0, actual, 0.001);
    }

    @Test
    void cosine3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.cosine("45");
        assertEquals(0.70710678, actual, 0.001);
    }

    @Test
    void inverseCosine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.aSine("0.5");
        assertEquals(1.04719755, actual, 0.001);
    }

    @Test
    void tangent() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Tangent("45");
        assertEquals(1, actual, 0.001);
    }

    @Test
    void tangent2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Tangent("30");
        assertEquals(0.57735026, actual, 0.001);
    }

    @Test
    void tangent3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Tangent("15");
        assertEquals(0.26794919, actual, 0.001);
    }

//    @Test
//    void inverseTangent() {
//    }

    @Test
    void radians() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Radians("30");
        assertEquals(0.52359878, actual, 0.001);
    }

    @Test
    void radians2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Radians("45");
        assertEquals(0.78539816, actual, 0.001);
    }

    @Test
    void radians3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Radians("90");
        assertEquals(1.57079633, actual, 0.001);
    }

    @Test
    void degrees() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Degrees("0.52359878");
        assertEquals(30, actual, 0.001);
    }

    @Test
    void degrees2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Degrees("0.78539816");
        assertEquals(45, actual, 0.001);
    }

    @Test
    void degrees3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.Degrees("1.57079633");
        assertEquals(90, actual, 0.001);
    }

//    @Test
//    void log() {
//    }
//
//    @Test
//    void inverseLog() {
//    }
//
//    @Test
//    void ln() {
//    }
//
//    @Test
//    void ex() {
//    }
//
    @Test
    void factorial() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.factorial("5");
        assertEquals(120, actual, 0.001);
    }

    @Test
    void factorial2() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.factorial("12");
        assertEquals(479001600, actual, 0.001);
    }

    @Test
    void factorial3() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.factorial("10");
        assertEquals(3628800, actual, 0.001);
    }
}