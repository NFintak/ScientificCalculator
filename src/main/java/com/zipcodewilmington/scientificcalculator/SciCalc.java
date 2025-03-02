package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SciCalc {
    public void sciCalc(String[] args) {
        SciCalc sciCalc = new SciCalc();

        public static double x;

        public static SelectFunction (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select: DisplayMode, Memory, Trig, DegreeRadian, LogFunctions");
            String input = scanner.nextLine();
            method(input) ();
        }

        //x equals first input, y equals second input

        //Need a select desired function aspect...a really long switch statement?


        //Switch Display mode it should be a format change

            public static DisplayMode(String[]args){
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

    public static Memory(String[]args)
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
    public static Trig(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select: Sine, InverseSine, Cosine, Tangent, InverseTangent");
            String input = scanner.nextLine();
            public double Sine {
                return Math.sin(x);
            }

            public double InverseSine {
                return Math.asin(x);
            }
            public double Cosine {
                return Math.cos(x);
            }
            public double InverseCosine {
                return Math.acos(x);
            }
            public double Tangent {
                return Math.tan(x);
            }
            public double InverseTangent {
                return Math.atan(x);
            }
            scanner.close();
        }

        //Switch Trig Units it needs to be called then have user select function then run

    public static DegreeRadian(Integer()args) {
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

    public static LogFunctions(String[]args){
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

    }
}