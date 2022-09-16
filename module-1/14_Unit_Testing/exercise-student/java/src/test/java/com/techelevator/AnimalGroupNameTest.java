package com.techelevator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalGroupNameTest {

    private AnimalGroupName cut;

    @Before
    public void setup(){
        cut= new AnimalGroupName();
    }

    @After
    public void tearDown(){
        System.out.println("after running");
    }

    @Test
    public void AnimalGroupName_TestRhino(){
        assertEquals("Rhino should return Crash","Crash",cut.getHerd("Rhino"));
    }

    @Test
    public void AnimalGroupName_TestCaseInsensitive(){
        assertEquals("ElEphAnT should return Herd","Herd",cut.getHerd("ElEphAnT"));
    }

    @Test
    public void AnimalGroupName_TestNotFound(){
        assertEquals("Should return unknown","unknown",cut.getHerd("kangaroo"));
    }

    @Test
    public void AnimalGroupName_TestEmptyString(){
        assertEquals("Should return unknown","unknown",cut.getHerd(""));
    }

    @Test
    public void AnimalGroupName_TestNull(){
        assertEquals("Should return unknown","unknown",cut.getHerd(null));
    }

}
