package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Test;

public class SciCalcTest extends TestCase {

    @Test
    public void testing(){
        SciCalc sciCalc = new SciCalc();
        String result = testing(1);
        assertEquals("Yes", result);
    }

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


}