package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        // It's a doubly linked list
        // each node holds data and address to next node and previous node
        //insertion and deletion is less expensive
        // iterators can be used
        //add in beginning, between and end
        List<String> lists=new LinkedList<>();
        lists.add("apple");
        lists.add("orange");
        lists.add("mango");

        System.out.println("Is this list empty: "+lists.isEmpty());
        System.out.println("Does the list contain apple?: "+lists.contains("apple"));



        for (String list : lists){
            System.out.println(list);
        }

        //using Iterator
        ListIterator<String> it= lists.listIterator();
        //List Iterator in forward and  backward
        System.out.println("Using listIterator:");

        //forward
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //backward
        System.out.println("Print in backward direction");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }

        //sort (permanent)
        Collections.sort(lists);
        System.out.println(lists);

        //reverse (permanent)
        Collections.reverse(lists);
        System.out.println(lists);

        //shuffle(permanent)
        Collections.shuffle(lists);
        System.out.println(lists);

        
    }
}
