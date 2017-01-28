package stopwatch;

public class AppendToString implements Runnable {
	
	private final char CHAR = 'a';
	private int count;
	private String result;
	
	
	
	public AppendToString(int count) {
		this.count = count;
		this.result = "";
	}
	
	@Override
	public void run() {
		int k = 0;
		while (k++ < this.count) {
			this.result = this.result + this.CHAR;
		}		
	}
	
	@Override
	public String toString() {
		
		return String.format("Append %,d chars to String\n", this.count) + 
				String.format("final string length = " + this.result.length());
		
		
	}

}
