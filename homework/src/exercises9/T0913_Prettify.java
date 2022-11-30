package exercises9;

import java.util.Scanner;

public class T0913_Prettify {
	public static void main(String[] args) {
		// Question a
		String hello = "Hello";
		String pretty_hello = "";
		for (int x = 0; x < hello.length(); x++) {
			pretty_hello = pretty_hello + hello.substring(x, x + 1) + "*"; // Takes a letter from hello and adds a star
																			// before adding it to the pretty_hello
																			// string
		}
		// Question b
		System.out.println(PrettifyMethod.prettify("Hippopotamus", '~'));

		// Question c
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Hello, please enter a String");
		String user_str = myScanner.nextLine();

		System.out.println("Your prettified String: " + PrettifyMethod.prettify(user_str, '*'));
	}
}
