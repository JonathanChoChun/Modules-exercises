package com.techelevator;

import com.techelevator.model.Participant;

public class Driver {
    public static void main(String[] args){
//        //System.out.println((testString1.toLowerCase().equals(testString2.toLowerCase())));
//        String testString2Lower = testString2.toLowerCase();
//        testString2Lower = "norain";
//        testString2Lower = "norain" + "-or alot?";
//        testString2Lower = new String("norain");
//                                     012345678
        String s1 = new String("Rainstormy");
        String s2 = new String("rainStorm"); //new String("Rainstorm");
        //s1.equals();
        //s1.substring()
        System.out.println(s1.length());
        System.out.println(s1.substring(s1.length()-2,s1.length()));


        char[] myValues = s1.toCharArray();
        //System.out.println(String.join(",","k"," test","this"));
        //s1.length()
        //s1.toLowerCase()
        System.out.println(s1.contains("x"));
        s1 = s1.replace("a","x");
        System.out.println(s1.replace("a","x"));
        //s1.replace();
        //s1.toCharArray()
        int pos = s1.indexOf("storm",5);
        System.out.println(pos);
        //System.out.println(s1.substring(pos,s1.length()));
        //s1.toUpperCase()
        System.out.println(s1.contains("x"));

        s1.endsWith("my");
        s1.substring(s1.length()-2,s1.length()).equals("my");
        //String.join()





//
//        int[] testArray = {0,1,2,3};
//
//        int[] testArray2 = new int[4];
//        testArray2[0]=0;
//        testArray2[1]=1;
//        testArray2[2]=2;
//        testArray2[3]=3;

//        int numPeople;
//        int amountOfRain = 2;
//        double temp = 31.45;
//        boolean isItHot;
//        boolean areObjectsCool = true;
//        System.out.println(amountOfRain);
//        System.out.println(temp);
//        System.out.println(areObjectsCool);
//
//        int[] participantNumbers;
//        int[] participantNumbersWithVideo = new int[7];
//        System.out.println(participantNumbersWithVideo);
//
//        Participant person1 = new Participant("Rob",true);
//        System.out.println(person1.getName());
//
//        Participant person2 = new Participant();
//        System.out.println(person2.getName());
//
    }
}

