package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lucky13Test {
    private Lucky13 cut;

    @Before
    public void setup(){
        cut= new Lucky13();
    }

    @Test
    public void LuckyTest13Test_No1And3(){

        int[] myNum={0,2,4};
        assertEquals("Contain no 1 and 3",true,cut.getLucky(myNum));
    }

    @Test
    public void LuckyTest13Test_has1And3(){

        int[] myNum={1,2,3};
        assertEquals("Contain 1 and 3",false,cut.getLucky(myNum));
    }

    @Test
    public void LuckyTest13Test_No1And3Another(){

        int[] myNum={1,2,4};
        assertEquals("Contain no 1 and 3",false,cut.getLucky(myNum));
    }


}
