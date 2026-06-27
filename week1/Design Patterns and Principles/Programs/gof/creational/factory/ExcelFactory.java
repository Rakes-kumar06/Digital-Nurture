package gof.creational.factory;

public class ExcelFactory extends DocumentFactory{
	@Override
	public Documents createDocument() {
		return new ExcelDocument();
	}
}
