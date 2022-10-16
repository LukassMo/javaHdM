package homework;

public class Task2_Main_exercises {

	public static void main(String[] args) {
		boolean a = true, b = false, c = true;
		boolean d, e, f, g;
		d = !a || b;
		e = (d && !c) || !a;
		f = ((d == e) || (d != e)) == true;
		g = 5 == 7;
		
		System.out.println(d); //false [d]
		System.out.println(e); //false [e]
		System.out.println(f); //true [f]	
		System.out.println(g); //false [g]
		
	}

}
