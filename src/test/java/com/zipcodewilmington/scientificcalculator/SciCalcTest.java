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
    void inverseCosine() {
        SciCalc sciCalc1 = new SciCalc();
        double actual = sciCalc1.aSine("0.5");
        assertEquals(1.04719755, actual, 0.001);
    }
//
//    @Test
//    void tangent() {
//    }
//
//    @Test
//    void inverseTangent() {
//    }
//
//    @Test
//    void radians() {
//    }
//
//    @Test
//    void degrees() {
//    }
//
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
//    @Test
//    void factorial() {
//    }
}