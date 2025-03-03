package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
//main input and display
/**
 * Created by leon on 2/9/18.
 */
public class Console {


    //may need to move "Scanner scanner = new Scanner(System.in);" to here so it's accessible across the class
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextInt();
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in); //scan next line and return input
        println(prompt);
        return scanner.nextDouble();
    }
}
