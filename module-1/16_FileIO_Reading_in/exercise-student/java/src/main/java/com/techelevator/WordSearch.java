package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String fileName = userInput.nextLine();

		File file = new File(fileName);
		while (!file.exists()) {
			System.out.println("Enter valid file name (type exit if you are done)");
			fileName = userInput.nextLine();
			file=new File(fileName);
		}

		System.out.println("What is the search word you are looking for?");
		String searchWord = userInput.nextLine();

		System.out.println("Should the search be case sensitive? (Y\\N)");
		String yOrN = userInput.nextLine();

		// step one
//		try (Scanner dataInput = new Scanner(file)) {
//			int countLine = 1;
//			while (dataInput.hasNext()) {
//				String lineOfInput = dataInput.nextLine();
//				String lineOfInputLowerCase = lineOfInput.toLowerCase();
//				if (lineOfInputLowerCase.contains(searchWord.toLowerCase())) {
//					System.out.println(countLine + ") " + lineOfInput);
//				}
//
//				countLine += 1;
//
//			}
//		}
//		catch (FileNotFoundException e){
//			System.out.println("File not found.");
//		}

		// step two
		try (Scanner dataInput = new Scanner(file)) {
			int countLine = 1;
			while (dataInput.hasNext()) {
				String lineOfInput = dataInput.nextLine();
				if (yOrN.equals("Y")){
					if (lineOfInput.contains(searchWord)) {
						System.out.println(countLine + ") " + lineOfInput);
					}
				}else {
					String lineOfInputLowerCase = lineOfInput.toLowerCase();
					if (lineOfInputLowerCase.contains(searchWord.toLowerCase())) {
						System.out.println(countLine + ") " + lineOfInput);
					}
				}

				countLine += 1;

			}
		}
		catch (FileNotFoundException e){
			System.out.println("File not found.");
		}


		}

	}

