package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1 . leap year
//        System.out.println("enter a year");
//        Scanner sc=new Scanner(System.in);
//        int year = sc.nextInt();
//        sc.close();
//        if (leapYear(year)){
//            System.out.println(" Its a leap year");
//        }else{
//            System.out.println(" Its not a leap year");
//
//        }
//        enter a year
//        1948
//        Its a leap year
//
//        Process finished with exit code 0
//
        //2. Armstrong number
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        sc.close();
//        if (isArmstrong(num)){
//            System.out.println(" It's an armstrong number");
//        }else{
//            System.out.println(" It's not an armstrong number");
//
//        }
//        153
//        It's an armstrong number
//
//        Process finished with exit code 0


        //3. perfect number
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        sc.close();
//           if (isPerfect(num)) {
//            System.out.println(" Its a perfect number");
//        } else {
//            System.out.println(" Its not a perfect number");
//
//        }
//        496
//        It's a perfect number
//
//        Process finished with exit code 0

        // 4. multiplication table
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("enter a number");
//
//        for (int i = 1;i<=10;i++){
//            System.out.println(num+" x "+i+" = "+(num*i));
//        }
//        2
//        enter a number
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        2 x 4 = 8
//        2 x 5 = 10
//        2 x 6 = 12
//        2 x 7 = 14
//        2 x 8 = 16
//        2 x 9 = 18
//        2 x 10 = 20
//
//        Process finished with exit code 0

        //5. HCF and LCM of 2 numbers
        System.out.println("Enter 2 no's");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        
        int hcf = hcf2(num1, num2);
        int lcm =(num1*num2)/hcf;

        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);

//        10
//        35
//        HCF: 5
//        LCM: 70
//
//        Process finished with exit code 0

    }

    private static int hcf2(int num1, int num2) {
        int hcf=0;
        for (int i = 1; i <=num1 || i <=num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf=i;
            }
        }
        return hcf;

    }

//    private static boolean isPerfect(int num) {
//        int sum = 0;
//        for (int i=1;i<=num/2;i++){
//            if (num % i == 0)
//                 sum+=i;
//        }
//        if (sum==num){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    private static boolean isArmstrong(int num) {
//        int sum=0;
//        for (int i=0;i<(String.valueOf(num)).length();i++){
//            sum+= Math.pow(Integer.parseInt(String.valueOf((String.valueOf(num)).charAt(i))),3);
//        }
//        if (sum==num){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    private static boolean leapYear(int year) {
//        if (year % 400 == 0){
//            return true;
//        }
//        if (year % 100 == 0){
//            return false;
//        }
//        if (year % 4 == 0){
//            return true;
//        }
//        return  false;
//
//    }
}
