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
        //Scanner scanner = new Scanner(System.in);  //don't know if we still need it, but if we do just uncomment it
        BasicCalc basicCalc = new BasicCalc();
        //SciCalc sciCalc = new SciCalc();
        Integer numOfErrs = 0;
        boolean runCalc = true;
        Double displayNumber = 0.0;

        Console.println("Welcome to my calculator!");
        while (runCalc) {
            Double userInput = Console.getDoubleInput("Enter a number: "); //may need to move this outside of while loop, re-initialize as equal to result?
            Integer functionType = Console.getIntegerInput("Select function: (1: Basic) (2: Scientific) (3: Memory) (4: exit)");
            switch (functionType) {
                case (1):
                    Integer operator = Console.getIntegerInput("Select an operator:\n(1: add) (2: subtract) (3: multiply)\n(4: divide) (5: inverse) (6: square)\n(7: var. exponent) (8: square root) (9: invert sign)\n(10: exit)");
                    switch (operator) {
                        case (1):
                            Double userInput2 = Console.getDoubleInput("Enter a number: ");
                            double result = basicCalc.addTwoNumbers(userInput, userInput2);
                            Console.println("%s", result);
                            break;
                        case (2):
                            userInput2 = Console.getDoubleInput("Enter a number: ");
                            result = basicCalc.subTwoNumbers(userInput, userInput2);
                            Console.println("%s", result);
                            break;
                        case (3):
                            userInput2 = Console.getDoubleInput("Enter a number: ");
                            result = basicCalc.multiplyTwoNumbers(userInput, userInput2);
                            Console.println("%s", result);
                            break;
                        case (4):
                            userInput2 = Console.getDoubleInput("Enter a number: ");
                            result = basicCalc.divTwoNumbers(userInput, userInput2);
                            Console.println("%s", result);
                            break;
                        case (5):
                            result = basicCalc.inverseNumber(userInput);
                            Console.println("%s", result);
                            break;
                        case (6):
                            result = basicCalc.squareNumber(userInput);
                            Console.println("%s", result);
                            break;
                        case (7):
                            userInput2 = Console.getDoubleInput("Enter a number: ");
                            result = basicCalc.varExponent(userInput, userInput2);
                            Console.println("%s", result);
                            break;
                        case (8):
                            result = basicCalc.squareRoot(userInput);
                            Console.println("%s", result);
                            break;
                        case (9):
                            result = basicCalc.invertSign(userInput);
                            Console.println("%s", result);
                            break;
                        case (10):
                        default:

                            break;
                    }
                    break;
                //case(2):
                //    Integer function = Console.getIntegerInput("Select a function: (1: ) (2: ) (3: ) ... (i: exit)")
                //case(3): memory
                case(4):
                    String closeCalc = Console.getStringInput("Are you sure you want to exit? (yes/no)");
                    if (closeCalc.equalsIgnoreCase("yes")) {
                        runCalc = false;
                    } else if (closeCalc.equalsIgnoreCase("no")) {
                        runCalc = true;
                    } else {

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
}

