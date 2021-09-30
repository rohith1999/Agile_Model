//student

package com.company.spack;

import java.io.Serializable;

public class Student implements Serializable {
    private int studentId;
    private String sName;
    private int m1;
    private int m2;
    private int m3;
    private transient int totalMarks;

    public Student(int studentId, String sName, int m1, int m2, int m3) {
        this.studentId = studentId;
        this.sName = sName;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.totalMarks = m1 + m2 + m3;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public int getTotalMarks() {
        return totalMarks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", sName='" + sName + '\'' +
                ", m1=" + m1 +
                ", m2=" + m2 +
                ", m3=" + m3 +
                ", totalMarks=" + totalMarks +
                '}';
    }
}

//readobject
package com.company.filepack;

import com.company.spack.Student;

import java.io.*;

public class ReadObject {
    public void readObject() {
        File file = new File("C:\\Users\\rohith_surya\\Desktop", "thfile1.txt");
       try (FileInputStream fileInputStream=new FileInputStream(file);

        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){


           while (fileInputStream.available()>0){
               Student student= (Student) objectInputStream.readObject();
               System.out.println(student);
           }

       }catch (IOException | ClassNotFoundException e){
           e.printStackTrace();
       }

    }
}



//writeobject

package com.company.filepack;

import com.company.spack.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class WriteObject {

    public void writeObject(){
        File file = new File("C:\\Users\\rohith_surya\\Desktop", "thfile1.txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream bufferedOutputStream = new ObjectOutputStream(fileOutputStream)

                ){

            ArrayList<Student> arrayList=new ArrayList<>();
            arrayList.add(new Student(1,"rohith",85,70,65));
            arrayList.add(new Student(2,"amith",88,95,100));
            Iterator<Student> iterator=arrayList.iterator();


            while (iterator.hasNext()){
                Student s=iterator.next();
                System.out.println(s);
                bufferedOutputStream.writeObject(s);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//main

package com.company;

import com.company.filepack.ReadObject;
import com.company.filepack.WriteObject;
import com.company.spack.Student;

public class Main {

    public static void main(String[] args) {


        WriteObject writeObject=new WriteObject();
        writeObject.writeObject();

        ReadObject readObject=new ReadObject();
        readObject.readObject();


    }
}

