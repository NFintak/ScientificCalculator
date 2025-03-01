package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
import java.util.Scanner;

public class BasicCalc {
    Scanner scanner = new Scanner(System.in);
    double x;
    double y;
    double result;


    public String Basic(String[] args) {

        System.out.println("Basic Calculator:");
        System.out.println("First number: ");
        double input1 = scanner.nextDouble();
        System.out.println("Operator: ");
        String prompt = scanner.nextLine();
        char func = prompt.charAt(0);
        System.out.println("Second number: ");
        double input2 = scanner.nextDouble();
        x = input1;
        y = input2;

        switch (func) {
            case '+':
                result = addTwoNumbers(x, y);
                System.out.println(x + " + " + y + " = " + result);
                break;
            case '-':
                result = subTwoNumbers(x, y);
                System.out.println(x + " - " + y + " = " + result);
                break;
        }
    }
    double addTwoNumbers(double x, double y) {
        return (x + y);
    }
    double subTwoNumbers(double x, double y) {
        return (x - y);
    }
    double multiplyTwoNumbers(double x, double y) {
        return (x * y);
    }
    double divideTwoNumbers(double x, double y) {
        return (x / y);
    }
    double squareNumber(double x) {
        return (x * x);
    }
    double inverseNumber(double x) {
        return (1 / x);
    }
    double squareRoot(double x) {
        return (Math.sqrt(x));
    }
    double variableExp(double x, double y) {
        return (Math.pow(x, y));
    }
}