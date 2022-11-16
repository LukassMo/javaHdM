package exercises7;

public class T0713_Reverse {
	public static void main(String[] args) {
		int[] nums = {3,2,10,4,3,20,4,5,10,20};
		
//		[SUBQUESTION B-D]		
//		int[] numRev = new int[nums.length]; //creates an array numRev with size of nums
//		for(int i = 0; i < nums.length; i++) {
//			numRev[i] = nums[(nums.length - 1)-i]; //Fills up numRev in reverse order
//		}
//		System.out.println(Statistics.printArray(nums));
//		System.out.println(Statistics.printArray(numRev)); //printed out using the methods from Statistics, but manually entering the numRev.
		
		Statistics.printArray(nums);
		Statistics.printArray(reverseArray(nums)); //
		
		
	}
	public static int[] reverseArray(int[] x) {
		int[] xRev = new int[x.length];//creates an array xRev with size of x
		for(int i = 0; i < x.length; i++) {
			xRev[i] = x[(x.length - 1)-i]; //Fills up xRev in reverse order
		}
	return xRev;
	}
			
}
