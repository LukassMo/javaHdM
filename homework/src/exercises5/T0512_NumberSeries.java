package exercises5;

public class T0512_NumberSeries {
	public static void main(String[] args) {
		
		double sum, average, counter;
		sum = 0;
		counter = 0;
		
		for (double i = 35; i > 9; i = i - 2.5) {
			  System.out.print(i);
			  System.out.print("; ");
			  sum = sum + i;
			  counter = counter + 1;
			}
		System.out.println("");
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum/counter);
		
	}
}
