package exercises5;

public class T0536_MultTable2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int x = 0; i != x; x++) {
				System.out.print(i + " ");
			}
			System.out.println(""); // if i and x are same make a new line
		} // e.g if 5 was printed 5 times -> new line
	}
}
