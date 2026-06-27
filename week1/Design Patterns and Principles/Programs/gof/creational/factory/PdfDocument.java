package gof.creational.factory;

public class PdfDocument implements Documents{
	@Override
	public void open() {
		System.out.println("Opening PDF Document");
	}
	
	@Override
	public void save() {
		System.out.println("Saving PDF Document");
	}
}
