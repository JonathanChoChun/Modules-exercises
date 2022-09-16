package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args)  {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */
//		try (
//				Scanner dataInput = new Scanner(inputFile);
//				PrintWriter dataOutput = new PrintWriter(outputFile)
//		) {
//			while(dataInput.hasNext()) {
//				String lineOfInput = dataInput.nextLine();
//				dataOutput.println(lineOfInput.replace("mobile", "cellphone"));
//			}
//		} catch (FileNotFoundException ex) {
//			System.err.println("Can not open the file for writing.");
//		}
		//File inputFile = new File("c:\\Workspace\\st-rob-stewart\\test.txt");
		//C:\Projects\TechElevator\20220711\Workspace\working-jpmc-production\module-1\17_FileIO_Writing_out\lecture-student\java\info.txt
		File inputFile = new File("info.txt");
		File outputFile = new File("info_out.txt");
		System.out.println(outputFile.getAbsolutePath());

		try {
			if (!outputFile.createNewFile()) {
				System.out.println("File overwritten");
			}
		} catch (IOException e) {
			System.err.println("Could not create output");
			System.exit(2);;
		}

		String stringToReplace = "file";
		String stringToReplaceWith = "chicken";
		System.out.println(inputFile.getAbsolutePath());
		try (Scanner input = new Scanner(inputFile);
			 PrintWriter output = new PrintWriter(outputFile)
		){
			while (input.hasNextLine()) {
				//System.out.println(input.nextLine());
				String line = input.nextLine();
				line = line.replace(stringToReplace,stringToReplaceWith);
				//System.out.println(line);
				output.println(line);
				output.flush();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		File targetFile = new File("info_final.txt");
		if (targetFile.delete()) {
			System.out.println("Removing target file");
		}
		if (!outputFile.renameTo(targetFile)){
			System.err.println("Could not rename file!!!");
		}


	}

}
