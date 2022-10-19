package homework;
import java.util.Scanner;

public class T0404_Bonus {
	public static void main(String[] args) {
		int bonus_rate = 0;
		double bonus_rate_percentage;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("What was your income last year?: ");
		double yearly_income = myScanner.nextDouble();
		System.out.println("What was your job tenure? (In years): ");
		int job_tenure = myScanner.nextInt();
		bonus_rate_percentage = 0;
		
		if (job_tenure >= 15) {
			bonus_rate = 20;
			bonus_rate_percentage = 0.2;
		}else if(job_tenure >= 5) {
			bonus_rate = 15;
			bonus_rate_percentage = 0.15;
		}else if(job_tenure >= 2 ) {
			bonus_rate = 10;
			bonus_rate_percentage = 0.1;
		}else if(job_tenure < 2) {
			bonus_rate = 5;
			bonus_rate_percentage = 0.05;
			}
		System.out.println("You will recieve a bonus of " + bonus_rate + " percent.");
		System.out.println("Your bonus ammount will be " + (bonus_rate_percentage*yearly_income));
		}
}
