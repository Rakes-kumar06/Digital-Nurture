package solid.l;

public class ActiveFirewallLog implements WritableLog,ReadableLog{
	@Override
	public void readLog() {
		System.out.println("Reading active firewall events");
	}
	
	@Override
	public void writeLog(String entry) {
		System.out.println("Appending event: "+entry);
	}
}
