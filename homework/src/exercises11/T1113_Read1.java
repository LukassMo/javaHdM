package exercises11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class T1113_Read1 {
	public static void main(String[] args) throws IOException {
		// a
		FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);
		// b
		String a1 = br.readLine();
		String a2 = br.readLine();
		String a3 = br.readLine();

		System.out.println(a1 + a2 + a3);

		// c
		String a4 = br.readLine();
		System.out.println(a4);
		// prints out null because 4th line is empty.

		// d
		String frankensteinStr = a1 + a2 + a3;

		// e
		JOptionPane.showMessageDialog(null, frankensteinStr);
		
		// f
		String frankensteinStr2 = a1 +"\n"+ a2 +"\n"+ a3;
		JOptionPane.showMessageDialog(null, frankensteinStr2);

		/*
		 * showMessageDialog(Component parentComponent, Object message) The
		 * showMessageDialog method creates a dialog box that typically contains a
		 * message, an icon representing the message type, and an OK button. It can be
		 * used to display various types of messages or information to the user in a
		 * graphical way. Parameters:
		 * 
		 * parentComponent: parentComponent determines the Frame inwhich the dialog is
		 * displayed; if null,or if the parentComponent has no Frame, a default Frame is
		 * used.
		 * message the Object to display
		 */
	}
}
