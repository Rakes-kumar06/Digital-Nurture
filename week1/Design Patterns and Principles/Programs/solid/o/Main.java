package solid.o;

// Open/Closed Principle
public class Main {
	public static void main(String[] args) {
		CloudResourceAllocator allocator = new CloudResourceAllocator();
		
		CloudResource myVolume = new CinderVolume();
		CloudResource myDatabase = new TroveDatabase();
		
		System.out.println();
		System.out.println("Booting Cloud Environment");
		
		allocator.allocateResource(myDatabase);
		allocator.allocateResource(myVolume);
		
		System.out.println();
		System.out.println("Environment Provisioned");
	}
}
