package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SciCalc {
String num1;

//    // Change this all to methods only!!
//    // Selection of modes and types all in main make new objs of SciCalc

//    public String log( String num1) {
//            double x = Double.parseDouble(num1);
//            return Math.log(x);
//        }
//    public String inverseLog( String num1) {
//            double x = Double.parseDouble(num1);
//            return Math.pow(10, num1);
//        }
//    public String ln( double num1) {
//            return (Math.log(num1) / 0.4342944819);
//        }
//    public String ex(double num1) {
//            return Math.exp(num1);
//        }
//
//
//    //Switch Display mode it should be a format change

//    public String BinaryString (String num1) {
//        int x = Integer.parseInt(num1);
//           return Integer.toBinaryString(x);
//    }
//    public String OctalString (String num1) {
//        int x = Integer.parseInt(num1);
//            return Integer.toOctalString(x);
//    }
//
//    public String Decimal (double num1) {
//        return String.format("%.8f", Double.valueOf(num1));
//    }
//
//    public String HexString (double num1) {
//        int x = Integer.parseInt(num1);
//            return Integer.toHexString(x);
//    }


//    //Memory Save
//    public double memory()
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Select: 1. M+, 2. MC, 3. MRC, or 4. Exit");
//        String input = scanner.nextInt();
//        int z = 0;
//        //z is the default for Memory
//        switch (input) {
//            case 1:
//                z = x;
//                return z;
//            case 2:
//                z = 0;
//                return z;
//            case 3:
//                x = z;
//                return x;
//        }
//        scanner.close();
//    }
//
//    //Trig Functions it needs to be called then have user select function then run

    public double sine(String num1) {
        double x = Double.parseDouble(num1);
        double radians = Math.toRadians(x);
            return Math.sin(radians);
        }

    public double aSine (String num1) {
        double x = Double.parseDouble(num1);
        double radians = Math.toRadians(x);
            return Math.asin(radians);
        }

    public double cosine(String num1) {
        double x = Double.parseDouble(num1);
        double radians = Math.toRadians(x);
            return Math.cos(radians);
        }
    public double inverseCosine (String num1) {
        double x = Double.parseDouble(num1);
        double radians = Math.toRadians(x);
            return Math.acos(radians);
        }
    public double Tangent (String num1) {
        double x = Double.parseDouble(num1);
        double radians = Math.toRadians(x);
            return Math.tan(radians);
        }
    public double InverseTangent (String num1) {
        double x = Double.parseDouble(num1);
        double radians = Math.toRadians(x);
            return Math.atan(radians);
        }

//        //Switch Trig Units it needs to be called then have user select function then run

    public double Radians( String num1) {
        double x = Double.parseDouble(num1);
            return Math.toRadians(x);
    }

    public double Degrees(String num1) {
        double x = Double.parseDouble(num1);
        return Math.toDegrees(x);
    }


////        //Log Functions it needs to be called then have user select function then run
//
//            public double Log(String num1) {
//                double x = Double.parseDouble(num1);
//                return Math.log(x);
//            }
//            public double InverseLog(String num1) {
//                double x = Double.parseDouble(num1);
//                return Math.pow(10, x);
//            }
//            public double Ln(String num1) {
//                double x = Double.parseDouble(num1);
//                return (Math.log(x) / 0.4342944819);
//            }
//            public double Ex(String num1) {
//                double x = Double.parseDouble(num1);
//                return Math.exp(x);
//            }
//
////    // Factorial Function
//
//    public double factorial(String num1){
//        int x = Integer.parseInt(num1);
//          int f = 1;
//          for (int i = 1; i<= x; i++) {
//              f = f * i;
//          }
//          return f ;
//    }



//    public void selectFunction (){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Select: displayMode, memory, trig, degreeRadian, logFunctions, factorial");
//        String input = scanner.nextLine();
//        sciCalc(input);
    }
//}