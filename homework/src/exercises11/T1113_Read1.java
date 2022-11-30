package exercises11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T1113_Read1 {
	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String strCurrentLine;
		
		while ((strCurrentLine = br.readLine()) != null) {
			String frankensteinStr = strCurrentLine;
			System.out.println(frankensteinStr);
		}
	}
}
