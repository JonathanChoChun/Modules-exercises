package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a destination file");
		String outputFile = userInput.nextLine();
		File destinationFile = new File(outputFile);

		try {

			// True, if file does not exist, false if it does, and it should overwrite
			if(!destinationFile.createNewFile()){
				System.out.println("file overwritten");
			}
		} catch (IOException e) {
			System.err.println("Cannot create output file");
			System.exit(2);
		}

		try (PrintWriter dataOutput= new PrintWriter(destinationFile)){

			for (int i=1;i<=300;i++){

				if (i%3==0&&i%5==0){
					dataOutput.println("FizzBuzz");
				}
				else if (i%3==0| String.valueOf(i).contains("3")){
					dataOutput.println("Fizz");
				}else if (i%5==0|String.valueOf(i).contains("5")){
					dataOutput.println("Buzz");
				}else{
					dataOutput.println(i);
				}

			}

		} catch (FileNotFoundException e) {
			System.err.println("file not found");
			System.exit(2);
		}


	}

}
