package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	private static int numOfCorrectAnswers;
	private static int numOfQuestionsAsked;
	private static List<String> quizQuestions;
	public static void main(String[] args) {


		// Tell user to enter file name
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
		String fileName = userInput.nextLine();
		File file = new File(fileName);

		// Check if file exists, if not, ask again until file exists
		while (!file.exists()) {
			System.out.println("Enter valid file name (type exit if you are done)");
			fileName = userInput.nextLine();
			file=new File(fileName);
		}

		// Store each line of file in a list
		quizQuestions = new ArrayList<>();
		try (Scanner dataInput = new Scanner(file)) {

			while (dataInput.hasNext()) {
				String fileLine = dataInput.nextLine();
				quizQuestions.add(fileLine);
			}

		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
		}


		// Main interaction with user
		for (String line: quizQuestions){

			// print a question to the user
			String[] arrOfStr = line.split("\\|");
			System.out.println(arrOfStr[0]);
			int questionNumber=1;
			for (int i=1;i<arrOfStr.length;i++){
				System.out.println(questionNumber+". "+arrOfStr[i].replace("*",""));
				questionNumber+=1;
			}
			System.out.println("");
			numOfQuestionsAsked+=1;


			int userAnswerAsInt = 0; //temporary
			int correctAnswer = 0;   //temporary to stop might not have been initialized
			boolean isNotValidAnswer=true;

			// ask user for an answer until valid answer is provided
			while (isNotValidAnswer) {
				try {
					System.out.print("Please enter your answer: ");
					String userAnswer = userInput.nextLine();
					userAnswerAsInt = Integer.parseInt(userAnswer);
					if (userAnswerAsInt>arrOfStr.length||userAnswerAsInt<1) {
						System.out.println("Your answer is not part of the choices");
						//throw new AnswerOutOfRangeException("out of range");
					}else{
						System.out.println("");
						System.out.println("Your answer: " + userAnswerAsInt);
						isNotValidAnswer = false;
					}

//					System.out.println("");
//					System.out.println("Your answer: " + userAnswerAsInt);

//					try {
//						if (userAnswerAsInt>arrOfStr.length||userAnswerAsInt<1){
//							throw new AnswerOutOfRangeException("Your answer is not part of the choices");
//						}catch (AnswerOutOfRangeException e){
//							System.out.println("");
//						}


				} catch (NumberFormatException e) {
					System.out.println("Please enter your answer as an integer");

				}
			}

			questionNumber=1;
			for (int i=1;i<arrOfStr.length;i++){
				if (arrOfStr[i].contains("*")){
					correctAnswer=questionNumber;
				}
				questionNumber+=1;
			}


			// check answers
			if (correctAnswer==userAnswerAsInt){
				numOfCorrectAnswers+=1;
				System.out.println("RIGHT!");

			}
			else{
				System.out.println("WRONG!");
			}
			System.out.println("");



		}
		System.out.println("You got "+numOfCorrectAnswers+" answer(s) correct out of the "+numOfQuestionsAsked+" questions asked.");
		if (numOfCorrectAnswers==numOfQuestionsAsked){
			System.out.println("Well done, you got all correct!");
		}
		else{
			System.out.println("Great Effort!");
		}


	}

//	public static AnswerOUtOfRangeException(int answer)

}
