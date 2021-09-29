package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        File file = new File("C:\\Users\\rohith_surya\\Desktop", "thfile1.txt");
        File file1 = new File("C:\\Users\\rohith_surya\\Desktop", "thfile3.txt");

        try (FileInputStream fileInputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             FileOutputStream fileOutputStream = new FileOutputStream(file1);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)
        ) {

            int data=bufferedInputStream.read();
            while (data!=-1){
                System.out.println(data);
                bufferedOutputStream.write(data);
                data=bufferedInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
