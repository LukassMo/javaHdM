package exercises13;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

public class T1314_PDFseparate {
	public static void main(String[] args) throws IOException {
		File myPdf = new File("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\testPdf_1.pdf");
		PDDocument doc = PDDocument.load(myPdf);

		int pages = doc.getNumberOfPages();
		String file = ("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\testPdf_1.pdf");
		String filename = file.substring(0, file.lastIndexOf("\\") + 10); // A single backslsash cant be put in String
																			// form, // we need to use "\\" to represent
																			// one
		// System.out.println(filename); for testing if filename string is correct.
		for (int i = 0; i < pages; i++) {
			PDPage p = doc.getPage(i);
			PDDocument document = new PDDocument();
			document.addPage(p);
			document.save(filename + "_" + (i + 1) + ".pdf");
		}

	}

}
