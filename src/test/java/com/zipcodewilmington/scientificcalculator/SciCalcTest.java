package com.zipcodewilmington.scientificcalculator.SciCalc;

import com.zipcodewilmington.scientificcalculator.SciCalc
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SciCalcTest extends TestCase {


    @Test
    public void SineTest() {
        SciCalc sciCalc = new SciCalc();
        int result = sciCalc.Sine(30);

        assertEquals(0.5, result);
    }

    @Test
    public void SineTest() {
        SciCalc sciCalc = new SciCalc();
        int result = sciCalc.Sine(90);

        assertEquals(1, result);
    }

    @Test
    public void SineTest() {
        SciCalc sciCalc = new SciCalc();
        int result = sciCalc.Sine(90);

        assertEquals(1, result);
    }

@Test
    void testing1() {
        SciCalc sciCalc = new SciCalc();
        String result = sciCalc.testing(1);
        assertEquals("Yes", result);
    }

@Test
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