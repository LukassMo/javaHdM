package exercises5;

public class T0533_NestedLoops {
	public static void main(String[] args) {
		for (int y = 0; y < 5; y++) { // y is for how many lines
//			if(y!=0) {
//				System.out.println("");
//				}
			for (int i = 9; i >= 0; i--) { // i is the number printed
				for (int x = 0; x < i; x++) { // x is for how often number is repeated
					System.out.print(i);
				}
			}
			System.out.println("");
		}
	}
}
