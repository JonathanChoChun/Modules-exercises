package com.techelevator;

import com.techelevator.model.SampleRef;

import java.util.*;

public class Driver {
    public static void main(String[] args) {

        //List review
        //removing items through lists as you step through them
//        List<Integer> listOfInts = new ArrayList<>();
//        listOfInts.add(1);
//        listOfInts.add(2);
//        listOfInts.add(3);
//        listOfInts.add(4);
//        listOfInts.add(5);
//        listOfInts.add(6);
//
////        for (int i = 0; i < listOfInts.size(); i++) {
////            System.out.println("Value:" + listOfInts.get(i));
////            if (listOfInts.get(i) % 2 ==0){
////                listOfInts.remove(i);
////            }
////        }
//        for (Integer current : listOfInts) {
//            System.out.println("Value:" + current);
//            if (current % 2 ==0){
//                listOfInts.remove(current);
//            }
//        }

//        List<SampleRef> listOfObjects = new ArrayList<>();
//        listOfObjects.add(new SampleRef(1,false));
//        listOfObjects.add(new SampleRef(2,false));
//        listOfObjects.add(new SampleRef(3,false));
//        listOfObjects.add(new SampleRef(4,false));
//        listOfObjects.add(new SampleRef(5,false));
//
//        SampleRef sample = listOfObjects.get(2);
//        sample.setBoolValue(true);
//
//
//        //using an object from one of our classes
//        //what is an object again?
//        List<SampleRef> returnValue = testList(listOfObjects);
//        System.out.println("Here");

        //
        //Declaring and initializing a Map.
        //        Adding an item to a Map using the put() method.
        //        Retrieving an item from a Map using the get().
        //        Retrieving just the keys from a Map.
        //Hello, Hola, Hello there
        //Thank you, Gracias, Thanks
        //Goodbye, Adios, Goodbye, Darth

        Map<String,String> responseMap = new HashMap<>();
        responseMap.put("HELLO", "Hola");
        responseMap.put("THANKS", "Gracias");
        responseMap.put("GOODBYE", "Adios");
        responseMap.put("GOODBYE", "AdiosAgain");
//        responseMap.put("HELLO", "Hello");
//        responseMap.put("THANKS", "Thank you");
//        responseMap.put("GOODBYE", "Goodbye");
        System.out.println(responseMap.get("HELLO"));



        //Checking to see if a key already exists in the Map.
        //        Replacing an item in the Map using the put() method.
        //        Iterating through the key-value pairs in the Map, using Map.Entry<String, String> nameZip : nameToZip.entrySet() type.
        for (Map.Entry<String, String> word : responseMap.entrySet()){
            System.out.println("Word key is " + word.getKey());
            System.out.println("Word value is " + word.getValue());
            System.out.println("Word value from the key is " + responseMap.get(word.getKey()));
        }

        Map<String,SampleRef> mapOfObjects = new HashMap<>();
        mapOfObjects.put("nothing",null);
        SampleRef one = new SampleRef(1,false);
        mapOfObjects.put("first",one);
        mapOfObjects.put("second",new SampleRef(2,false));
        mapOfObjects.put("third",new SampleRef(3,false));

        SampleRef sample = mapOfObjects.get("first");
        sample.setBoolValue(true);


        mapOfObjects.remove("third");
        mapOfObjects.remove("first");


        //When using Map.Entry, you access the key and value with the getKey() and getValue() methods.
        //        Remind students that Maps are unordered, and items in loop may return in a different order than they were added.
        //        Removing an item from the Map.
        //        Loop again to show item was removed.






    }

    private static List<SampleRef> testList(List<SampleRef> incoming) {
        List<SampleRef> returnList = new ArrayList<>();
        for (SampleRef sample: incoming) {
            if (sample.getIntValue() % 2 == 1) {
                returnList.add(sample);
            }
        }
        incoming.remove(4);

        return returnList;

    }
}
