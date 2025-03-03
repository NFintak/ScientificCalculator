package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        BasicCalc basicCalc = new BasicCalc();
        //SciCalc sciCalc = new SciCalc();
        double x;
        //double y;

        Console.println("Welcome to my calculator!");

        Double userInput = Console.getDoubleInput("Enter a number: ");
        Integer functionType = Console.getIntegerInput("Select function: (1: Basic), (2: Scientific), (4: exit)");
        switch (functionType) {
            case(1):
                Integer operator = Console.getIntegerInput("Select an operator: (1: add), (2: exit)");
                switch (operator) {
                    case(1):
                        Double userInput2 = Console.getDoubleInput("Enter a number: ");
                        double result = basicCalc.addTwoNumbers(userInput, userInput2);
                        Console.println("%s", result);
                }
        }

        //Console.println("%s", userInput);

        //String s = Console.getStringInput("Enter a string");  prompts user for a string
        //Integer i = Console.getIntegerInput("Enter an integer");  prompts user for an integer
        //Double d = Console.getDoubleInput("Enter a double.");  prompts user for a double

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a d", d);

    }
}

