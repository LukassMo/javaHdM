package exercises13;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.*;

import java.io.IOException;

import java.io.IOException;

public class T1315_PDFdispMeta {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\testPdf_1.pdf");
		PDDocument doc = PDDocument.load(file);
		PDDocumentInformation info = doc.getDocumentInformation();

		System.out.println("Author=" + info.getAuthor());
		System.out.println("Subject=" + info.getSubject());
		System.out.println("Keywords=" + info.getKeywords());
		System.out.println("Creator=" + info.getCreator());
		System.out.println("Producer=" + info.getProducer());

		info.setAuthor("Lukas Molitor");

		doc.save("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\testPdf_1_NEW_AUTHOR.pdf");
	}
}
