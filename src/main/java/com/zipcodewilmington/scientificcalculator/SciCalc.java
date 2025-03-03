package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SciCalc {

//        public void main(String[] args) {
//            SciCalc sciCalc = new SciCalc();
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Select: displayMode, memory, trig, degreeRadian, logFunctions, factorial");
//            String input = scanner.nextLine();
//            sciCalc.(input);
//        }

    // Change this all to methods only!!
    // Selection of modes and types all in main make new objs of SciCalc


//    public double logFunctions(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Select: Log, InverseLog, Ln, and E^x");
//        String input = scanner.nextLine();

        public double log {
            return Math.log(x);
        }
        double inverseLog {
            return Math.pow(10, x);
        }
        double ln {
            return (Math.log(x) / 0.4342944819);
        }
        double ex {
            return Math.exp(x);
        }


    //Switch Display mode it should be a format change

    public double displayMode(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: 1. binary, 2. octal, 3. decimal, 4. hexadecimal or 5. Exit");
        String input = scanner.nextLine();

        switch (input) {
            case (1):
                Integer.toBinaryString(x);
                //something to change it, typing Integer. brought up a list scrolled and found answer...proper?
                break;

            case (2):
                Integer.toOctalString(x);
                //sames as with "binary" seems to have built-in function
                break;

            case (3):
                return String.format("%.8f", Double.valueOf(x));
            //format x as a string with 8 in this case deciaml points
            break;

            case (4):
                Integer.toHexString(x);
                //sames as with "binary" seems to have built-in function
                break;

            case (5):
                return x;
            break;
        }
        scanner.close();
    }


    //Memory Save
    public double memory()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: 1. M+, 2. MC, 3. MRC, or 4. Exit");
        String input = scanner.nextInt();
        int z = 0;
        //z is the default for Memory
        switch (input) {
            case 1:
                z = x;
                return z;
            case 2:
                z = 0;
                return z;
            case 3:
                x = z;
                return x;
        }
        scanner.close();
    }

    //Trig Functions it needs to be called then have user select function then run

        public double sine(double num1) {
            double result = Math.sin();
        }

        public double aSine (double num1) {
            double result = Math.asin();
        }

        public double cosine(double num1) {
            double result = Math.cos();
        }
        public double inverseCosine {
            double result = Math.acos();
        }
        public double Tangent {
            double result = Math.tan();
        }
        public double InverseTangent {
            double result = Math.atan(x);
            return result;
        }


        //Switch Trig Units it needs to be called then have user select function then run

    public double degreeRadian() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select to 1. Radian, 2. Degree, or 3. Exit");
            String input = scanner.nextInt();

            switch (input) {
                case (1):
                    return Math.toRadians(x);
                break;

                case (2):
                    return Math.toDegrees(x);
                break;

                case (3):
                    return x;
                break;
            }
            scanner.close();
        }

        //Log Functions it needs to be called then have user select function then run

    public double logFunctions(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select: Log, InverseLog, Ln, and E^x");
            String input = scanner.nextLine();

            public double Log {
                return Math.log(x);
            }
            double InverseLog {
                return Math.pow(10, x);
            }
            double Ln {
                return (Math.log(x) / 0.4342944819);
            }
            double ex {
                return Math.exp(x);
            }
            scanner.close();
        }

    // Factorial Function
    public int factorial(){
        if (x == 0) {
            return 1;
        }
        int recurse = Factorial(x - 1);
        int result = x * recurse;
        return result;
        }

    }

    }
// Turned off line 8 undo comments mode if wrong
    public void selectFunction (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: displayMode, memory, trig, degreeRadian, logFunctions, factorial");
        String input = scanner.nextLine();
        sciCalc(input);
    }
}