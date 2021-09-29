package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write
        File file1=new File("C:\\Users\\rohith_surya\\Desktop", "object.txt");

        Person person=new Person(1,22,"rohith");
        Person person1=new Person(2,25,"amith");

        try(//FileInputStream fileInputStream=new FileInputStream();
           // ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            FileOutputStream fileOutputStream=new FileOutputStream(file1);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)
            ){

                objectOutputStream.writeObject(person);
                objectOutputStream.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read
        try(FileInputStream fileInputStream=new FileInputStream(file1);
             ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//            FileOutputStream fileOutputStream=new FileOutputStream(file1);
//            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)
        ){


            //deserialization
            //no new objects will be created
            //no constructors will work
            //size of the file (size of all objects in the file) is got using available method


            while (fileInputStream.available()>0){
                Person p= (Person) objectInputStream.readObject();
                System.out.println(p.toString());
            }
          




        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

//person
package com.company;

import java.io.Serializable;

//if the class objects are going for permanent persistence we need to serialize
//saves the order of member variables while saving or retrieving file
//serializable has no methods


public class Person implements Serializable {
    private int id;
    private int age;
    private String name;


    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

