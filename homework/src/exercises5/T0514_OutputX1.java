package exercises5;

public class T0514_OutputX1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// Next another for loop responsible for the output x
			for (int j = 1; j <= i; j++) {
				System.out.print("x");
			    }
			System.out.println();}
	}
	/* MY OTHER METHOD.
		String symbol = "x";
		String output = "";
		
		for(int i = 0; i < 10; i++) {
			output = output + symbol;
			System.out.println(output);
		} */
}
