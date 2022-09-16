package com.techelevator;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		// Get User Input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces):");
		String inputtedValues= userInput.nextLine();

		String[] arrayOfInputtedValues = inputtedValues.split(" ");
		for(String decimal:arrayOfInputtedValues){
			System.out.print(decimal+" in binary is ");
			int[] toBinary = convertDecimalToBinary(Integer.parseInt(decimal));
			for (int bit:toBinary){
				System.out.print(bit);
			}
			System.out.println("");

		}

	}

	static int[] convertDecimalToBinary(int decimal) {
		int invertedBinary[] = new int[40];
		int index=0;
		while (decimal>0){
			//index 0 get the LSB, and so on.
			invertedBinary[index++] = decimal%2;
			decimal = decimal/2;
		}
		// index equals the number of bits, so reverse the array to get MSB to LSB
		int binary[] = new int[index];
		for(int i = index-1, j=0 ;i >= 0;i--,j++){
			binary[j]=invertedBinary[i];
		}
		return binary;

	}

}
