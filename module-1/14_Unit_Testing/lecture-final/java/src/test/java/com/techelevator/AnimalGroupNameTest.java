package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalGroupNameTest {
    //private AnimalGroupName cut = new AnimalGroupName();
    private AnimalGroupName cut;

    @Before
    public void setup(){
        this.cut = new AnimalGroupName();
        System.out.println("Before running");
    }

    @After
    public void tearDown(){
        System.out.println("After running");
    }

    @Test
    public void AnimalGroupName_TestAnimals() {
        assertEquals("Animal group name null",
                "unknown",
                cut.getHerd(null));

        System.out.println("Unknown");
    }

    @Test
    public void AnimalGroupName_Rhino() {
        assertEquals("Rhinos crash", "Crash", cut.getHerd("rhiNo"));
        System.out.println("Rhino");

    }
}
