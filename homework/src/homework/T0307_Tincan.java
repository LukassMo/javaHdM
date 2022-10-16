package homework;

public class T0307_Tincan {
	public static void main(String[] args) {
		final double PI = 3.141592;
		double c, h;
		c = 6;
		h = 14;
		
		double d, a, s, v;
		
		d = c/PI;				//Diameter of the bottom
		a = PI * (d/2)*(d/2);	//Area of the bottom
		s = c * h + 2 * a;
		v = a * h;
		
		System.out.println("The diameter of the bottom of the can is: " + d);
		System.out.println("The area of the bottom of the can is: " + a);
		System.out.println("The surface of the tin can is: " + s);
		System.out.println("The volume of the tin can is: " + v);
		
		}
}
