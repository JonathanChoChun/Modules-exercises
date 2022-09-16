package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class NonStartTest {
    private NonStart cut;

    @Before
    public void setup(){
        cut= new NonStart();
    }

    @Test
    public void NonStart_TestCase1(){
        assertEquals("Incorrect return","ellohere",cut.getPartialString("Hello","There"));
    }

    @Test
    public void NonStart_TestCase2(){
        assertEquals("Incorrect return","avaode",cut.getPartialString("java","code"));
    }

    @Test
    public void NonStart_TestCase3(){
        assertEquals("Incorrect return","hotlava",cut.getPartialString("shotl","java"));
    }

    @Test
    public void NonStart_EmptyStringA(){
        assertEquals("Incorrect return","ava",cut.getPartialString("","java"));
    }

    @Test
    public void NonStart_EmptyStringB(){
        assertEquals("Incorrect return","rogramming",cut.getPartialString("programming",""));
    }
}
