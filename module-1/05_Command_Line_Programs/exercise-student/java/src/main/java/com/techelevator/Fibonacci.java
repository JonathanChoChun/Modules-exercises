package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Please enter a number: ");
		Scanner userInput = new Scanner(System.in);
		String inputtedValues= userInput.nextLine();
		int integer = Integer.parseInt(inputtedValues);
		fibonacciSequence(integer);

	}

	static void fibonacciSequence(int num){
		int n1=0;
		int n2=1;
		int n=0;
		String fibonacciSequenceNot1or2="0, 1";
		if (num==1){
			System.out.println("0, 1, 1");
		}else if(num<=0){
			System.out.println("0,1");
		}else {
			while(n<num){
				n=n1+n2;
				n1=n2;
				n2=n;
				if (n<=num){
				fibonacciSequenceNot1or2+=", "+n;}
			}
			System.out.println(fibonacciSequenceNot1or2);
		}
	}


}
