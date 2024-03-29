package com.codeWayTask1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	
	private static final int MIN_RANGE =1;
	private static final int MAX_RANGE = 100;
	private static final int MAX_ATTEMPTS = 5;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Welcome to the Number Game ! ");
		System.out.println("Guess a number between "+ MIN_RANGE + " and " + MAX_RANGE);
		
		int rounds = 0;
		int totalAttempts = 0;
		int totalGuesses = 0;
		
		while (true) {
			int targetNumber = random.nextInt(MAX_RANGE- MIN_RANGE +1) + MIN_RANGE;
			int attempts =0;
			
			System.out.println("Round "+(++rounds)+":");
			
			while(attempts < MAX_ATTEMPTS) {
				System.out.println("Enter your guess :");
				int guess = sc.nextInt();
				totalAttempts ++;
				attempts ++;
				
			if(guess == targetNumber) {
				System.out.println("Congratulation ! YOu guessed the correct number...");
				totalGuesses ++;
				break;
			}
			else if(guess < targetNumber) {
				System.out.println("Too low ! Try Again .");
			
			}else {
				System.out.println("Too high ! Try Again .");
			
			}
			
			if (attempts == MAX_ATTEMPTS) {
				System.out.println("You have reached the maximum number of attempts.the correct number was :" + targetNumber);
			}
				
			}
			
			System.out.println("Do you want tp play again ? (YES/NO) :");
			String playAgain = sc.next().toLowerCase();
			if(!playAgain.equals("yes")) {
				break ;
			}
			
		}
		
		System.out.println("\n Game Over !!!!");
		System.out.println("Total Rounds :" + rounds);
		System.out.println("Total Attempts :"+ totalAttempts);
		System.out.println("Total Guesses :"+ totalGuesses);
	
	sc.close();

	}

}
