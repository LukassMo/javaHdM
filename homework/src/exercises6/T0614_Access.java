package exercises6;

import java.util.Scanner;

public class T0614_Access {
	public static void main(String[] args) {
		SubQuestion_b(); // Enter e.g "SubQuestion_a, SubQuestion_b, SubQuestion_c..."
	}

	static void SubQuestion_a() {
		String[] profNames = { "Armin Weichmann", "Karl Schaschek", "Volker Jansen", "Hector Inca", "Stefan Güttler" };
	}

	static void SubQuestion_b() {
		Scanner myScanner = new Scanner(System.in);
		String[] profNames = { "Armin Weichmann", "Hector Inca", "Karl Schaschek", "Volker Jansen", "Stefan Güttler" };
		int usr_input = 0;
		boolean is_input_correct = false;

		while (is_input_correct == false) {
			System.out.println("Enter a number between one and five please!");
			usr_input = myScanner.nextInt();
			if (usr_input >= 1 && usr_input <= 5) { // checks if number is between one and five
				is_input_correct = true;
			} else {
				System.out.println("You have entered a number that is not between one and five...try again!");
			}
		}
		int index_num = usr_input - 1; // -1 because we index from 0
		System.out.println(profNames[index_num]);
	}
}
