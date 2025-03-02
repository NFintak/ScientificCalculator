package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
import java.util.Scanner;

public class BasicCalc {
    public void basicCalc(String[] args) {
        BasicCalc basicCalc = new BasicCalc();
        basicCalc.runBasicCalc();
    }

    Scanner scanner = new Scanner(System.in);
    StringBuilder equations = new StringBuilder();
    double num1; //definitely need to fix
    double num2;
    String operator;
    double result;
    boolean useBasicCalc;
//    String errMessage = "Err";
//    boolean errPresent = false;

/* might be better to move this to the mainApp
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
    public double getNum1() {
        num1 = scanner.nextDouble();
        return this.num1;
    }
    public double getNum2() {
        num2 = scanner.nextDouble();
        return this.num2;
    }
    public String getOperator() {
        operator = scanner.next();
        return this.operator;
    }
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
    public double varExponent(int num1, int num2) {
        double exponent = num1 ^ num2;
        return exponent;
    }
    public double squareRoot(double num1) {
        double sqRoot = Math.sqrt(num1);
        return sqRoot;
    }
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

    public void runEquations() {
        //pull inputs from console
        //convert string input for operator into character input
        //run character input against either switch or if/else to find correct equation
        //run double inputs through appropriate method, return result
        //display result on console (with or without full equation?)
    }

    public void runBasicCalc() {
        System.out.println("Basic Calculator:");
        while (useBasicCalc) {
            this.runEquations();
            System.out.println("Enter 'exit' to close Basic Calculator");
            if (scanner.next().equalsIgnoreCase("exit")) {
                this.closeBasicCalc();
            }
        }
    }

}
