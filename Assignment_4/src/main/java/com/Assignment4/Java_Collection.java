package com.Assignment4;

import java.util.*;

public class Java_Collection {


    //*****************************ARRAY LYST***********************************************

    public ArrayList<String> arrayListMethod(ArrayList<String> names){

        names.add("Justin");//Adding object in arrayList
        names.add("Kokolo");
        System.out.println(names);
        return names;
    }


    //*******************************LINKED LIST******************************************

    public LinkedList<String> linkedListMethod(LinkedList<String> names){

        names.add("Justin");//Adding object in arrayList
        names.add("Kokolo");
        System.out.println(names);
        return names;

    }

    //*********************************HashSet***************************************************

    public HashSet<String> hashSetMethod(HashSet<String> names){

        names.add("Justin");//Adding object in arrayList
        names.add("Kokolo");
        System.out.println(names);
        return names;

    }


    //********************************___MAP___***************************************************

    public HashMap<Integer,String> mapMethod(HashMap<Integer,String> names){

        names.put(2,"Justin");
        names.put(3,"Kokolo");

        return names;

    }
}
