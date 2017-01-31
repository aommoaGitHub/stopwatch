package stopwatch;
/**
 * Appending chars to String
 * @author Vittunyuta Maeprasart
 *
 */
public class AppendToString implements Runnable {
	
	private final char CHAR = 'a';
	private int count;
	private String result;
	
	/**
	 * initialize amount of chars and result String 
	 * @param count is amount of chars
	 */
	public AppendToString(int count) {
		this.count = count;
		this.result = "";
	}
	
	/**
	 * add char 'a' to the result String for count times.
	 */
	@Override
	public void run() {
		int k = 0;
		while (k++ < this.count) {
			this.result = this.result + this.CHAR;
		}		
	}
	
	/**
	 * return text for description the Task 
	 * @return what is the task and length of the result String
	 */
	@Override
	public String toString() {
		
		return String.format("Append %,d chars to String\n", this.count) + 
				String.format("final string length = " + this.result.length());
		
		
	}

}
