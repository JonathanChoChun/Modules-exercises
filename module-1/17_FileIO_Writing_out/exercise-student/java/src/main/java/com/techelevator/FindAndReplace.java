package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        // Ask user input for search word
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchWord=userInput.nextLine();

        // Ask user input for replace word
        System.out.println("What is the replacement word?");
        String replacementWord=userInput.nextLine();

        // Ask user input for source file
        System.out.println("What is the source file?");
        String sourceFile=userInput.nextLine();
        File inputFile = new File(sourceFile);
        if (!inputFile.exists()){
            System.err.println("File does not exist");
            System.exit(2); // why exit code 2

        }


        // Ask user input for destination file
        System.out.println("What is the destination file?");
        String destinationFile=userInput.nextLine();
        File outputFile = new File(destinationFile);
        try {

            //
            if (!outputFile.createNewFile()) {
                System.out.println("File overwritten");
            }
        } catch (IOException e) {
            System.err.println("Could not create output file");
            System.exit(2);;
        }

        // read the source file, carry replace and write to output file
        try (Scanner dataInput = new Scanner(inputFile); PrintWriter dataOutput =new PrintWriter(outputFile)){
            while(dataInput.hasNext()){
                String lineOfInput = dataInput.nextLine();
                dataOutput.println(lineOfInput.replace(searchWord, replacementWord));

                // make sure buffer get flush to the file
                dataOutput.flush();
            }
         }catch (FileNotFoundException ex) {
            System.err.println("Can not open the file for writing.");
        }



        // output to destination file

    }

}
