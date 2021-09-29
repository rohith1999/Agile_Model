package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// copy contents from one file to another
        File file = new File("C:\\Users\\rohith_surya\\Desktop", "thfile1.txt");
        File file1=new File("C:\\Users\\rohith_surya\\Desktop", "thfile2.txt");
        try (
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            //file writer in append mode
            FileWriter fileWriter=new FileWriter(file1,true);

            //overwrite mode
         //   FileWriter fileWriter=new FileWriter(file1);

            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)    ){

            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
