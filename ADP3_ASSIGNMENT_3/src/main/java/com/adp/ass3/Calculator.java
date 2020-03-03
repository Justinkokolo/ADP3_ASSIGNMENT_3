package com.adp.ass3;

public abstract class Calculator {

    private int num1;
    private int num2;
    private String name;

    public Calculator(int num1, int num2,String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
    }

    public int getAddition() {
        return num1 + num2;
    }


    public int getMinus() {
        return num1 - num2;
    }

    public String getName(){


        return name;
    }


    //abstract methods
    public abstract int getMultiplication();

    public abstract int getDivision();

    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
