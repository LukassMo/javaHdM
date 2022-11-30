package exercises9;

public class T0911_Basis {
	public static void main(String[] args) {
		// Question a
		String a = "Hello";
		String b = " ";
		String c = "Lukas";
		// Question b and c
		String res = a + b + c;
		System.out.println(res);
		// Question d
		String new_res = res.substring(3, 5);
		System.out.println(new_res);
		System.out.println("The length of the sub_string is: " + new_res.length());
		// Question e
		String empty_string = "";

		for (int i = 0; i <= res.length(); i = i + 2) { // Increment i by 2 every loop and use i to index every second
														// character
			empty_string = empty_string + res.substring(i, i + 1);

		}

		System.out.println(empty_string);
	}
}
