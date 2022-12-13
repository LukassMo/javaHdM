package exercises11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class T1113_Read2 {
	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String strCurrentLine;
		
		while ((strCurrentLine = br.readLine()) != null) {
			String frankensteinStr = strCurrentLine;
			System.out.println(frankensteinStr);
	
		}
		String frankensteinStr = strCurrentLine;

		//GUI
		JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);
	       
	       JOptionPane.showMessageDialog(button, "suup", frankensteinStr, 1);
	}
	
}

