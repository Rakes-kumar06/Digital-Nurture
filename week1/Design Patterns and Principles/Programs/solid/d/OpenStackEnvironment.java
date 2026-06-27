package solid.d;

public class OpenStackEnvironment implements CloudInfrastructure{
	@Override
	public void deployApp(String appName) {
		System.out.println("Deploying "+appName+" to OpenStack tenant via Heat templates...");
	}
}
