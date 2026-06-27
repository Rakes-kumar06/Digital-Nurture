package solid.o;

public class CinderVolume implements CloudResource{
	@Override
	public void allocate() {
		System.out.println("Provisioning secure Cinder Block Storage");
	}
}
