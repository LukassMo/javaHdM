package exercises11;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class T1115_Files {
	public static void main(String[] args) throws IOException {
		//a
		File fl = new File("C:\\Users\\ninte\\git\\javaHdM\\homework\\src\\exercises11");
		//b
		File[] file_array = fl.listFiles();
		System.out.println(file_array[1]);
		//c
		String concatenated_str = "";
		for(int k = 0; k < file_array.length; ++k) {
			concatenated_str = concatenated_str + file_array[k] + "\n";
			
		}
		
		JOptionPane.showMessageDialog(null, concatenated_str);
		
		
				
	}
}
