package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		String inputValue = userInput.nextLine();
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String inputUnit = userInput.nextLine();
		double inputValueToDouble = Double.parseDouble(inputValue);
		footOrMeterBothWayConversion(inputUnit,inputValueToDouble);
	}

	static void footOrMeterBothWayConversion(String unit,double value){
		// compare value not reference, =="f" will not work as unit stores the reference
		if(unit.equals("f")){
			footToMeter(value);
		}else if(unit.equals("m")){
			meterToFoot(value);
		}else{
			System.out.println("Please enter 'f' or 'm' only.");
		}
	}

	static void footToMeter(double foot){
		double meter=foot*0.3048;
		System.out.println((int)foot+"f "+"is "+(int)meter+"m");
	}

	static void meterToFoot(double meter){
		double foot=meter*3.2808399;
		System.out.println((int)meter+"m "+"is "+(int)foot+"f");
	}

}
