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
