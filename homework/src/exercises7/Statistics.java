package exercises7;

public class Statistics {
	public static void main(String[] args) {

	}

	static void printArray(int[] a) {
		String return_str = "";
		for (int i = 0; i < a.length; i++) {
			return_str = return_str + (a[i] + " "); // add numbers and a space to the return string
		}
		System.out.println(return_str);
	}

	static int getAvg(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		int average = sum / a.length;
		return average;
	}

	static int getMax(int[] a) {
		int max = a[0]; // Initialize max as first index of a

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	static int getMin(int[] a) {
		int min = a[0]; // Initialize min as first index of a

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
}
