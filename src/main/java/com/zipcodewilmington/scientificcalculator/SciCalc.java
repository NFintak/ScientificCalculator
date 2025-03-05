package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SciCalc {
String num1;

//    // Change this all to methods only!!
//    // Selection of modes and types all in main make new objs of SciCalc

    public double log( double num1) {
            return Math.log(num1);
        }
    public double inverseLog( double num1) {
            return (Math.log10(num1));
        }
    public double ln( double num1) {
        return Math.log1p(num1);
//            return (Math.log(num1) / 0.4342944819);
        }
    public double ex(double num1) {
            return Math.exp(num1);
        }
//
//
//    //Switch Display mode it should be a format change

    public String BinaryString (int num1) {
           return Integer.toBinaryString(num1);
    }
    public String OctalString (int num1) {
            return Integer.toOctalString(num1);
    }

//    public String Decimal (double num1) {
//        return String.format("%.8f", Double.valueOf(num1));
//    }
//
//    public String HexString (double num1) {
//        int x = Integer.parseInt(num1);
//            return Integer.toHexString(x);
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

//    // Factorial Function

    public double factorial(double num1){
        int x = (int) (num1);
          int f = 1;
          for (int i = 1; i<= x; i++) {
              f = f * i;
          }
          return f ;
    }

    }
