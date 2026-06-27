package solid.s;

public class UserAuthenticator {
	private AuditLogger logger;
	
	public UserAuthenticator(AuditLogger logger) {
		this.logger = logger;
	}
	
	public boolean authenticate(String username, String password) {
		boolean isAuthorized = username.equals("admin") && password.equals("admin123");
		
		if(isAuthorized) {
			logger.log("Authentication success for user:"+username);
		}
		else {
			logger.log("Authentication failed for user:"+username);
		}
		return isAuthorized;
	}
}
