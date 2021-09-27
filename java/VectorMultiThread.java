package com.company;

import java.util.ArrayList;
import java.util.Vector;

public class Multi extends Thread{
    public static Vector<String> vectors=new Vector<>();
    @Override
    public void run() {
        vectors.add("computer");
        vectors.add("keyboard");
        vectors.add("mouse");

        //print
        for (String vector: vectors){
            System.out.print(vector+" ");
        }
    }
//public static ArrayList<String> vectors=new ArrayList<>();
//    @Override
//    public void run() {
//        vectors.add("computer");
//        vectors.add("keyboard");
//        vectors.add("mouse");
//
//        //print
//        for (String vector: vectors){
//            System.out.print(vector+" ");
//        }
//    }
}


package com.company;


public class Main{

    public static void main(String[] args) {
	// write your code here
        //vectors are synchronized
        //slower than array list




        Multi thread=new Multi();
        thread.start();
        Multi thread1=new Multi();
        thread1.start();

    }


}
