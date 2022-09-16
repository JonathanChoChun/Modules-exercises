package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CigarPartyTest {

    private CigarParty cut;

    @Before
    public void setup(){
        cut= new CigarParty();
    }

    @Test
    public void CigarParty_TestNotEnoughCigarsWeekday(){
        assertEquals("Should not have a party",false,cut.haveParty(30,false));
    }

    @Test
    public void CigarParty_TestEnoughCigarsWeekday(){
        assertEquals("Should have a party",true,cut.haveParty(50,false));
    }

    @Test
    public void CigarParty_TestTooMuchCigarsWeekend(){
        assertEquals("Should have a party",true,cut.haveParty(70,true));
    }
}
