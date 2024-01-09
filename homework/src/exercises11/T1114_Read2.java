package exercises11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class T1114_Read2 {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);

		String strCurrentLine;
		String frankensteinStr = "";

		// Writing it as while(br.readLine() != null{} is wrong, becuase when we call
		// readLine() it already goes on to the next line.
		while ((strCurrentLine = br.readLine()) != null) {

			frankensteinStr = frankensteinStr + strCurrentLine;
		}

		JOptionPane.showMessageDialog(null, frankensteinStr);
	}

}
