package homework;
import java.util.Scanner;


public class T0401_BiggerSmaller {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("ENTER A NUMBER: ");
		
		int firstnum = myScanner.nextInt();
		
		System.out.println("ENTER A SECOND NUMBER: ");
		
		int secondnum = myScanner.nextInt();
		
		if(firstnum > secondnum) {
			System.out.println("The first number " + firstnum + " is bigger.");
			System.out.println("The second number " + secondnum + " is smaller.");
		}else if(secondnum > firstnum){
			System.out.println("The second number " + secondnum + " is bigger.");
			System.out.println("The first number " + firstnum + " is smaller.");
		}else{
			System.out.println("Both numbers are the same!");
		}
	}
}
