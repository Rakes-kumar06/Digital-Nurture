package solid.l;

//Liksov Substitution Principle
public class Driver {
		private static void appendTimestamp(WritableLog log) {
			log.writeLog("[TIMESTAMP ADDED]");
		}
		
		private static void analyzeData(ReadableLog log) {
			log.readLog();
		}
		
		public static void main(String[] args) {
			ActiveFirewallLog fwLog = new ActiveFirewallLog();
			ImmutableEvidenceLog evidence = new ImmutableEvidenceLog();
			
			System.out.println("Analysis Phase");
			
			analyzeData(fwLog);
			analyzeData(evidence);
		
			System.out.println("Modification Phase");
			
			appendTimestamp(fwLog);
			// appendTimestamp(evidence);
		}
}
