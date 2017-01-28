package stopwatch;

public class AppendToStringBuilder implements Runnable{
	
	private final char CHAR = 'a';
	private int count;
	private StringBuilder builder;
	
	
	
	public AppendToStringBuilder(int count) {
		this.count = count;
		this.builder = new StringBuilder();
	}
	
	@Override
	public void run() {
		int k = 0;
		while (k++ < count) {
			this.builder.append(this.CHAR);
		}	
	}
	
	@Override
	public String toString() {
		
		return String.format("Append %,d chars to StringBuilder\n", this.count) + 
				String.format("final string length = " + this.builder.length());
		
		
	}

}
