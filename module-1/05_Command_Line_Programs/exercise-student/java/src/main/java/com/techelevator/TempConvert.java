package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		String inputValue = userInput.nextLine();
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String inputUnit = userInput.nextLine();
		double inputValueToDouble = Double.parseDouble(inputValue);
		celsiusOrFahrenheitBothWayConversion(inputUnit,inputValueToDouble);
	}
	static void celsiusOrFahrenheitBothWayConversion(String unit,double value){
		// compare value not reference, =="f" will not work as unit stores the reference
		if(unit.equals("C")){
			celsiusToFahrenheit(value);
		}else if(unit.equals("F")){
			fahrenheitToCelsius(value);
		}else{
			System.out.println("Please enter 'C' or 'F' only.");
		}
	}

	static void celsiusToFahrenheit(double celsius){
		double fahrenheit=celsius*1.8+32;
		System.out.println((int)celsius+"C "+"is "+(int)fahrenheit+"F");
	}

	static void fahrenheitToCelsius(double fahrenheit){
		double celsius=(fahrenheit-32)/1.8;
		System.out.println((int)fahrenheit+"F "+"is "+(int)celsius+"C");
	}

}
