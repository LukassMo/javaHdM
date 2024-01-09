import java.util.Scanner;
public class T0515_GuessingNumbers {
	public static void main(String[] args) {
		int r = (int) (Math.random() * 10) + 1;
		boolean play = true;
		
		System.out.println("Hi! Please enter a number between 1 to 10: ");
		
		while (play == true) {
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			if (input > r) {
				System.out.println("Your guess is too high");
			} else if (input < r) {
				System.out.println("Your guess is too low");
			} else if (input == r) {
				System.out.println("Success! The correct number was: " + r);
				play = false;
			}
		}
	}
}
