package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        File file=new File("C:\\Users\\rohith_surya\\Desktop\\thfile1.txt");
//
//
//        try {
//            file.createNewFile();
//            System.out.println("File created successfully !");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());


//        File file=new File("C:\\Users\\rohith_surya\\Desktop","java.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File  dir=new File("C:\\Users\\rohith_surya\\Desktop");
//        File[] files=dir.listFiles();
//
//        //to display all files in a directory
//        for (File f: files){
//            if (f.isFile())
//            System.out.println(f.getName());
//        }
        //read
        //write
        //append

        //read - character - Reader
        //         byte - streams

        //write - character - Writer
        //         byte - streams

        File file = new File("C:\\Users\\rohith_surya\\Desktop", "thfile1.txt");

        if (file.canRead()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

               // String str = bufferedReader.readLine();
//                while (!(str.equals("END"))) {
                String str;
                while ((str=bufferedReader.readLine())!=null) {
                    System.out.println(str);
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
