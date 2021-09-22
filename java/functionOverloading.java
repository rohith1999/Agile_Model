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
//average
package com.thbs.util;

public class Average {
    public double calculateAverage(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (sum / numbers.length);

    }


    public double calculateAverage(double d,int... numbers) {
        double sum = d;
        for (int n : numbers) {
            sum += n;
        }
        return (sum / (numbers.length+1));

    }

    public double calculateAverage(double d, long l,int... numbers) {
        double sum = d+l;
        for (int n : numbers) {
            sum += n;
        }
        return (sum / (numbers.length+2));

    }

}

//tax

package com.thbs.util;

public class Tax {

    public double calculateTax(int amount, String status){
        return (amount*0.1);
    }
    public double calculateTax(int amount){
        return (amount*0.25);
    }

}



//main
package com.thbs.mainpack;

import com.thbs.util.Average;
import com.thbs.util.Summation;
import com.thbs.util.Tax;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Summation summation=new Summation();
//        System.out.println( summation.add(1,2));
//        System.out.println(summation.add("hey,","I'm rohith"));
//        System.out.println(summation.add(1,16.5F,5.9));

//        Tax tax  =new Tax();
//        System.out.println(tax.calculateTax(20000,"consultant"));
//        System.out.println(tax.calculateTax(10000));

        Average average = new Average();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(average.calculateAverage(1,2,3,4,5,6,7,8,9,10));
        System.out.println(average.calculateAverage(4.75,10L,arr));
        System.out.println(average.calculateAverage(4.75,arr));
        System.out.println(average.calculateAverage(arr));




    }
}

// output
// 3
// hey, I'm rohith
// 23.4

// Process finished with exit code 0

// //tax
// 2000.0
// 2500.0

// 5.0	
// 5.8125
// 5.431818181818182
// 5.0
