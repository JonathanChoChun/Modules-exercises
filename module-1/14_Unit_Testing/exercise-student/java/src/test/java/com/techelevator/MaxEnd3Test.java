package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MaxEnd3Test {

    private MaxEnd3 cut;

    @Before
    public void setup(){
        cut= new MaxEnd3();
    }



    @Test
    public void MaxEnd3_TestCase1(){
        assertArrayEquals("Incorrect return",new int[]{3,3,3},cut.makeArray(new int[]{1,2,3}));
    }

    @Test
    public void MaxEnd3_TestCase2(){
        assertArrayEquals("Incorrect return",new int[]{11,11,11},cut.makeArray(new int[]{11,5,9}));
    }

    @Test
    public void MaxEnd3_TestCase3(){
        assertArrayEquals("Incorrect return",new int[]{3,3,3},cut.makeArray(new int[]{2,11,3}));
    }


}
