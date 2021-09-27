package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Queue<String> queue=new LinkedList<>();

        queue.add("morning");
        queue.add("afternoon");
        queue.add("night");


        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        




    }
}
