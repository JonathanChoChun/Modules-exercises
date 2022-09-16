package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Driver {


    public static void main(String[] args){

        //what is a hash and why do we use it
//        System.out.println(Objects.hash("L",1,true,'a'));
//        System.out.println(Objects.hash("L",1,true,'a'));
//        System.out.println(Objects.hash("THis is a long string",1,true,'b'));


        // debugger on error and stop on condition
//        String stringToLookAt = new String("yakThis is theyak string value");
//        //using char
//        for (int i = 0; i< stringToLookAt.length(); i++) {
//            System.out.println(stringToLookAt.charAt(i));
//            if (stringToLookAt.charAt(i)=='i') {
//                System.out.println("Found an 'i'!");
//            }
        //}
        //using substring

        //yak
//        for (int i = 0; i< stringToLookAt.length(); i++) {
//
//            if (stringToLookAt.length() > i + 3) {
//                int y = stringToLookAt.indexOf("yak",i);
//                System.out.println(stringToLookAt.substring(i, i + 1));
//                if (stringToLookAt.substring(i, i + 3) == "yak") {
//                    System.out.println("Found an 'i'!");
//                }
//            }
//        }

        //indexOf
        //altering a list as we iterate through it
        //(after going over lists)



        //review arrays
//        String[] nameArray = new String[4];
//        nameArray[0] = "Ada";
//        nameArray[1] = "Grace";
//        nameArray[2] = "Margaret";
//        nameArray[3] = "Adele";
//        System.out.println(nameArray.length);
//        System.out.println(nameArray[0].length());

        int[] intArray = new int[4];
        List<Integer> intList = new ArrayList<Integer>();
        System.out.println(intList.isEmpty());
        intList.add(new Integer(0));
        System.out.println(intList.isEmpty());
        intList.add(0);
        intList.add(0);
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(2,1000);
        System.out.println("List elements in for i++ loop");
        for (int i = 0; i< intList.size(); i++){
            System.out.println(intList.get(i));
        }
        System.out.println("List elements in for each");
        for (Integer element : intList){
            System.out.println(element);
        }

        System.out.println("Remove elements");
        while (intList.remove(Integer.valueOf(0))){
            System.out.println("Removed one");
        }
        System.out.println("List elements in for each...again");
        for (Integer element : intList){
            System.out.println(element);
        }


        //List<Integer> listOfInts = Arrays.asList();
        //int[] arrayOfInts = intList.toArray(new int[0]);

        Integer[] numbers = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(numbers);



//        List<String> nameList = new ArrayList<String>();
//        nameList.add(new String("Ada"));
//        nameList.add("Grace");
//        nameList.add("Margaret");
//        nameList.add("Adele");
//        //nameList.remove("Adele");
//        nameList.remove(3);








        //List<E>
        //ArrayList<E>
        //Collections<E>
        //Iterable<E>






        //Stack<E>
        //Queue<E>

    }
}
