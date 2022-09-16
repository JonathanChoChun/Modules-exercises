package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameFirstLastTest {
    private SameFirstLast cut;

    @Before
    public void setup(){
        cut= new SameFirstLast();
    }

    @Test
    public void NonStart_TestCase1(){
        assertEquals("first and last not the same",false,cut.isItTheSame(new int[] {1,2,3}));
    }

    @Test
    public void NonStart_TestCase2(){
        assertEquals("first and last the same",true,cut.isItTheSame(new int[] {1,2,3,1}));
    }

    @Test
    public void NonStart_TestCase3(){
        assertEquals("first and last not the same",true,cut.isItTheSame(new int[] {1,2,1}));
    }

}
