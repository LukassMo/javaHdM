package exercises7;

public class T0712_MinMaxAvg {
	public static void main(String[] args) {
		int[] a = { 10, 2, 20, 3, 9, 10, 30, 93, 3, 23, 15, 43, 23, 5, 3 };
		
		System.out.println("These are the elements in array a: "); Statistics.printArray(a);
		System.out.println("The average of array a is: " + Statistics.getAvg(a)); 
		System.out.println("The maximum of array a is: " + Statistics.getMax(a)); 
		System.out.println("The minimum of array a is: " + Statistics.getMin(a)); 
	}

}
