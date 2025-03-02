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
        String operator = scanner.nextLine();
        char func = operator.charAt(0);
        if (func != '√') {
            System.out.println("Second number: ");
        }
        double input2 = scanner.nextDouble();
        x = input1;
        y = input2;
        String divZeroErr = "Err: cannot divide by 0";
        String genericErr = "Err";

        switch (func) {
            case '+':
                result = addTwoNumbers(x, y);
                return String.format("%.2f + %.2f = %.2f", x, y, result);
                //System.out.println(x + " + " + y + " = " + result);
                break;
            case '-':
                result = subTwoNumbers(x, y);
                return String.format("%.2f - %.2f = %.2f", x, y, result);
                //System.out.println(x + " - " + y + " = " + result);
                break;
            case '*':
                result = multiplyTwoNumbers(x, y);
                return String.format("%.2f * %.2f = %.2f", x, y, result);
                //System.out.println(x + " * " + y + " = " + result);
                break;
            case '/':
                if (y == 0) {
                    return divZeroErr;
                    //System.out.println("Err: cannot divide by 0");
                } else if (x == 1) {
                    result = inverseNumber(y);
                    return String.format("1 / %.2f = %.2f", y, result);
                    //System.out.println("1 / " + y + " = " + result);
                } else {
                    result = divideTwoNumbers(x, y);
                    return String.format("%.2f / %.2f = %.2f", x, y, result);
                    //System.out.println(x + " / " + y + " = " + result);
                }
                break;
            case '^':
                if (y == 2) {
                    result = squareNumber(x);
                    return String.format("%.2f ^ 2 = %.2f", x, result);
                    //System.out.println(x + " ^ 2 = " + result);
                } else {
                    result = variableExp(x, y);
                    return String.format("%.2f ^ %.2f = %.2f", x, y, result);
                    //System.out.println(x + " ^ " + y + " = " + result);
                }
                break;
            case '√':
                result = squareRoot(x);
                return String.format("√ %.2f = %.2f", x, result);
                //System.out.println("√" + x + " = " + result);
            default:
                return genericErr;
                //System.out.println("Error"); //fill in with error message
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
    double inverseNumber(double y) {
        return (1 / y);
    }
    double squareRoot(double x) {
        return (Math.sqrt(x));
    }
    double variableExp(double x, double y) {
        return (Math.pow(x, y));
    }
}