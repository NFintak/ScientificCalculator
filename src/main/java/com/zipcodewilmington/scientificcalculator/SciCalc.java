package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SciCalc {
String num1;

//    // Change this all to methods only!!
//    // Selection of modes and types all in main make new objs of SciCalc

    public double log( double num1) {
            return Math.log(num1);
        }
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

    public double sine(double num1) {
        double radians = Math.toRadians(num1);
            return Math.sin(radians);
        }

    public double aSine (double num1) {
            return Math.asin(num1);
        }


    public double cosine(double num1) {
        double radians = Math.toRadians(num1);
            return Math.cos(radians);
        }
    public double inverseCosine (double num1) {
            return Math.acos(num1);
        }
    public double Tangent (double num1) {
        double radians = Math.toRadians(num1);
            return Math.tan(radians);
        }
    public double InverseTangent (double num1) {
            return Math.atan(num1);
        }

//        //Switch Trig Units it needs to be called then have user select function then run

    public double Radians( double num1) {
            return Math.toRadians(num1);
    }

    public double Degrees(double num1) {
        return Math.toDegrees(num1);
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
//    // Factorial Function

    public double factorial(double num1){
        int x = (int) (num1);
          int f = 1;
          for (int i = 1; i<= x; i++) {
              f = f * i;
          }
          return f ;
    }



//    public void selectFunction (){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Select: displayMode, memory, trig, degreeRadian, logFunctions, factorial");
//        String input = scanner.nextLine();
//        sciCalc(input);
    }
//}