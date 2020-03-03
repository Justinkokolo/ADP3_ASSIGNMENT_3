package com.adp.ass3;

public class MoreAdvanceCalculator {

    public AdVanceCalculator adVanceCalculator;
    private int radius;

    public MoreAdvanceCalculator(AdVanceCalculator adVanceCalculator, int radius) {
        this.adVanceCalculator = adVanceCalculator;
        this.radius = radius;

    }

    public double getRadius() {

        double area = Math.PI * (radius * radius);
        System.out.println("The name of User is: " + adVanceCalculator.getName());
        System.out.println("The area of circle is: " + area);
        return  area;
    }

    @Override
    public String toString() {
        return String.format("Name of the user  The area of circle is: %.2f " ,getRadius());
    }
}
