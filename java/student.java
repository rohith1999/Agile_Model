package com.thbs;

public class Student {
    private  int repo;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public Student(int repo, String name, int marks1, int marks2, int marks3) {
        this.repo = repo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    private double getPerecentage(){
        return ((marks1+marks2+marks3)/3);
    }

    @Override
    public String toString() {
        return "Student{" +
                "repo=" + repo +
                ", name='" + name + '\'' +
                ", marks1=" + marks1 +
                ", marks2=" + marks2 +
                ", marks3=" + marks3 +
                ",percentage="+getPerecentage()+
                '}';
    }
}




//main
package com.thbs;


import java.util.Scanner;

public class Main  {

    public static void main(String[] args){

        // amt = no. of units consumed x unit price
        // electricity bill (no of units consumed
//        Consumer consumer=new Consumer(1,"Rohith",2000,10);
//        System.out.println("Bill Amount:"+consumer.toString());
       //  Student student = new Student(142,"rohith s",50,50,100);
         //if toString method is not implemented reference of object is displayed
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int len = sc.nextInt();
        Student[] student =new Student[len];

        for (int i=0;i<len;i++){
            System.out.println("enter student "+(i+1)+" details");
            student[i]=new Student(sc.nextInt(),sc.nextLine()+sc.nextLine(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        //for each loop
        for (Student s:student){
            System.out.println(s);
        }

        System.out.println(student);
// Enter the number of students
// 2
// enter student 1 details
// 1
// rohith
// 60
// 70
// 60
// enter student 2 details
// 2
// amith
// 100
// 100
// 100
// Student{repo=1, name='rohith', marks1=60, marks2=70, marks3=60,percentage=63.0}
// Student{repo=2, name='amith', marks1=100, marks2=100, marks3=100,percentage=100.0}
// [Lcom.thbs.Student;@7106e68e

// Process finished with exit code 0
      




    }
}


