package com.adp.ass3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAddition() {

        Calculator cal = new  AdVanceCalculator(3,4,"Justin",5,8);
        int actual = cal.getAddition();
        assertEquals(7,actual );

    }

    @Test
    public void getMinus() {

        Calculator cal = new AdVanceCalculator(5,4,"Justin",5,8);
        int actual = cal.getMinus();
        assertEquals(1,actual );
    }
}