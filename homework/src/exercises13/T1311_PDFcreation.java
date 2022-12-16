package exercises13;

import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.*;

public class T1311_PDFcreation {
	public static void main(String[] args) throws IOException {
		/*
		PDDocument doc = new PDDocument();
		
	      for (int i=0; i<100; i++) {
	          //Creating a blank page 
	          PDPage blankPage = new PDPage();

	          //Adding the blank page to the document
	          doc.addPage( blankPage );
	       } 
		
	    doc.save("C:\\Users\\Lukas\\Documents\\first.pdf");
		doc.close();
		*/
		
		generatePDF();
	}
	
	public static void generatePDF() throws IOException {
		Scanner myScanner = new Scanner(System.in);
		String doc_name;
		int ammount_pages;
		
		PDDocument doc = new PDDocument();
		System.out.println("How do you want to name your pdf? (Add .pdf at the end)");
		doc_name = myScanner.next();
		System.out.println("How many pages should your pdf have?");
		ammount_pages = myScanner.nextInt();
		for (int i=0; i<ammount_pages; i++) {
	          //Creating a blank page 
	          PDPage blankPage = new PDPage();

	          //Adding the blank page to the document
	          doc.addPage( blankPage );
	       } 
		doc.save("C:\\Users\\Lukas\\Documents\\" + doc_name);
	
		
		doc.close();
	}
}
