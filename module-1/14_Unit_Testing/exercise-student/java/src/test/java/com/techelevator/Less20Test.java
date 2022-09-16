package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Less20Test {

    private Less20 cut;

    @Before
    public void setup(){
        cut= new Less20();
    }

    @After
    public void tearDown(){
        System.out.println("after running");
    }

    @Test
    public void Less20Test_TestNum18(){
        assertEquals("Should be less than",true,cut.isLessThanMultipleOf20(18));
    }

    @Test
    public void Less20Test_TestNum19(){
        assertEquals("Should be less than",true,cut.isLessThanMultipleOf20(19));
    }

    @Test
    public void Less20Test_TestNum20(){
        assertEquals("Should not be less than",false,cut.isLessThanMultipleOf20(20));
    }


}
