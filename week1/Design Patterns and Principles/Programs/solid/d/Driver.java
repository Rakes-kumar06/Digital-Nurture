package solid.d;
// Dependency Inversion Principle
public class Driver {
	public static void main(String[] args) {
		System.out.println("=== Development Phase ===");
		CloudInfrastructure devCluster = new LocalKubernetesCluster();
		
		ApplicationOrchestrator devOrchestrator = new ApplicationOrchestrator(devCluster);
		devOrchestrator.rollout("Backend-API-v1");
		
		System.out.println("=== Production Phase ===");
		CloudInfrastructure prodCloud = new OpenStackEnvironment();
		
		ApplicationOrchestrator prodOrchestrator = new ApplicationOrchestrator(prodCloud);
		prodOrchestrator.rollout("Backend-API-v1");
	}
}
