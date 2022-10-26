package exercises5;

import java.util.Scanner;

public class T0531_Counting1 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int i,lowernum, uppernum, incrementnum;
		
		System.out.println("Count from: ");
		lowernum = myScanner.nextInt();
		
		System.out.println("Count to: ");
		uppernum = myScanner.nextInt();
		
		System.out.println("Increment: ");
		incrementnum = myScanner.nextInt();
		
		for(i=lowernum;i<=uppernum;i=i+incrementnum) {
			System.out.print(i + " ");
		}
	}
}
