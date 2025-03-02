package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
import java.util.Scanner;

public class BasicCalc {
    Scanner scanner = new Scanner(System.in);
    double x;
    double y;
    double result;
    boolean useBasicCalc = true;


    public double addTwoNumbers() {
        return result = (x + y);
    }
    public double subTwoNumbers() {
        return result = (x - y);
    }
    public double multiplyTwoNumbers() {
        return result = (x * y);
    }
    public double divideTwoNumbers() {
        return result = (x / y);
    }
    public double squareNumber() {
        return result = (x * x);
    }
    public double inverseNumber() {
        return result = (1 / y);
    }
    public double squareRoot() {
        return result = (Math.sqrt(x));
    }
    public double variableExp() {
        return result = (Math.pow(x, y));
    }

    public void runBasicCalc() {
        while (useBasicCalc) {
            this.
        }
    }

    public String Basic(String[] args) {
        BasicCalc basicCalc = new BasicCalc();
        basicCalc.runBasicCalc();

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
                result = ;
                return String.format("%.8f + %.8f = %.8f", x, y, result);
                //System.out.println(x + " + " + y + " = " + result);
                break;
            case '-':
                result = subTwoNumbers(x, y);
                return String.format("%.8f - %.8f = %.8f", x, y, result);
                //System.out.println(x + " - " + y + " = " + result);
                break;
            case '*':
                result = multiplyTwoNumbers(x, y);
                return String.format("%.8f * %.8f = %.8f", x, y, result);
                //System.out.println(x + " * " + y + " = " + result);
                break;
            case '/':
                if (y == 0) {
                    return divZeroErr;
                    //System.out.println("Err: cannot divide by 0");
                } else if (x == 1) {
                    result = inverseNumber(y);
                    return String.format("1 / %.8f = %.8f", y, result);
                    //System.out.println("1 / " + y + " = " + result);
                } else {
                    result = divideTwoNumbers(x, y);
                    return String.format("%.8f / %.8f = %.8f", x, y, result);
                    //System.out.println(x + " / " + y + " = " + result);
                }
                break;
            case '^':
                if (y == 2) {
                    result = squareNumber(x);
                    return String.format("%.8f ^ 2 = %.8f", x, result);
                    //System.out.println(x + " ^ 2 = " + result);
                } else {
                    result = variableExp(x, y);
                    return String.format("%.8f ^ %.8f = %.8f", x, y, result);
                    //System.out.println(x + " ^ " + y + " = " + result);
                }
                break;
            case '√':
                result = squareRoot(x);
                return String.format("√ %.8f = %.8f", x, result);
                //System.out.println("√" + x + " = " + result);
            default:
                return genericErr;
                //System.out.println("Error"); //fill in with error message
                break;
        }

    }

}