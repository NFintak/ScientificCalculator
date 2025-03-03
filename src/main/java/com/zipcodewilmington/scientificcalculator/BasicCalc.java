package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
//should only have methods, no switches
import java.util.Scanner;

public class BasicCalc {
    double num1; //change to string??
    double num2;
    String operator;
    boolean useBasicCalc = true;
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
        double sum = num1 + num2;
        return sum;
    }
    public double subTwoNumbers(double num1, double num2) {
        double difference = num1 - num2;
        return difference;
    }
    public double multiplyTwoNumbers(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }
    public double divTwoNumbers(double num1, double num2) {
        double quotient = num1 / num2;
        return quotient;
    }
    public double inverseNumber(double num1) {
        double inverse = 1 / num1;
        return inverse;
    }
    public double squareNumber(double num1) {
        double squared = num1 * num1;
        return squared;
    }
    public double varExponent(double num1, double num2) {
        int exp1;
        int exp2;
        double exponent = exp1 ^ exp2;
        return exponent;
    }
    public double squareRoot(double num1) {
        double sqRoot = Math.sqrt(num1);
        return sqRoot;
    }
    public double invertSign(double num1) {
        double invertedSign = -num1;
        return invertedSign;
    }
    public boolean closeBasicCalc() {
        System.out.println("Exit Basic Calculator? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            return !useBasicCalc;
        } else if (response.equalsIgnoreCase("no")) {
            return useBasicCalc;
        } else {
            return useBasicCalc;
        }
    }
//    public String runEquations(double num1, String operator, double num2) {
//           pull inputs from console
//           run String input against either switch or if/else to find correct equation
//        switch (operator) {
//            case("+"):
//                this.addTwoNumbers(num1, num2);
//                break; // set equal to output in either main or console
//            case("-"):
//                this.subTwoNumbers(num1, num2);
//                break;
//            case("*"):
//                this.multiplyTwoNumbers(num1, num2);
//                break;
//            case("/"):
//                this.divTwoNumbers(num1, num2);
//                break;
//            case("Inv"):
//                this.inverseNumber(num1);
//                break;
//            case("^2"):
//                this.squareNumber(num1);
//                break;
//            case("^"):
//                this.varExponent(num1, num2);
//                break;
//            case("")

                //this.varExponent(num1, num2);
        }
        //    run double inputs through appropriate method, convert result to string
        //    display result on console (with or without full equation?)
    }


}
