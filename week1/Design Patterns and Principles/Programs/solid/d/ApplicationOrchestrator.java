package solid.d;

public class ApplicationOrchestrator {
	private CloudInfrastructure infrastructure;
	
	public ApplicationOrchestrator(CloudInfrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}
	
	public void rollout(String appName) {
		infrastructure.deployApp(appName);
	}
}
