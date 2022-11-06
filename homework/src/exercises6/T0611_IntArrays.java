package exercises6;

public class T0611_IntArrays {
	public static void main(String[] args) {
		SubQuestion_a(); //Enter e.g "SubQuestion_a, SubQuestion_b, SubQuestion_c..."
	}

	// My Code for Sub Question A
	static void SubQuestion_a() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
	}

	// My Code for Sub Question B
	static void SubQuestion_b() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };

		System.out.println(a[3]);
		System.out.println(a[7]);
		System.out.println(a[11]); // 13 was out of the range, so I had to change it to 11
	}

	static void SubQuestion_c() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		a[2] = 0;
		System.out.println(a[2]);
	}

	static void SubQuestion_d() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		a[1] = a[6];
		System.out.println(a[1]);
	}

	static void SubQuestion_e() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		a[0] = a[8] + a[9] + a[10]; // adds 3+2+1
		System.out.println(a[1]);
	}

	static void SubQuestion_f() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		System.out.println(a); // What is printed is a hashcode which references the array a. It's basically
								// something the computer can understand to localize and call the array.
	}

	static void SubQuestion_g() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		for (int x = 0; x < a.length; x++) {
			System.out.print("a[" + x + "]: ");
			System.out.println(a[x]);
		}
	}

	static void SubQuestion_h() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		int[] b = new int[a.length];
	}

	static void SubQuestion_i() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		int[] b = new int[a.length];
		b[3] = a[3];
		b[5] = a[5];
		b[8] = a[8];
	}

	static void SubQuestion_j() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		int[] b = new int[a.length];
		b[3] = a[3];
		b[5] = a[5];
		b[8] = a[8];
		System.out.println(b[0]); // Any integer array index that is not set to a value by the programmmer is
									// initialized to a zero value.
	}

	static void SubQuestion_k() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		int[] c = new int[a.length];
	}

	static void SubQuestion_l() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		int[] c = new int[a.length];
		for (int x = 0; x < c.length; x++) {
			c[x] = a[x];
			System.out.println(c[x]); // print to check if c array at index x is correct.
		}
	}

	static void SubQuestion_m() {
		int[] a = { 3, 6, 1, 2, 10, 32, 13, 89, 3, 2, 1, 4 };
		int[] b = new int[a.length];
		b[3] = a[3];
		b[5] = a[5];
		b[8] = a[8];
		int[] c = new int[a.length];
		for (int x = 0; x < c.length; x++) {
			c[x] = a[x];
		}

		for (int x = 0; x < a.length; x++) { // prints the a array
			System.out.print("a[" + x + "]: ");
			System.out.print(a[x] + " ");
		}
		System.out.println("");
		for (int x = 0; x < b.length; x++) { // prints the b array
			System.out.print("b[" + x + "]: ");
			System.out.print(b[x] + " ");
		}
		System.out.println("");
		for (int x = 0; x < c.length; x++) { // prints the c array
			System.out.print("c[" + x + "]: ");
			System.out.print(c[x] + " ");
		}
		System.out.println("");

	}

}
