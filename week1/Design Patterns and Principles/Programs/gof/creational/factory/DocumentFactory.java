package gof.creational.factory;

public abstract class DocumentFactory {
	public abstract Documents createDocument();
	
	public void processDocument() {
		Documents doc = createDocument();
		doc.open();
		doc.save();
	}
}


