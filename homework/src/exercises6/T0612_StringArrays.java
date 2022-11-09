package exercises6;

public class T0612_StringArrays {
	public static void main(String[] args) {
		SubQuestion_a();	//Enter e.g "SubQuestion_a, SubQuestion_b, SubQuestion_c..."
	}

	static void SubQuestion_a() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
	}

	static void SubQuestion_b() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
		String[] firstNames = { "Heinz", "Julia", "Erwin", "Konstanze", "Jürgen", "Horst" };
	}

	static void SubQuestion_c() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
		String[] firstNames = { "Heinz", "Julia", "Erwin", "Konstanze", "Jürgen", "Horst" };

		for (int x = 0; x < lastNames.length; x++) { // prints all last names
			System.out.println(lastNames[x]);
		}

		for (int x = 0; x < firstNames.length; x++) { // prints all first names
			System.out.println(firstNames[x]);
		}

	}

	static void SubQuestion_d() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
		String[] firstNames = { "Heinz", "Julia", "Erwin", "Konstanze", "Jürgen", "Horst" };

		String[] firstNamesLastNames = new String[lastNames.length];
	}

	static void SubQuestion_e() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
		String[] firstNames = { "Heinz", "Julia", "Erwin", "Konstanze", "Jürgen", "Horst" };

		String[] firstNamesLastNames = new String[lastNames.length];

		for (int x = 0; x < lastNames.length; x++) {
			firstNamesLastNames[x] = firstNames[x] + " " + lastNames[x];
		}
	}

	static void SubQuestion_f() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
		String[] firstNames = { "Heinz", "Julia", "Erwin", "Konstanze", "Jürgen", "Horst" };

		String[] firstNamesLastNames = new String[lastNames.length];

		for (int x = 0; x < lastNames.length; x++) {
			firstNamesLastNames[x] = firstNames[x] + " " + lastNames[x];
			System.out.println(firstNamesLastNames[x]);
		}
	}

	static void SubQuestion_g() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
		String[] firstNames = { "Heinz", "Julia", "Erwin", "Konstanze", "Jürgen", "Horst" };

		String[] firstNamesLastNames2 = new String[lastNames.length];

		for (int x = 0; x < lastNames.length; x++) {
			firstNamesLastNames2[x] = firstNames[x] + " " + lastNames[(lastNames.length - 1) - x]; // lastNames.length-1
																									// because .length
																									// counts from 1 but
																									// we index from 0
		}
	}

	static void SubQuestion_i() {
		String[] lastNames = { "Meier", "Müller", "Schmidt", "Huber", "Fuchs", "Meisel" };
		String[] firstNames = { "Heinz", "Julia", "Erwin", "Konstanze", "Jürgen", "Horst" };

		String[] firstNamesLastNames2 = new String[lastNames.length];

		for (int x = 0; x < lastNames.length; x++) {
			firstNamesLastNames2[x] = firstNames[x] + " " + lastNames[(lastNames.length - 1) - x]; // lastNames.length-1
																									// because .length
																									// counts from 1 but
																									// we index from 0
			System.out.println(firstNamesLastNames2[x]);
		}
	}
}
