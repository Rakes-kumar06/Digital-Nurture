package solid.i;

public class WorkerNode implements ContainerHost,OrchestratorNode{
	@Override
	public void deployDockerContainer() {
		System.out.println("Docker Container");	
	}
	
	@Override
	public void scaleKubernetesPod() {
		System.out.println("Scaling uo Kubernetes");	
	}
}
