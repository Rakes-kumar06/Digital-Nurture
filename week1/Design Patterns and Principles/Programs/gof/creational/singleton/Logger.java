package gof.creational.singleton;

public class Logger {
	private static Logger instance;
	static int num =5;
	private Logger() {
		System.out.println("Logger instance created");
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void logMessage(String message) {
		System.out.println("LOG: "+message);
	}
}
