package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        BasicCalc basicCalc = new BasicCalc();
        System.out.println("Basic Calculator:");


    }

    Scanner scanner = new Scanner(System.in);
    StringBuilder equations = new StringBuilder();
    double num1; //change to string??
    double num2;
    String operator;
/*    double result;
    boolean useBasicCalc;
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

    public double getNum1() {
        return this.num1;
    }
    public double getNum2() {
        return this.num2;
    }
    public String getOperator() {
        return this.operator;
    } */
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
    //public double varExponent(double num1, double num2) {


      //  double exponent = num1 ^ num2;
      //  return exponent;
    }
    public double squareRoot(double num1) {
        double sqRoot = Math.sqrt(num1);
        return sqRoot;
    }
    public double invertSign(double num1) {
        double invertedSign = -num1;
        return invertedSign;
    }
    /*
    public boolean closeBasicCalc() {
        useBasicCalc = true;
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
*/
    public void runEquations(double num1, String operator, double num2) {
        //    pull inputs from console
        //    run String input against either switch or if/else to find correct equation
        switch (operator) {
            case("+"):
                this.addTwoNumbers(num1, num2); // set equal to output in either main or console
            case("-"):
                this.subTwoNumbers(num1, num2);
            case("*"):
                this.multiplyTwoNumbers(num1, num2);
            case("/"):
                this.divTwoNumbers(num1, num2);
            case("Inv"):
                this.inverseNumber(num1);
            case("^2"):
                this.squareNumber(num1);
            case("^"):
                this.varExponent(num1, num2);
        }
        //    run double inputs through appropriate method, return result
        //    display result on console (with or without full equation?)
    }


}
