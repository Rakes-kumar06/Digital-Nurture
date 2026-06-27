package gof.creational.factory;

public class ExcelDocument implements Documents{
	@Override
	public void open() {
		System.out.println("Opening Spreadsheet");
	}
	
	@Override
	public void save() {
		System.out.println("Saving Spreadsheet");
	}
}
