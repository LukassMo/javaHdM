package exercises9;

public class PrettifyMethod {
	public static String prettify(String s, char c) {
		String prettified_string = "";
		for (int x = 0; x < s.length(); x++) {
			prettified_string = prettified_string + s.substring(x, x + 1) + c; // Takes a letter from String s and adds
																				// a star
																				// before adding it to the
																				// prettified_string
		}
		return prettified_string;
	}
}
