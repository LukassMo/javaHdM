package exercises6;

import java.util.Scanner;

public class T0613_Mean {
	public static void main(String[] args) {
		SubQuestion_b();// Enter e.g "SubQuestion_a, SubQuestion_b, SubQuestion_c..."
	}

	static void SubQuestion_a() {
		Scanner myScanner = new Scanner(System.in);
		int[] my_nums = new int[10];
		int sum = 0;

		for (int x = 0; x <= my_nums.length - 1; x++) {
			int r = (int) (Math.random() * 10) + 1; // random int to tell user what to enter
			System.out.println("Okay...enter the number " + r);
			my_nums[x] = myScanner.nextInt();
		}
		for (int x = 0; x <= my_nums.length - 1; x++) {
			sum += my_nums[x];
		}
		double average = ((double) sum) / my_nums.length; // casts the int sum into a double for a proper int division
		System.out.println("The average of all your numbers is: " + average);
	}

	static void SubQuestion_b() {
		Scanner myScanner = new Scanner(System.in);
		int[] my_nums = new int[10];
		int sum = 0;

		for (int x = 0; x <= my_nums.length - 1; x++) {
			int r = (int) (Math.random() * 10) + 1; // random int to tell user what to enter
			System.out.println("Okay...enter any number");
			my_nums[x] = myScanner.nextInt();
		}
		for (int x = 0; x <= my_nums.length - 1; x++) {
			sum += my_nums[x];
		}
		double average = ((double) sum) / my_nums.length; // casts the int sum into a double for a proper int division
		System.out.println("The average of all your numbers is: " + average);
	}
}
