package homework;

public class Task4_Main_exercises {
	public static void main(String[] args) {
		boolean b;
		int a = 7, c = 22, d;
		d = (c / a) * 2;
		b = ((c % a) <= (c / a)) && (d==6);
		System.out.println(b); //Value true will be shown
	}
}
