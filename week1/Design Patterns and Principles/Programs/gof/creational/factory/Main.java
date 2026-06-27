package gof.creational.factory;

public class Main {
	public static void main(String[] args) {
		System.out.println("=== Program Started ===");
		
		System.out.println("\nGenerating Word Document");
		DocumentFactory word = new WordFactory();
		word.processDocument();
		
		System.out.println("\nGenerating PDF Document");
		DocumentFactory pdf = new PdfFactory();
		pdf.processDocument();;
		
		System.out.println("\nGenerating Excel Document");
		DocumentFactory excel = new ExcelFactory();
		excel.processDocument();
	}
}
