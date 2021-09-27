package com.company;

import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack=new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack);
        //remove element
        stack.pop();
        System.out.println(stack);

        //top element
        System.out.println(stack.peek());   
        
        //stack is a subclass of vector
       // Vector<String> stacks=new Stack<>();
        


    }
}
