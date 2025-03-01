package com.zipcodewilmington.scientificcalculator;
//first input = x, second input = y
public class BasicCalc {
    public static void main(String[] args) {

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
    double squareRoot(double x) {
        return (Math.sqrt(x));
    }
    double variableExp(double x, double y) {
        return (Math.pow(x, y));
    }


}