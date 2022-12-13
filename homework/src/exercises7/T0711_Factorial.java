package exercises7;

public class T0711_Factorial {
	public static void main(String[] args) {
		
		System.out.println(factorial(100));
	}
	
	static long factorial(int input) {
		int num = input;
		long res = 1;
		
		for(int i = 1; i <= num; i++) {
			res = res * i;
		}
		
		return res;
	}
}
