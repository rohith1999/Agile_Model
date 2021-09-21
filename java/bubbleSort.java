package com.thbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// bubble sort
        int len = Integer.parseInt(args[0]);

        //declaration of array
        int[] arr=new int[len];

        // read input
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //sort an array
        for (int i=0;i<arr.length-1;i++){
            for (int j= 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

//        500
//        300
//        1000
//        1
//        1
//        300
//        500
//        1000
//
//        Process finished with exit code 0

    }
}
