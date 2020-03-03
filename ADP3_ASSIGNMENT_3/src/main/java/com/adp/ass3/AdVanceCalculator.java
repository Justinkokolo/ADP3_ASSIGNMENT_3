package com.adp.ass3;

public class AdVanceCalculator extends Calculator {

    private int num3;
    private int num4;

    public AdVanceCalculator(int num1, int num2, String name) {
        super(num1, num2,name);
    }

    public AdVanceCalculator(int num1, int num2, String name, int num3, int num4) {
        super(num1, num2,name);
        this.num3 = num3;
        this.num4 = num4;
    }

    public int getMultiplication() {

        return num3 * num4;
    }


    public int getDivision() {
        return num3 / num4;
    }

    @Override
    public String toString() {
        return "AddVanceCalculator{" +
                "num3=" + num3 +
                ", num4=" + num4 +
                '}';
    }
}
