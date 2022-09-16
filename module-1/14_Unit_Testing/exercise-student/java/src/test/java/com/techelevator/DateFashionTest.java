package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateFashionTest {

    private DateFashion cut;

    @Before
    public void setup(){
        cut= new DateFashion();
    }

    @Test
    public void DateFashion_TestBothStylishOrOK(){
        assertEquals("Should go to restaurant",2,cut.getATable(5,10));
    }

    @Test
    public void DateFashion_TestOneIsPoor(){
        assertEquals("Don't go to restaurant",0,cut.getATable(5,2));
    }

    @Test
    public void DateFashion_TestBothOK(){
        assertEquals("Maybe go to restaurant",1,cut.getATable(5,5));
    }
}
