package com.techelevator;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Where is the input file (please include the path to the file)? ");
		String inputFile= userInput.nextLine();
		File input= new File(inputFile);

		System.out.print("How many lines of text (max) should there be in the split files? ");
		String maxLine= userInput.nextLine();
		int maxLineInt = Integer.parseInt(maxLine);



		List<String> fileData = new ArrayList<>();
		int countLine=0;
		try(Scanner dataInput= new Scanner(input)){
			while(dataInput.hasNextLine()){

				fileData.add(dataInput.nextLine());
				countLine++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int numOfFileProduced=(countLine/maxLineInt)+1;
		System.out.println("The input file has "+countLine+" lines of text.");
		System.out.println("");
		System.out.println("Each file that is created must have a sequential number assigned to it.");
		System.out.println("For a "+countLine +" line input file \"input.txt\", this produces "+numOfFileProduced +" output files.");
		System.out.println("");
		System.out.println("**GENERATING OUTPUT**");

		int lineCountInFile=0;
		int fileNumber=1;
		File outputName= new File("input-"+fileNumber+".txt") ;
		outputName.delete(); // it will try to delete the file if the exist, it would not fail, only true and false is return
		System.out.println("Generating "+outputName);



		for(int i=0;i<fileData.size();i++){

				try(PrintWriter output=new PrintWriter(new FileOutputStream(outputName,true))){
					output.println(fileData.get(i));
				} catch (FileNotFoundException e) {
					System.err.println("File not found");
				}
				lineCountInFile++;

				if (lineCountInFile==maxLineInt) {
					fileNumber++;
					outputName = new File("input-" + fileNumber + ".txt");
					outputName.delete(); // it will try to delete the file if the exist, it would not fail, only true and false is return

					System.out.println("Generating " + outputName);
					lineCountInFile = 0;
				}

		}


	}

}
