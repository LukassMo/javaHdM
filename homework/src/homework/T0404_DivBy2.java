package homework;
import java.util.Scanner;

public class T0404_DivBy2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = reader.nextInt();
		reader.close(); 
		System.out.println("This is your number divided by 2: " + n/2);
	}
}