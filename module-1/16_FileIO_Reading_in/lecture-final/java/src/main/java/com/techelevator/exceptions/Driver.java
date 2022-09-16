package com.techelevator.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        //Exception examples
        //catching unchecked exceptions
//        System.out.println(firstCharacter("first"));
//        System.out.println(firstCharacter(null));
//        System.out.println(firstCharacter(""));

        //checked exceptions

//        try {
//            System.out.println(firstCharacterWithException(""));
//        } catch (BadStringException e) {
//            System.out.println(e.getMessage());
//            System.out.println("You passed in :'" + e.getYourBadStringMessage() + "'");
//            System.out.println("firstCharacterWithException(\"\") doesn't work");
//        }

        Scanner userInput =new Scanner(System.in);
        String fileName;
        System.out.println("Enter file name");
        fileName = userInput.nextLine();

        File file1 = new File(fileName);
        if (!file1.exists()){
            System.out.println("Enter file name again (type exit if you are done)");
            fileName = userInput.nextLine();
        }

        //File vs Directory
        File file = new File("rtn.txt");
        System.out.println("Starting");
        //if (file.exists()) {
            System.out.println("Reading File");

            try (Scanner inputFile = new Scanner(file)) {
                while (inputFile.hasNextLine()) {
                    String line = inputFile.nextLine();
                    System.out.println(line);
                    //System.out.println(line.substring(5000000));
                }

            } catch (FileNotFoundException e) {

                System.out.println("File is not there");

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
//        } else {
//            System.out.println("That file didn't even exist, stop it");
//        }
        System.out.println("Done");


        //Scanner with a File vs System.in


        //Custom Exception



    }

    public static String firstCharacter(String str){
        //example of an unchecked exception
        String returnStr = "%";
        try {
            returnStr =  str.substring(0, 1);
            returnStr = "X";
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
            returnStr = "*";
        } catch (Exception e){
            returnStr = "?";
        } finally {
            returnStr = "!";
        }
        return returnStr;
    }

    public static String firstCharacterWithException(String str) throws BadStringException {
        if (str==null || str.length()==0) {
            //unchecked exception
            //throw new RuntimeException("str has to be a String with 1 or more characters");
            //checked exception
            throw new BadStringException("str has to be a String with more 1 or more characters",str);
        }
        return str.substring(0, 1);
//        String returnStr =  str.substring(0, 1);
//        return returnStr;
    }
}
