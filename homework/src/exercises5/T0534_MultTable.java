package exercises5;

import java.util.Scanner;

public class T0534_MultTable {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Input number:");
		int input = myScanner.nextInt();
		int sum = 0;		
		for(int i=0; i<=12; i++) {
			System.out.println(input + " x " + i + " = " + input*i);
			sum = sum + input*i;
		}
		System.out.println("The total sum is: " + sum);
	}
}
