package exam909;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Exam {

	public static void merge(File source, File dest) throws IOException {

		// copy file in folder
		Files.copy(source.toPath(), dest.toPath());
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int totalMatches = 0;
		String word;
		try {
			for (int i = 1; i <= 100; i++) {
				Document document = new Document();

				FileOutputStream outputStream = new FileOutputStream(
						new File("C:\\Users\\Lenovo\\eclipse-workspace\\exam909\\Output\\TestFile" + i + ".pdf"));

				PdfWriter.getInstance(document, outputStream);

				document.open();
				if (i <= 30) {
					document.add(new Paragraph("AHMED")); // here can write inputs from user
					document.add(new Paragraph("NASSER"));
					document.add(new Paragraph("AHMED"));

				} else if (i <= 60) {
					document.add(new Paragraph("NASSER"));
					document.add(new Paragraph("AHMED"));
				} else {
					document.add(new Paragraph("KHALID"));
					document.add(new Paragraph("ALI"));

				}

				document.close();
			}

			System.out.println(" >>> 100 Pdf files created successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		File directoryPath = new File("C:\\Users\\Lenovo\\eclipse-workspace\\exam909\\Output");

		File filesList[] = directoryPath.listFiles();
		System.out.println("Enter word to be search in pdf files :");
		word = sc.next();

		for (File file : filesList) {

			System.out.println("--------------------------------");
			System.out.println("File name: " + file.getName());

			try {
				// Create PdfReader instance.
				PdfReader pdfReader = new PdfReader(file.getPath());

				// number of pages in pdf
				int pages = pdfReader.getNumberOfPages();

				// loop to go in the pdf pages.
				for (int i = 1; i <= pages; i++) {
					// Extract the page content
					String pageContent = PdfTextExtractor.getTextFromPage(pdfReader, i);
					Integer numberOfMatches = 0;

					System.out.println(" === Content of Page === ");
					System.out.println(pageContent);
					Stream<String> words = pageContent.lines();
					List<String> lines = words.toList();
					System.out.println("--------------------------------");

					// System.out.println(wordX.toArray()[0]);
					for (String eachWord : lines) {
						if (word.equals(eachWord)) {
							numberOfMatches++;
							totalMatches++;

						}

					}

					System.out.println(">> Number of Matches in this file :" + numberOfMatches);

					File source = new File("C:\\Users\\Lenovo\\eclipse-workspace\\exam909\\Output\\" + file.getName());
					File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\exam909\\matches" + numberOfMatches
							+ "\\" + file.getName());
					// call merge function to copy each files depend in number of matches
					merge(source, dest);

				}

				pdfReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		System.out.println("********************************");
		System.out.println(">> Total Matches " + totalMatches);
		sc.close();

	}
}
