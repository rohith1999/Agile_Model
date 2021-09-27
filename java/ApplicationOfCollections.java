package com.company.mainpack;

import com.company.cuspack.Customer;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //product - name,price

//        Map<String,Integer> hm =new HashMap<>();
//        hm.put("Sofa",5000);
//        hm.put("Table",1000);
//        hm.put("Lamp",2000);
//
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
//        System.out.println(hm.entrySet());
//
//
//        for (String key:hm.keySet()){
//            System.out.print(key+" "+hm.get(key)+" ");
//        }
//        System.out.println();
//
//        Integer sum = 0;
//        for (Integer val: hm.values()){
//            sum+=val;
//        }
//        System.out.println(sum);

//        HashMap<Customer,Double> hashMap=new HashMap<Customer, Double>();
//
//        Customer customer=new Customer(1,"rohith");
//        Customer customer1=new Customer(2,"amith");
//        Customer customer2=new Customer(3,"ramesh");
//
//        hashMap.put(customer,10000.0);
//        hashMap.put(customer1,20000.0);
//        hashMap.put(customer2,30000.0);
//
//        Double sum=0.0;
//
//        for (Double d : hashMap.values()){
//            sum+=d;
//        }
//        for (Customer c:hashMap.keySet()){
//            System.out.println(c+" "+hashMap.get(c));
//        }

//        System.out.println("Total shopping amount: "+sum);

        //application 2
        Map<String,String> smap = new HashMap<>();
        smap.put("Karnataka","bangalore");
        smap.put("Tamil Nadu","Chennai");
        smap.put("Kerla","Trivandrum");
        smap.put("WestBengal","Kolkata");


        for (String s : smap.keySet()){
            System.out.println(s);
        }

        System.out.println("+++++++++++++++++++");

        for (String s: smap.values()){
            System.out.println(s);
        }

        System.out.println("++++++++++++++++++++++");

        for (String s:smap.keySet()){
            System.out.println(s+"-"+smap.get(s));
        }







    }
}
