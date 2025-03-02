package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SciCalc {
    SciCalc sciCalc = new SciCalc();
    //x equals first input, y equals second input
public int testing(int number){
    if (number > 0) {
        return "Yes";
    }
    else {
        return "No";
    }
}
}
    //Need a select desired function aspect...a really long switch statement?

    double x=10.0

            //Switch Display mode it should be a format change
           public static void String "DisplayMode" (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: 1. binary, 2. octal, 3. decimal, 4. hexadecimal or 5. Exit");
        String input = scanner.nextLine();

        switch(input){
            case(1):
                Integer.toBinaryString()
                //something to change it, typing Integer. brought up a list scrolled and found answer...proper?
            break;

            case(2):
                Integer.toOctalString()
                //sames as with "binary" seems to have built-in function
            break;

            case(3):
                return String.format("%.8f", x);
                //format x as a string with 8 in this case deciaml points
                break;

            case(4):
                Integer.toHexString()
                //sames as with "binary" seems to have built-in function
                break;

            case(5):
                return x;
            break;
        }
    }

    //Memory Save

    public static void String "Memory" (String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select: 1. M+, 2. MC, 3. MRC, or 4. Exit");
        String input = scanner.nextInt();
        int z = 0
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


    //Trig Functions it needs to be called then have user select function then run
    public double Sine(x) {
        return Math.sin(x);
    }

    public double InverseSine(x) {
        return Math.asin(x);
    }
    public double Cosine(x) {
        return Math.cos(x);
    }
    public double InverseCosine(x) {
        return Math.acos(x);
    }
    public double Tangent(x) {
        return Math.tan(x);
    }
    public double InverseTangent(x) {
        return Math.atan(x);
    }

    //Switch Trig Units it needs to be called then have user select function then run
        public static void String "Degree/Radian" (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select to 1. Radian, 2. Degree, or 3. Exit");
        String input = scanner.nextInt();

        switch(input){
            case(1):
                return Math.toRadians(x);
            break;

            case(2):
                return Math.toDegrees(x);
            break;

            case(3):
                return x;
            break;
        }
    }

    //Log Functions it needs to be called then have user select function then run
    double Log(x) {
        return Math.log(x);
    }
    double InverseLog(x) {
        return Math.pow(10, x);
    }
    double Ln (x) {
        return (Math.log(x)/0.4342944819);
    }
    double ex (x) {
        return Math.exp(x);
    }

}
