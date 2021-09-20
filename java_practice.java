package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // sum of two numbers
//        System.out.println("sum of two numbers");
//        int num1,num2;
//        num1 = 10;
//        num2 = 20;
//        int sum=num1+num2;
//        System.out.println("The sum is "+sum);

        //user input
//        int num1,num2,sum;
//        System.out.println("sum of two numbers");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first number");
//        num1 = sc.nextInt();
//        System.out.println("Enter first number");
//        num2 = sc.nextInt();
//        sum=num1+num2;
//        System.out.println("The sum is "+sum);


        //if else (even or odd)
//        Scanner sc =new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num%2==0) {
//            System.out.println(num+" is a even number");
//        }else{
//            System.out.println(num+" is a odd number");
//        }

        //largest of 3 numbers (assignment)
//        Scanner sc =new Scanner(System.in);
//        int num1 = sc.nextInt();
//        double num2 = sc.nextDouble();
//        long num3 = sc.nextLong();
//        double largestNum = num3 > (num1>num2 ? num1:num2) ? num3 : (num1>num2 ? num1:num2);
//        System.out.println(largestNum);

        //type casting (Implicit and explicit)
        //any floating point literal on default will be taken as double
//        float f1 = 13.8F;
//        double d1 = f1;
//        f1 = (float) d1;
//        int i1 = (int) d1;
//        System.out.println(i1);
//        System.out.println(d1);
//        System.out.println(f1);
//        System.out.printf("formatted d1: %.2f",d1);

        //unary operator

//        int i = 10;
//        int  ans = ++i;
//        System.out.println(i+" "+ans);
//        int ans1 = i++;
//        System.out.println(i+" "+ans1);


        int x = 3, y = 5, z = 10;
        int res1 = z + ++y - y + z + ++x;
        // 10 + 6 - 6 + 10 + 4 = 24
        System.out.println(res1);

        int res2 = ++z + y - y + z + x++;
        //11 + 6 - 6 + 11 + 4 = 26
        System.out.println(res2);

        int res3 = z + ++y - y++ + ++z + ++x;
        // 11 + 7 - 7 + 12 + 6 = 29

        System.out.println(res3);

        // reverse a number
//        Scanner sc=new Scanner(System.in);
//        System.out.println("reverse a number");
//        int num = sc.nextInt();
//        int rev = reverseNum(num);
//        System.out.println("Reversed num is "+rev);

        //prime number
//        System.out.println("enter a num");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (isPrime(num)) {
//            System.out.println("number is prime");
//        } else {
//            System.out.println("number is not prime");
//        }

        //fact of given number
//        System.out.println("enter a num");
//        Scanner sc = new Scanner(System.in);
//        int num =sc.nextInt();
//        int fact = isFact(num);
//        System.out.println("The fact of "+num+" is " + fact);

        //switch case
        // no of days in a month
//        System.out.println("enter month no.");
//        Scanner sc=new Scanner(System.in);
//        int num = sc.nextInt();
//
//        switch (num){
//            case 1,3,5,7,8,10,12:
//                System.out.println("31 days");
//                break;
//            case 2:
//                System.out.println("28 or 29 days");
//                break;
//            case 4,6,9,11:
//                System.out.println("30 days");
//                break;
//            default:
//                System.out.println("invalid month");
//        }


    }

//    private static int isFact(int num) {
//        int fact = 1;
//        for (int i=1;i<=num;i++){
//            fact = fact*i;
//        }
//        return fact;
//    }

//    private static boolean isPrime(int num) {
//        if (num == 0 || num == 1) {
//            return false;
//        } else {
//            for (int i = 2; i <= num/2; i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//
//        }


//    private static int reverseNum(int num) {
//        int rem, rev = 0;
//        while (num != 0) {
//            rem = num % 10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//        }
//        return rev;
//
//    }

}


