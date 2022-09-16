package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontTimesTest {
    private FrontTimes cut;

    @Before
    public void setup(){
        cut= new FrontTimes();
    }

    @After
    public void tearDown(){
        System.out.println("after running");
    }

    @Test
    public void FrontTimesTest_TestCase1(){
        assertEquals("Incorrect return","ChoCho",cut.generateString("Chocolate",2));
    }

    @Test
    public void FrontTimesTest_TestCase2(){
        assertEquals("Incorrect return","ChoChoCho",cut.generateString("Chocolate",3));
    }

    @Test
    public void FrontTimesTest_TestCase3(){
        assertEquals("Incorrect return","AbcAbcAbc",cut.generateString("Abc",3));
    }

}
