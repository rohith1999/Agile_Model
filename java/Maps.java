package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Map
        //  HashTable HashMap       SortedMap
        //            LinkedHashMap NavigavbleMap
        //                          TreeMap

        //Map -key:value pairs
        // no duplication
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"rohith");
//        map.put(2,"amith");
//        map.put(3,"ramesh");
//        //null value can be added
//        //only one key is allowed
//        //latest value will override the previous value
//        map.put(null,null);
//        map.put(null,"null value");
//
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsKey(4));
//
//        System.out.println(map.containsValue("rohith"));
//        System.out.println(map.containsValue("manju"));

//        System.out.println(map);
//        System.out.println(map.remove(1));
//        System.out.println(map);
//        System.out.println(map);

        //linked hashmap - prints in order of insertion
        Map<Integer,String> lmap = new LinkedHashMap<>();
        lmap.put(1,"rohith");
        lmap.put(2,"amith");
        lmap.put(3,"ramesh");
        //null value can be added
        //only one key is allowed
        //latest value will override the previous value
        lmap.put(null,null);
        lmap.put(null,"null value");
        System.out.println(lmap);


        //TreeMap - prints sorted in key wise
        Map<Integer,String> tmap = new TreeMap<>();
        tmap.put(100,"rohith");
        tmap.put(2,"amith");
        tmap.put(3,"ramesh");
        //null value can be added
        //only one key is allowed
        //latest value will override the previous value
        System.out.println(tmap);


        //Hashtable - null in key is not allowed
        //thread safe
        //same as hashMap
        Map<Integer,String> hmap = new Hashtable<>();
        hmap.put(100,"rohith");
        hmap.put(2,"amith");
        hmap.put(3,"ramesh");
        //null value can be added
        //only one key is allowed
        //latest value will override the previous value
        System.out.println("HashTable"+hmap);









    }
}
