package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Test;

public class SciCalcTest extends TestCase {

//    @Test
//    public void testing(){
//        SciCalc sciCalc = new SciCalc();
//        String result = sciCalc.testing(1);
//        assertEquals("Yes", result);
//    }
//
//    @Test
//    public void SineTest() {
//        SciCalc sciCalc = new SciCalc();
//        int result = sciCalc.Sine(30);
//
//        assertEquals(0.5, result);
//    }
//
//    @Test
//    public void SineTest() {
//        SciCalc sciCalc = new SciCalc();
//        int result = sciCalc.Sine(90);
//
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void SineTest() {
//        SciCalc sciCalc = new SciCalc();
//        int result = sciCalc.Sine(90);
//
//        assertEquals(1, result);
//    }


    @org.junit.jupiter.api.Test
    void testing1() {
        SciCalc sciCalc = new SciCalc();
        String result = sciCalc.testing(1);
        assertEquals("Yes", result);
    }

    @org.junit.jupiter.api.Test
    void sine() {
    }

    @org.junit.jupiter.api.Test
    void inverseSine() {
    }

    @org.junit.jupiter.api.Test
    void cosine() {
    }

    @org.junit.jupiter.api.Test
    void inverseCosine() {
    }

    @org.junit.jupiter.api.Test
    void tangent() {
    }

    @org.junit.jupiter.api.Test
    void inverseTangent() {
    }

    @org.junit.jupiter.api.Test
    void log() {
    }

    @org.junit.jupiter.api.Test
    void inverseLog() {
    }

    @org.junit.jupiter.api.Test
    void ln() {
    }

    @org.junit.jupiter.api.Test
    void ex() {
    }
}