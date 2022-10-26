package exercises5;

import java.util.Scanner;

public class T0515_GuessingNumbers {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int r = (int) (Math.random() *10) + 1;
		int guess;
		
		System.out.println("Guess the number, it's between 1 and 10!");
		
		guess = myScanner.nextInt();
		
		while(guess!=r) {
			if(guess>r) {
				System.out.println("The number you guessed was too high, try again!");
			}
			if(guess<r) {
				System.out.println("The number you guessed was too small, try again!");
			}
			guess = myScanner.nextInt(); //asks user for input again at end of while loop
		}
		
		//If we exit the while loop, the user has guessed correctly
		System.out.println("Hooray! Your guess was correct!");
		
	}
}
