package homework;

public class T0306_Switch {
	public static void main(String[] args) {
		boolean Current, Light, Switch;
		
		Current = false;
		Switch = true;
		
		if (Current && Switch) {
			Light = true;
		}else{
			Light = false;
		}
		System.out.println(Light);
	}
}
