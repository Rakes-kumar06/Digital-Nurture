package solid.d;

public class LocalKubernetesCluster implements CloudInfrastructure{
	@Override
	public void deployApp(String appName) {
		System.out.println("Deploying "+ appName + " to local Minikube cluster...");
	}
}
