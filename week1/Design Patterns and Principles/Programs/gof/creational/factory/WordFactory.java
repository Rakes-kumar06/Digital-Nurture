package gof.creational.factory;

public class WordFactory extends DocumentFactory{
	@Override
	public Documents createDocument() {
		return new WordDocument();
	}
}
