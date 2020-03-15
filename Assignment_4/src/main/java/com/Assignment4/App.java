package com.Assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList <String> name = new ArrayList<String>();

        Java_Collection obj = new Java_Collection();
        name.add("Kas");
        obj.arrayListMethod(name);

        System.out.println( "Hello World!" );
    }
}
