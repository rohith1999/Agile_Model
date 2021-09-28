//test
package com.company.gpack;



public class Test <T,U>{
    private T ob1;
    private U ob2;

    public Test(T ob1, U ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public U getOb2() {
        return ob2;
    }

    public void setOb2(U ob2) {
        this.ob2 = ob2;
    }

    @Override
    public String toString() {
        return "Test{" +
                "ob1=" + ob1 +
                ", ob2=" + ob2 +
                '}';
    }
}

//product
package com.company.gpack;

public class Product {
    private int pId;
    private String pName;


    public Product(int pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                '}';
    }
}

//test 1
package com.company.gpack;

public class Test1 {
    public static <T> void printArray(T[]arr){

        for (T ele :arr){
            System.out.println(ele);
        }
    }
}
//main

package com.company;

import com.company.gpack.Product;
import com.company.gpack.Test;
import com.company.gpack.Test1;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Test<String,String> test=new Test<>("hello","world");
//        System.out.println(test);
//
//        Test<Integer,String> test1=new Test<>(1,"rohith");
//        System.out.println(test1);
//
//        Test<Integer, Product> test2 =new Test<>(1,new Product(1,"amith"));
//        System.out.println(test2);
        Integer[] integers={3,5,7,9};
        Test1.printArray(integers);

        String[] names={"rohith","amith","ramesh"};
        Test1.printArray(names);

        Product[] products={new Product(10,"r"),new Product(20,"s")};

        Test1.printArray(products);


    }
}
