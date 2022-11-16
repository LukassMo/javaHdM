package exercises7;

public class T0714_Multarray {
	public static void main(String[] args) {
//		SubQuestion a
		int[] a ={2,5,7,8,9,10};
		int[] b ={2,3,4,5,1,7};
		int[] c = new int[a.length];//creates an array c with size of a
		
		for(int i = 0; i < c.length; i++) {
			c[i] = a[i] * b[i];
		}

//		SubQuestion b
		Statistics.printArray(arrayMultiplier(a,b));
	}
	
	public static int[] arrayMultiplier(int[] x, int[] y) { //Subquestion b
		int[] z = new int[x.length]; //I assume that the arrays x and y have the same length
		for(int i = 0; i < z.length; i++) {
			z[i] = x[i] * y[i]; //Subquestion a
		}
	return z;
	}
	
}
