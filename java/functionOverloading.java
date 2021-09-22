package com.thbs.util;

public class Summation {

    public int add(int x,int y){
        return (x+y);
    }

    public double add(int x,float y,double d){
        return(x+y+d);
    }
    public String add(String s1, String s2){
        return (s1+" "+s2);
    }

}

//main
package com.thbs.mainpack;

import com.thbs.util.Summation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Summation summation=new Summation();
        System.out.println( summation.add(1,2));
        System.out.println(summation.add("hey,","I'm rohith"));
        System.out.println(summation.add(1,16.5F,5.9));


    }
}

//output
3
hey, I'm rohith
23.4

Process finished with exit code 0
