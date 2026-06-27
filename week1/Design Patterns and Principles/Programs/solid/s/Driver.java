package solid.s;

// Single Responsibilty
public class Driver {
	public static void main(String[] args) {
		AuditLogger myLogger = new AuditLogger();
		UserAuthenticator authenticator = new UserAuthenticator(myLogger);
		
		System.out.println("Test Credentials");
		boolean isGranted = authenticator.authenticate("admin", "admin123");
		System.out.println("Access Granted:"+ isGranted);
		
		System.out.println();
		
		boolean isDenied = authenticator.authenticate("guest", "admin123");
		System.out.println("Access Granted:"+ isDenied);
		
		System.out.println();
	}
	
}
