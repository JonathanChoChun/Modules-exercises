package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
public class WordCountTest {

    private WordCount cut;
    private Map<String, Integer>expected;
    private String[] myNum;

    @Before
    public void setup(){
        cut= new WordCount();
        expected=new HashMap<String,Integer>();
    }

    @Test
    public void WordCountTest_TestCase1(){

        myNum=new String[]{"ba", "ba", "black", "sheep"};

        expected.put("ba",2);
        expected.put("black",1);
        expected.put("sheep",1);

        assertEquals("Incorrect return",expected,cut.getCount(myNum));
    }

    @Test
    public void WordCountTest_TestCase2(){

        myNum=new String[]{"a", "b", "a", "c","b"};

        expected.put("a",2);
        expected.put("b",2);
        expected.put("c",1);

        assertEquals("Incorrect return",expected,cut.getCount(myNum));
    }

    @Test
    public void WordCountTest_TestCase3(){

        myNum=new String[]{};


        assertEquals("Incorrect return",expected,cut.getCount(myNum));
    }

    @Test
    public void WordCountTest_TestCase4(){

        myNum=new String[]{"c", "b", "a"};

        expected.put("c",1);
        expected.put("b",1);
        expected.put("a",1);
        assertEquals("Incorrect return",expected,cut.getCount(myNum));
    }

}
