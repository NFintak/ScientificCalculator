package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
import java.util.Scanner;

public class BasicCalc {
    public static String Basic(String[] args) {
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
        result = num1 + num2;
        return result;
    }
    public double subTwoNumbers(double num1, double num2) {
        result = num1 - num2;
        return result;
    }
    public double multiplyTwoNumbers(double num1, double num2) {
        result = num1 * num2;
        return result;
    }
    public double divTwoNumbers(double num1, double num2) {
        result = num1 / num2;
        return result;
    }
    public double inverseNumber(double num1) {
        result = 1 / num1;
        return result;
    }
    public double squareNumber(double num1) {
        result = num1 * num1;
        return result;
    }
    public double varExponent(int num1, int num2) {
        result = num1 ^ num2;
        return result;
    }
    public double squareRoot(double num1) {
        result = Math.sqrt(num1);
        return result;
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

    public void runBasicCalc() {
        System.out.println("Basic Calculator:");


        System.out.println("Enter 'exit' to close Basic Calculator");
        if (scanner.next().equalsIgnoreCase("exit")) {
            closeBasicCalc();
        }
    }

}
