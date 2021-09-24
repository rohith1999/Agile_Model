package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=10;
        Integer num=new Integer(i);

        //convert primitive data type to respective wrapper type -- boxing
        System.out.println(num);
        // unboxing
        int i1 = num.intValue();
        System.out.println(i1);

        //autoboxing
        Integer num1 = i;
        i=num1;

        String s1="111";
        int s = Integer.parseInt(s1);
        String dou1="12.999";
        double dou = Double.parseDouble(dou1);

        String s2=String.valueOf(s);
        

    }
}
