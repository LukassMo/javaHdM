package exercises13;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class T1313_PDFerase {
	public static void main(String[] args) throws IOException {
		int[] pages = { 10, 12, 30, 41 };
		deletePdfPages("gg.pdf", "gg_mod.pdf", pages);
	}

	private static void deletePdfPages(String sourcePdf, String targetPdf, int[] pagesToDelete) throws IOException {
		File file = new File("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\" + sourcePdf); // source pdf
																											// has to be
																											// in the
																											// correct
																											// directory.
		PDDocument doc = PDDocument.load(file);
		for (int x = 0; x < pagesToDelete.length; x++) {
			doc.removePage(pagesToDelete[x] - x - 1); // The index value minus the index. For every deleted page it has to
													// adjust accordingly.
													//+1 to adjust for the index
			System.out.println("Page " + pagesToDelete[x] + " has been deleted!");

		}
		doc.save("C:\\Users\\Lukas\\git\\javaHdM\\homework\\src\\exercises13\\" + targetPdf);
		doc.close();
	}
}
