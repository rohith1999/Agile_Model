package com.company.itempack;

public class Item implements Comparable<Item> {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(Item item) {
//        if (id>item.id){
//            return 1;
//        }if (id==item.id){
//            return 0;
//        }
//        else return -1;
//    }

    //descending order

    @Override
    public int compareTo(Item item) {
        if (id > item.id) {
            return -1;
        } else {
            if (id == item.id) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}

//main
package com.company.mainpack;

import com.company.itempack.Item;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
    //priority queue
        Queue<Item> queue=new PriorityQueue<>();

        queue.add(new Item(100,"rohith"));
        queue.add(new Item(5,"amith"));
        queue.add(new Item(90,"manju"));
        queue.add(new Item(600,"ramesh"));


        for (Item p:queue){
            System.out.println(p);
        }
        System.out.println("----------------------------------------------");

        queue.remove();
        System.out.println("TOP: "+queue.peek());
        for (Item p:queue){
            System.out.println(p);
        }

        System.out.println("----------------------------------------------");

        queue.remove();
        System.out.println("TOP: "+queue.peek());
        for (Item p:queue){
            System.out.println(p);
        }



    }
}

