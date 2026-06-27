package solid.l;

public class ImmutableEvidenceLog implements ReadableLog{
	@Override
	public void readLog() {
		System.out.println("Analyzing immutable disk image ...");	
	}
}
