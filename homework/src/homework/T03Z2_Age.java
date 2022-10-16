package homework;
import java.util.Scanner;

public class T03Z2_Age {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = myScanner.nextInt();
		
		System.out.println("Your age in days is: " + age * 365);
		myScanner.close();
	}
}
