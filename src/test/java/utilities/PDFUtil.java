package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFUtil {
	
	public static String getText(String fileName , int startpage , int endpage) {
		
		String text ="";
		
	
		//Read PDF file
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+fileName);
		
		
		//Load PDF document
		PDDocument document = PDDocument.load(fis);
		
		//Extract text from PDF document
		PDFTextStripper pdf = new PDFTextStripper();
		
		//set the start and end page numbers
		pdf.setStartPage(startpage);
		pdf.setEndPage(endpage);
		
		//Get the text from the document
		text = pdf.getText(document);
		
	
	  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
		
	}		
		
	}
