package exercises11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class T1111_Write1 {
	public static void main(String[] args) throws IOException {
		String a, b, c;
		a = "Lukas";
		b = "Hamburger";
		c = "Burritos";

		FileWriter fw = new FileWriter("text.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(a);
		bw.newLine();

		bw.write(b);
		bw.newLine();

		bw.write(c);
		bw.newLine();
		// A text file called text.txt gets generated. But the content is still empty.

		bw.flush();
		// Now The text file has the strings contents inside. Apparently the point of a
		// buffer is to buffer the data until it is full or you tell it that you want to
		// write.

		bw.close(); // I'm keeping bw.flush just to show what I did.

	}

}
