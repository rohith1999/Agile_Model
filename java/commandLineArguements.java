package com.thbs;

public class Main {

    public static void main(String[] args) {
	// command line arguments
        for (int i = 0; i<args.length;i++){
            System.out.println(args[i]);
        }

        //integer conversion
        //  sum of two numbers
        int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        System.out.println(sum);

//        "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=65446:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\user123\IdeaProjects\commandLineArguements\out\production\commandLineArguements com.thbs.Main 1 3
//        1
//        3
//        4
//
//        Process finished with exit code 0


    }
}
