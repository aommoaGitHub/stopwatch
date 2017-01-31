package stopwatch;
/**
 * Appending chars to StringBuilder
 * @author Vittunyuta Maeprasart
 *
 */
public class AppendToStringBuilder implements Runnable{
	
	private final char CHAR = 'a';
	private int count;
	private StringBuilder builder;
	
	/**
	 * initialize amount of chars and result StringBuilder
	 * @param count is amount of chars
	 */
	public AppendToStringBuilder(int count) {
		this.count = count;
		this.builder = new StringBuilder();
	}
	
	/**
	 * add char 'a' to the result StringBuilder for count times.
	 */
	@Override
	public void run() {
		int k = 0;
		while (k++ < count) {
			this.builder.append(this.CHAR);
		}	
	}
	
	/**
	 * return text for description the Task 
	 * @return what is the task and length of the result String
	 */
	@Override
	public String toString() {
		
		return String.format("Append %,d chars to StringBuilder\n", this.count) + 
				String.format("final string length = " + this.builder.length());
		
		
	}

}
