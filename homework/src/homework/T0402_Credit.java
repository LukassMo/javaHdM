package homework;
import java.util.Scanner;

public class T0402_Credit {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = myScanner.nextInt();
		
		if(age<18) {
			System.out.println("I'm sorry. You are to young!");
		}else if(age>=65) {
			System.out.println("I'm sorry. You are to old!");
		}else {
			System.out.println("Approved!");
		}
	}
}
