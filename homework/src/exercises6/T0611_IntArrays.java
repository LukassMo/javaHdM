package exercises6;

public class T0611_IntArrays {
	public static void main(String[] args) {
		SubQuestionA();
	}
	 static void SubQuestionA() {
		int[] a = {3,6,1,2,10,32,13,89,3,2,1,4};
		System.out.println(a[3]);
		System.out.println(a[7]);
		System.out.println(a[11]); //13 was out of the range, so I had to change it to 11
	}
}
