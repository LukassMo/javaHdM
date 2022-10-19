package homework;
import java.util.Scanner;

public class T0403_EvenOdd {
public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = myScanner.nextInt();
		
		int even_or_odd = number % 2;
		
		if (even_or_odd == 0) {
			System.out.println("This number is even");
		}else {
			System.out.println("This number is odd");
		}
	}
}
