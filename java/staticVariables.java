package com.thbs.spack;

public class Person {
    public static int count;
    private static int countPersons;
    private int pid;
    private String pname;

    public Person(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
        ++count;
        ++countPersons;
    }

    //static block for init static variables
    static {
        count = 0;
        countPersons = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public static int getCountPersons() {
        return countPersons;
    }

}

//main
package com.thbs;

import com.thbs.spack.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person=new Person(1,"rohith s");
        Person person1=new Person(2,"amith s");
        System.out.println(person);
        System.out.println(person1);
      // System.out.println("no. of objects: "+Person.count);
        System.out.println("no. of objects: "+Person.getCountPersons());



    }
}

