package exercises13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.*;

import java.io.IOException;

public class T1312_PDFload {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\testPdf_1-2.pdf"); 
		PDDocument doc = PDDocument.load(file);
		PDDocumentInformation info = doc.getDocumentInformation();
		System.out.println( "Page Count=" + doc.getNumberOfPages() );
		System.out.println( "Title=" + info.getTitle() );
		System.out.println( "Author=" + info.getAuthor() );
		System.out.println( "Subject=" + info.getSubject() );
		System.out.println( "Keywords=" + info.getKeywords() );
		System.out.println( "Creator=" + info.getCreator() );
		System.out.println( "Producer=" + info.getProducer() );
		System.out.println( "Creation Date=" + info.getCreationDate() );
		System.out.println( "Modification Date=" + info.getModificationDate());
		System.out.println( "Trapped=" + info.getTrapped() );
		
		doc.removePage(0);
		doc.save("C:\\Users\\Lukas\\Documents\\modified_tester_pdf.pdf");
		doc.close();
	}
}
