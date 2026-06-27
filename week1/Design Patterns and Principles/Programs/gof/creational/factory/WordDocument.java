package gof.creational.factory;

public class WordDocument implements Documents{
	@Override
	public void open() {
		System.out.println("Opening Word Document");
	}
	
	@Override
	public void save() {
		System.out.println("Saving Word Document");
	}
}
