package stopwatch;
/**
 * add numbers to Double and sum them
 * @author Vittunyuta Maeprasart
 *
 */
public class SumDouble implements Runnable{
	
	private final int ARRAY_SIZE = 500000;
	private int counter;
	private Double[] values;
	private Double sum;
	
	/**
	 * initialize amount of numbers, array of Double (1,2,3,4,...), 
	 * and sum variable for summing all number in array of Double
	 * @param count is amount of numbers
	 */
	public SumDouble(int counter) {
		this.counter = counter;
		this.values = new Double[ARRAY_SIZE];
		for (int i = 0; i < this.ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		this.sum = new Double(0.0);;
	}
	
	/**
	 * sum all numbers in array of Double
	 */
	@Override
	public void run() {
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < this.counter; count++, i++) {
			if (i >= this.values.length)
				i = 0;
			this.sum = this.sum + this.values[i];
		}
	}
	
	/**
	 * return text for description the Task 
	 * @return what is the task and sum value
	 */
	@Override
	public String toString() {
		
		return  String.format("Sum array of Double objects with count=%,d\n", this.counter) +
				String.format("sum = " +  this.sum);
		
		
	}

}
