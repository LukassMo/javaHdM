package exercisesRECAP;

public class T1001_LinearSort {
	public static void main(String args[]) {
		// a
		int[] v = { 67, 24, 4, 56, 54, 72, 88, 96, 52, 90, 43, 37, 16, 22, 74 };
/*		// b, c
		int min = v[0];
		int indexmin = 0;
		for (int k = 0; k < v.length; ++k) {
			if (min > v[k]) {
				min = v[k];
				indexmin = k;
			}
		}
		System.out.println("Minimum: " + min + " at index " + indexmin);
		// d
		v[indexmin] = v[0];
		v[0] = min;
*/
		// e
		min2Zero(v,0);                      
		printArray(v);
	}

		
	public static void min2Zero(int[] a, int startIndex) {
		int min = a[startIndex];
		int indexmin = startIndex;
		for (int k = startIndex; k < a.length; ++k) {
			if (min > a[k]) {
				min = a[k];
				indexmin = k;
			}
		}

		a[indexmin] = a[startIndex];
		a[startIndex] = min;
	}

	static void printArray(int[] ar) {
		for (int i = 0; i < ar.length; ++i) {
			System.out.print(ar[i]);
			if (i < ar.length - 1)
				System.out.print(", ");
			else
				System.out.println();
		}
	}
}
