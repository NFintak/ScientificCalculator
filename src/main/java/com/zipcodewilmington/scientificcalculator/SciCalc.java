package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SciCalc {
//Make Factorial Function

    //    public void sciCalc(String[] args) {
//        SciCalc sciCalc = new SciCalc();
//
//        public static double x;

    int x = userInput;

    public static double LogFunctions(){
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

    //Switch Display mode it should be a format change

    public static double DisplayMode(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: 1. binary, 2. octal, 3. decimal, 4. hexadecimal or 5. Exit");
        String input = scanner.nextLine();

        switch (input) {
            case (1):
                Integer.toBinaryString();
                //something to change it, typing Integer. brought up a list scrolled and found answer...proper?
                break;

            case (2):
                Integer.toOctalString();
                //sames as with "binary" seems to have built-in function
                break;

            case (3):
                return String.format("%.8f", x);
            //format x as a string with 8 in this case deciaml points
            break;

            case (4):
                Integer.toHexString();
                //sames as with "binary" seems to have built-in function
                break;

            case (5):
                return x;
            break;
        }
        scanner.close();
    }


    //Memory Save
    public static double Memory()
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
    public static double Trig(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: Sine, InverseSine, Cosine, Tangent, InverseTangent");
        String input = scanner.nextLine();
        public static double Sine {
            double result = Math.sin(x);
            return result;
        }

        public static double InverseSine {
            double result = Math.asin(x);
            return result;
        }
        public double Cosine {
            double result = Math.cos(x);
            return result;
        }
        public double InverseCosine {
            double result = Math.acos(x);
            return result;
        }
        public double Tangent {
            double result = Math.tan(x);
            return result;
        }
        public double InverseTangent {
            double result = Math.atan(x);
            return result;
        }
        scanner.close();
    }

        //Switch Trig Units it needs to be called then have user select function then run

    public static double DegreeRadian() {
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

    public static double LogFunctions(){
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

//    }
// Turned off line 8 undo comments mode if wrong
    public static void SelectFunction (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: DisplayMode, Memory, Trig, DegreeRadian, LogFunctions");
        String input = scanner.nextLine();
        method(input) ();
    }
}