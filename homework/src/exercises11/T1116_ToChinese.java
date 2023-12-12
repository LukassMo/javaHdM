package exercises11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T1116_ToChinese {
	public static void main(String[] args) throws IOException {
		//I copied my code from T1114 Read 2 for the reader
		FileReader fr = new FileReader("exc_script.txt");
		BufferedReader br = new BufferedReader(fr);

		String strCurrentLine;
		String frankensteinStr = "";

		while ((strCurrentLine = br.readLine()) != null) {

			frankensteinStr = frankensteinStr + strCurrentLine + "\n";
		}
		
		br.close();
		fr.close();
		
		String r = writeChinese(frankensteinStr);
		System.out.println(r);
	}
	
	public static String writeChinese(String s) {
		String chinese_str = s.replace('R', 'L');
		return chinese_str.replace('r', 'l');
	}
	
}
