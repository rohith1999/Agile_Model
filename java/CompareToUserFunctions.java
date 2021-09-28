package com.company.comparatorpack;

import com.company.studentpack.Person;

import java.util.Comparator;

//age
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person person1) {
        if (person.getAge()> person1.getAge()){
            return 1;
        }if (person.getAge()==person1.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}


//name
package com.company.comparatorpack;

import com.company.studentpack.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person person1) {
        return ((person.getName()).compareTo(person1.getName()));
    }
}

//Student
package com.company.studentpack;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

//    @Override
//    public int compareTo(Student student) {
//       if (marks> student.marks){
//           return 1;
//       }else {
//           if (marks== student.marks){
//               return 0;
//           }else {
//               return -1;
//           }
//       }
//    }

    //descending order
//    @Override
//    public int compareTo(Student student) {
//        if (marks > student.marks) {
//            return -1;
//        } else {
//            if (marks == student.marks) {
//                return 0;
//            } else {
//                return 1;
//            }
//        }
//    }

    //filter according to marks and id
    @Override
    public int compareTo(Student student) {
        if (marks > student.marks) {
            return 1;
        } else {
            if (marks == student.marks) {
                if (id>student.id){
                    return 1;
                } if (id==student.id){
                    return 0;
                }else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
    }
}


//Person
package com.company.studentpack;

import java.util.Comparator;

public class Person{

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//MAIN
package com.company.mainpack;

import com.company.comparatorpack.AgeComparator;
import com.company.comparatorpack.NameComparator;
import com.company.studentpack.Person;
import com.company.studentpack.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // prioritize an object in arrayList

//        ArrayList<Student> arrayList=new ArrayList<>();
//
//        Student student=new Student(1,"rohith",40);
//        Student student1=new Student(2,"amith",95);
//        Student student2=new Student(3,"ramesh",75);
//
//        arrayList.add(student);
//        arrayList.add(student1);
//        arrayList.add(student2);
//        arrayList.add(new Student(4,"manju",75));
//
//        System.out.println("printing before sort");
//        for (Student s : arrayList){
//            System.out.println(s);
//        }


//        System.out.println("after sorting");
//        Collections.sort(arrayList);
//        for (Student s : arrayList){
//            System.out.println(s);
//
//        }

        ArrayList<Person> arrayList=new ArrayList<>();
        arrayList.add(new Person(1,"rohith",22));
        arrayList.add(new Person(2,"amith",23));
        arrayList.add(new Person(3,"manju",21));
        arrayList.add(new Person(4,"ramesh",23));

        for (Person p : arrayList)
            System.out.println(p);

      //  Collections.sort(arrayList,new AgeComparator());

        Collections.sort(arrayList,new NameComparator());
        System.out.println("++++++++++++++++++++++++");
        for (Person p : arrayList)
            System.out.println(p);










    }
}

