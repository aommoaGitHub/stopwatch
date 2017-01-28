package stopwatch;

public class SumDoublePrimitive implements Runnable{
	
	private final int ARRAY_SIZE = 500000;
	private int counter;
	private double[] values;
	private double sum;
	
	
	
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
		this.values = new double[ARRAY_SIZE];
		for (int k = 0; k < this.ARRAY_SIZE; k++)
			this.values[k] = k + 1;
		this.sum = 0.0;
	}
	
	@Override
	public void run() {
		
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < this.counter; count++, i++) {
			if (i >= this.values.length)
				i = 0; // reuse the array when get to last value
			this.sum = this.sum + this.values[i];
		}
	}
	
	@Override
	public String toString() {
		
		return  String.format("Sum array of double primitives with count=%,d\n", this.counter) +
				String.format("sum = " +  this.sum);
		
		
	}

}
