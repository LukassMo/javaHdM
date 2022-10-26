package exercises5;

public class T0513_LoopWhileFor {
	public static void main(String[] args) {
		int i=20;
		//The while loop prints i, which starts at 20 and decreases by 2 with every loop.
		while(i>0) {
			System.out.println(i);
			i=i-2;
		}
		//This is the for loop, imitating the while loop from above.
		for(int x=20;x>0;x=x-2) {
			System.out.println(x);
		}
	}
}
