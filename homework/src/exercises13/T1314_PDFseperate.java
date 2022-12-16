package exercises13;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

public class T1314_PDFseperate {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\testPdf_1-2.pdf"); 
		String filepath = "C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\testPdf_1-2.pdf";
		PDDocument doc = PDDocument.load(file);

		PDDocumentInformation info = doc.getDocumentInformation();

		int num_of_pages = doc.getNumberOfPages();
		System.out.println(num_of_pages);
		for (int x = 0; x < num_of_pages; x++) {
			PDDocument singlePage = new PDDocument();
			
			}
			
			doc.save( filepath.lastIndexOf(".") + ".pdf");
			doc.close();
		}

}

