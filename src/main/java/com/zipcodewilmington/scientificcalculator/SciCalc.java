//package com.zipcodewilmington.scientificcalculator;
//
//import java.util.Scanner;
//
//public class SciCalc {
//String num1;
//
////    // Change this all to methods only!!
////    // Selection of modes and types all in main make new objs of SciCalc
//
//    public double log( double num1) {
//            return Math.log(num1);
//        }
//        double inverseLog( double num1) {
//            return Math.pow(10, num1);
//        }
//        double ln( double num1) {
//            return (Math.log(num1) / 0.4342944819);
//        }
//        double ex(double num1) {
//            return Math.exp(num1);
//        }
////
////
////    //Switch Display mode it should be a format change
//
//    public String BinaryString (String num1) {
//        int x = Integer.parseInt(num1);
//           return Integer.toBinaryString(x);
//    }
//    public String OctalString (String num1) {
//        int x = Integer.parseInt(num1);
//            return Integer.toOctalString(num1);
//    }
//
//    public double Decimal (double num1) {
//        return String.format("%.8f", Double.valueOf(num1));
//    }
//
//    public double HexString (double num1) {
//            return Integer.toHexString(x);
//    }
//
//
////    //Memory Save
////    public double memory()
////    {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Select: 1. M+, 2. MC, 3. MRC, or 4. Exit");
////        String input = scanner.nextInt();
////        int z = 0;
////        //z is the default for Memory
////        switch (input) {
////            case 1:
////                z = x;
////                return z;
////            case 2:
////                z = 0;
////                return z;
////            case 3:
////                x = z;
////                return x;
////        }
////        scanner.close();
////    }
////
////    //Trig Functions it needs to be called then have user select function then run
//
//        public double sine(double num1) {
//            double result = Math.sin();
//        }
//
//        public double aSine (double num1) {
//            double result = Math.asin();
//        }
//
//        public double cosine(double num1) {
//            double result = Math.cos();
//        }
//        public double inverseCosine () {
//            double result = Math.acos();
//        }
//        public double Tangent () {
//            double result = Math.tan();
//        }
//        public double InverseTangent () {
//            double result = Math.atan();
//            return result;
//        }
//
////        //Switch Trig Units it needs to be called then have user select function then run
//
//    public Radians( String num1) {
//            return Math.toRadians(num1);
//    }
//
//    public Degrees(String num1) {
//        return Math.toDegrees(num1);
//    }
//
//
////        //Log Functions it needs to be called then have user select function then run
//
//            public double Log(String num1) {
//                return Math.log(num1);
//            }
//            public double InverseLog(String num1) {
//                return Math.pow(10, num1);
//            }
//            public double Ln(String num1) {
//                return (Math.log(num1) / 0.4342944819);
//            }
//            public double Ex(String num1) {
//                return Math.exp(num1);
//            }
//
////    // Factorial Function
//
//    public Integer factorial(Integer num1){
//          int f = 1;
//          for (int i = 1; i<= num1; i++) {
//              f = f * i;
//          }
//          return f ;
//    }
//
//
//
////    public void selectFunction (){
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Select: displayMode, memory, trig, degreeRadian, logFunctions, factorial");
////        String input = scanner.nextLine();
////        sciCalc(input);
//    }
////}