package solid.o;

public class TroveDatabase implements CloudResource{
	@Override
	public void allocate() {
		System.out.println("Provisioning Database-as-a-Service via Trove");
	}
}
