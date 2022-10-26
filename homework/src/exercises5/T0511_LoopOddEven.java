package exercises5;

public class T0511_LoopOddEven {
	public static void main(String[] args) {
		int i;
		int START = 1;
		int END = 151;
		for(i = START; i < END; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("End of for loop");
		
		int x = 1;
		
		while(x<151) {
			System.out.println(x);
			x++;
		}
		System.out.println("End of while loop");
	}
}
