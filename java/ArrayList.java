    package com.company.ppack;

    public class Person {
        private int adhaarId;
        private int age;
        private String name;

        public Person(int adhaarId, int age, String name) {
            this.adhaarId = adhaarId;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "adhaarId=" + adhaarId +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


//main
package com.company;

import com.company.ppack.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Person> arrayList=new ArrayList<>();
        arrayList.add(new Person(1234,21,"rohith"));
        arrayList.add(new Person(81725,22,"amith"));
        arrayList.add((new Person(2337,90,"rahul")));

        for (Person p:arrayList){
            System.out.println(p);
        }

    }
}


//arraylist basics
package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //List
        //root interface is collection
        //list is the subclass of collection
        //Implemented classes
        //ArrayList
        //linked list
        //Vector

        //features allows duplicate elements
        //insert and delete using position

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("amith");
//        arrayList.add("amith");
//        arrayList.add("rohith");
//        arrayList.add("manju");
//        arrayList.add("ramesh");
//        //insert at index 0 --
//        arrayList.add(0, "mahesh");
//        //remove at index position
//        arrayList.remove(1);
//        //remove using data
//        arrayList.remove("mahesh");
//        System.out.println(arrayList);
//
//        //merge two arrays
//        ArrayList<String> subList = new ArrayList<>();
//        subList.add("one");
//        subList.add("two");
//        subList.add("three");
//
//        //with index position
//        arrayList.addAll(arrayList.size() - 1, subList);
//
//        System.out.println(arrayList);
//
//
//        //removes all elements
//        //  arrayList.clear();
//
//
//        //traditional for loop
////        for (int i=0;i<arrayList.size();i++){
////            System.out.println(arrayList.get(i));
////        }
////
////        //enhanced for  loop
////        for (String e:arrayList){
////            System.out.println(e);
////        }
//
//        //iterator
//        Iterator<String> it = arrayList.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next().toUpperCase()+" ");
//        }


        //inteer array

        ArrayList<Integer> integers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter size of elements");
        int size =  scanner.nextInt();

        System.out.println("Enter elements");

        for (int i=0;i<size;i++){
            integers.add(scanner.nextInt());
        }

//        int sum=0;
//        for (Integer i:integers){
//            sum+=i;
//            System.out.println(i);
//        }
//        System.out.println("Sum is: "+sum);

        scanner.close();

        //using iterator
        Iterator<Integer> it= integers.iterator();
        int sum = 0;
        while (it.hasNext()){
            int ele = it.next();
            sum+= ele;
            System.out.println(ele);
        }
        System.out.println("++++++++++"+sum);

     


    }
}

