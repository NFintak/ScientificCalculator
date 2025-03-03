package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
//should only have methods, no switches
//import java.util.Scanner;

public class BasicCalc {
    double num1; //change to string??
    double num2;
//    boolean useBasicCalc = true;
/*    double result;
    String errMessage = "Err";
    boolean errPresent = false;

    //might be better to move errPrompt() to MainApp
    public boolean errPrompt(boolean errPresent) {
        String lineClear = "";
        System.out.println(errMessage);
        System.out.println("Press enter to clear message");
        lineClear = scanner.nextLine();
            if (lineClear.equals("")) {
                return !errPresent;
            } else {
                return errPresent;
            }
    }

     */
    public double addTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }
    public double subTwoNumbers(double num1, double num2) {
        return num1 - num2;
    }
    public double multiplyTwoNumbers(double num1, double num2) {
        return num1 * num2;
    }
    public double divTwoNumbers(double num1, double num2) {
        return num1 / num2;
    }
    public double inverseNumber(double num1) {
        return 1 / num1;
    }
    public double squareNumber(double num1) {
        return num1 * num1;
    }
    public double varExponent(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    public double squareRoot(double num1) {
        return Math.sqrt(num1);
    }
    public double invertSign(double num1) {
        return -num1;
    }
//    public boolean closeBasicCalc() {
//        System.out.println("Exit Basic Calculator? (yes/no)");
//        String response = scanner.nextLine();
//        if (response.equalsIgnoreCase("yes")) {
//            return !useBasicCalc;
//        } else if (response.equalsIgnoreCase("no")) {
//            return useBasicCalc;
//        } else {
//            return useBasicCalc;
//        }
//    }
//    public String runEquations(double num1, String operator, double num2) {
//           pull inputs from console
//           run String input against either switch or if/else to find correct equation
//        switch (operator) {
//            case("+"):
//                basicCalc.addTwoNumbers(num1, num2);
//                break; // set equal to output in either main or console
//            case("-"):
//                basicCalc.subTwoNumbers(num1, num2);
//                break;
//            case("*"):
//                basicCalc.multiplyTwoNumbers(num1, num2);
//                break;
//            case("/"):
//                basicCalc.divTwoNumbers(num1, num2);
//                break;
//            case("inv"):
//                basicCalc.inverseNumber(num1);
//                break;
//            case("^2"):
//                basicCalc.squareNumber(num1);
//                break;
//            case("^"):
//                basicCalc.varExponent(num1, num2);
//                break;
//            case("sqRt"):
//                basicCalc.squareRoot(num2);
//                break;

        }
        //    run double inputs through appropriate method, convert result to string
        //    display result on console (with or without full equation?)




