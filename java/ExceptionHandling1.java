package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //no input
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//        at com.company.Main.main(Main.java:10)

        // divide by 0
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at com.company.Main.main(Main.java:13)

        //string input
//        Exception in thread "main" java.lang.NumberFormatException: For input string: "rohi"
//        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//        at java.lang.Integer.parseInt(Integer.java:580)
//        at java.lang.Integer.parseInt(Integer.java:615)
//        at com.company.Main.main(Main.java:11)

        int result = 0;

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2  = Integer.parseInt(args[1]);
            result = n1 / n2;
        }
        catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
//            / by zero
//            For input string: "rohith"
//           0
        }
        finally {
            System.out.println(result);
            System.out.println("Bye");
        }

    }
}

//main
