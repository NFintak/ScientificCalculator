package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */

// Default Display= 0
    // Display current value
    // Clear display "display=0"
    // Scan input change display to input
    // Default to BasicCalc (move methods from BasicCalc.java to Main with option to open SciCalc
    // Err message when cannot compute
    // Clear display required after Err
    // After value entered request choosing of operation (BasicCalc) or SciCalc (which opens SciCalc which would list options

public class MainApplication {
    public static void main(String[] args) {
        BasicCalc basicCalc = new BasicCalc();
        SciCalc sciCalc = new SciCalc();

        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

    }
}

