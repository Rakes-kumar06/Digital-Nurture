package solid.i;
// Interface Segregation Principle
public class Main {
	
	private static void executeBackup(DatabaseManager dbManager) {
		System.out.println("Trove database Backup");
		dbManager.backupTroveDatabase();
	}
	
	private static void rolloutNewApplcation(ContainerHost host) {
		System.out.println("Starting schedule tasks");
		host.deployDockerContainer();
	}
	
	public static void main(String[] args) {
		DatabaseNode dbNode = new DatabaseNode();
		WorkerNode workerNode = new WorkerNode();
		
		System.out.println("System Maintenance");
		executeBackup(dbNode);
		
		rolloutNewApplcation(workerNode);
	}
}
