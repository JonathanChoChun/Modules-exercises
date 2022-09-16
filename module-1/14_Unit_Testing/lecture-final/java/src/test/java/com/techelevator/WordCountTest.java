package com.techelevator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {
    private WordCount cut = new WordCount();
    @Test
    public void WordCount_CheckMap(){
        //getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
        //ass
        Map<String,Integer> testMap = new HashMap<>();
        testMap.put("ba",2);
        testMap.put("black",1);
        testMap.put("sheep",1);
        assertEquals("Map returns correctly",testMap,cut.getCount(new String[]{"ba","ba","black","sheep"}));
    }
}
