package exercises9;

import java.util.Scanner;

public class T0912_Comparison {
	public static void main(String[] args) {
		// Question a
		String a = "Hello";
		String b = "Hello";
		// Question b
		boolean are_strings_equal_1 = a == b;

		System.out.println(are_strings_equal_1);
		// Question c
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a String please");
		String c = myScanner.nextLine();
		// Question d
		boolean are_strings_equal_2 = a == c;
		System.out.println(are_strings_equal_2);
		// False gets returned even though the String I enter is the same. The problem
		// is that I used the == operator. This compares if the objects are equal and
		// not if the value is equal, and apparently a String and a Scanned String are
		// different object. To compare Strings we should use the equals method. e.g
		// a.equals(c)
		
		
		//Question e
		boolean using_equals = a.equals(c);
		System.out.println(using_equals);
		//It seems like that when we use the equals method, the actual value gets compared
	}
}
