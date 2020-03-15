package com.Assignment4;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Java_CollectionTest {

    @Test
    public void arrayListMethod() {

        Java_Collection c = new Java_Collection();
        ArrayList <String> arr = new ArrayList<String>();
        arr.add("Junior");
        arr.add("Justin");
        arr.add("Kokolo");


        ArrayList <String> arr2 = new ArrayList<String>();
        arr2.add("Junior");
        assertEquals("Not valid",arr,c.arrayListMethod(arr2));
    }

    @Test
    public void linkedListMethod() {

        Java_Collection c = new Java_Collection();
         LinkedList<String> arr = new LinkedList<String>();
        arr.add("Junior");
        arr.add("Justin");
        arr.add("Kokolo");

        LinkedList<String> link1 = new LinkedList<String>();
        link1.add("Junior");
        assertEquals("Not valid",arr,c.linkedListMethod(link1));
    }

    @Test
    public void hashSetMethod() {

        Java_Collection c = new Java_Collection();
        HashSet<String> arr = new HashSet<String>();
        arr.add("Junior");
        arr.add("Justin");
        arr.add("Kokolo");

        HashSet<String> hash = new HashSet<String>();
         hash.add("Junior");
        assertEquals("Not valid",arr,c.hashSetMethod(hash));
    }

    @Test
    public void mapMethod() {

        Java_Collection c = new Java_Collection();
        HashMap<Integer,String> arr = new HashMap<Integer, String>();
        arr.put(1,"Junior");
        arr.put(2,"Justin");
        arr.put(3,"Kokolo");

        HashMap<Integer,String> map1 = new HashMap<Integer, String>();
        map1.put(1,"Junior");
        assertEquals("Not valid",arr,c.mapMethod(map1));
    }
}