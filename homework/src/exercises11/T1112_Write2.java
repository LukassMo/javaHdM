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

		FileWriter fw = new FileWriter("text2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
	
		
		pw.println(a);
		pw.println(b);
		pw.println(c);
		
	
		pw.close();
		bw.close();
		fw.close();
		
	}
}
