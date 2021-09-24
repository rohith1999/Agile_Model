package com.company.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {

    public static int readInput() {
        InputStreamReader ir = null;
        BufferedReader br = null;

        String str1 = "", str2 = "";


        ir = new InputStreamReader(System.in);
        br = new BufferedReader(ir);
        System.out.println("Read two input values:");

        int result = 0;
        try {
            str1 = br.readLine();
            str2 = br.readLine();
            result = Integer.parseInt(str1) / Integer.parseInt(str2);

        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            try {
                ir.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        return result;
    }

    public static int readInput1() {
        String str1, str2;
        int result = 0;
        try (InputStreamReader ir = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(ir)) {

            str1 = br.readLine();
            str2 = br.readLine();
            result = Integer.parseInt(str1) / Integer.parseInt(str2);


        } catch (NumberFormatException | ArithmeticException e) {
            if (e instanceof NumberFormatException)
            System.out.println("Not a number: "+e.getMessage());

            if (e instanceof ArithmeticException)
                System.out.println("cannot be 0: "+e.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int readInput2() throws IOException,ArithmeticException,NumberFormatException{
        String str1, str2;
        int result = 0;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        str1 = br.readLine();
        str2 = br.readLine();
        result = Integer.parseInt(str1) / Integer.parseInt(str2);

        return result;

    }
}

//main
package com.company;

import com.company.exception.ReadInput;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println(ReadInput.readInput());
        System.out.println(ReadInput.readInput1());

    }
}
