package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBitsTest {

    private StringBits cut;

    @Before
    public void setup(){
        cut= new StringBits();
    }

    @Test
    public void StringBits_TestCase1(){
        assertEquals("Incorrect return","Hlo",cut.getBits("Hello"));
    }

    @Test
    public void StringBits_TestCase2(){
        assertEquals("Incorrect return","Hello",cut.getBits("Heeololeo"));
    }
    @Test
    public void StringBits_TestCase3(){
        assertEquals("Incorrect return","H",cut.getBits("Hi"));
    }


}
