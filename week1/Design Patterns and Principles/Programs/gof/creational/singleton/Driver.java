package gof.creational.singleton;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Fetching Logger 1");
		Logger log1 = Logger.getInstance();
		log1.logMessage("[INFO] First Log, System initiated");
		System.out.println();
		
		System.out.println("Fetching Logger 2");
		Logger log2 = Logger.getInstance();
		log2.logMessage("[ERROR] Got Some error");
		System.out.println();
		
		System.out.println("Fetching Logger 3");
		Logger log3 = Logger.getInstance();
		log3.logMessage("[STOP] System terminated");
		
		
	}
}
