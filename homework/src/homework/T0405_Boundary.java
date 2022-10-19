package homework;
import java.util.Scanner;

public class T0405_Boundary {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int lowerBoundary = 13;
		int upperBoundary = 100;
		
		System.out.println("Enter a number:");
		int num = myScanner.nextInt();
		
		if(upperBoundary >= num) {
			System.out.println("Number is in the upper range!");
			if(lowerBoundary <= num) {
				System.out.println("Number is in the boundary range");
			}
		}System.out.println("Number is outside of the boundaries (If this is the first message you saw)");
		
		

	}

}
