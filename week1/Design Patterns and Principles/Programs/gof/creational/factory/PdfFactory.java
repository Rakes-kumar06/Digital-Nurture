package gof.creational.factory;

public class PdfFactory extends DocumentFactory{
	@Override
	public Documents createDocument() {
		return new PdfDocument();
	}
}
