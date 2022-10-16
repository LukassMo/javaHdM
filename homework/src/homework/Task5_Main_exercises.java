package homework;
import java.util.Scanner;

public class Task5_Main_exercises {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int used_minutes;
		int monthly_fee = 5;
		double minute_fee;
		double total_fee;
		double minute_charge = 0.1;
		
		System.out.println("Hello user! Please input your used minutes: ");
		used_minutes = myScanner.nextInt();
		
		minute_fee = (used_minutes*minute_charge);
		total_fee = (minute_fee+monthly_fee);
		
		System.out.println("1. base fee : " + monthly_fee);
		System.out.println("2. charge per minute : " + minute_charge);
		System.out.println("3. consumed minutes : " + used_minutes);
		System.out.println("4. fee for the consumed minutes : " + minute_fee);
		System.out.println("5. end fee : " + total_fee);
	}
}
