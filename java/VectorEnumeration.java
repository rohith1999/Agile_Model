package com.company;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector<String> vector=new Vector<>();
        vector.add("Computer");
        vector.add("mouse");
        vector.add("keyboard");

        Enumeration<String> e= vector.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println("++++++++++++++++++++=");
        //iterator
        Iterator iterator=vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
