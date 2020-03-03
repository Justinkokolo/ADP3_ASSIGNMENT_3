package com.adp.ass3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Your Answers" );

        AdVanceCalculator c = new AdVanceCalculator(3,4,"Justin",5,8);

       int answer = c.getMultiplication();
       // System.out.println(answer);
        System.out.println("-------Radius--------------");

        MoreAdvanceCalculator m = new MoreAdvanceCalculator(c,3);
        m.toString();
        
    }
}
