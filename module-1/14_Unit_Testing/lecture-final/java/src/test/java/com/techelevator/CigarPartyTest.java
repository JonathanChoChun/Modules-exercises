package com.techelevator;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CigarPartyTest {
    private CigarParty cigarParty;
    @Before
    public void setup(){
        cigarParty = new CigarParty();
    }
    @Test
    public void CigarParty_TooManyCigars(){
        assertEquals("Should have a party",true,cigarParty.haveParty(10000,false));
    }
}
