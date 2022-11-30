package exercises11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class T1112_Write2 {
	public static void main(String[] args) throws IOException {
		
		String a, b, c;
		a = "Lukas";
		b = "Hamburgers";
		c = "Burritos";

		FileWriter fw = new FileWriter("text.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter("newText.txt");
		
		bw.write(a);
		bw.newLine();

		bw.write(b);
		bw.newLine();

		bw.write(c);
		bw.newLine();
		
		pw.println(a);
		pw.println(b);
		pw.println(c);
		
		
		pw.close();
		bw.close();
		
	}
}
