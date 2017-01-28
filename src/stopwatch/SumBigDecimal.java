package stopwatch;

import java.math.BigDecimal;

public class SumBigDecimal implements Runnable{
	
	private final int ARRAY_SIZE = 500000;
	private int counter;
	private BigDecimal[] values;
	private BigDecimal sum;
	
	
	
	public SumBigDecimal(int counter) {
		this.counter = counter;
		this.values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		this.sum = new BigDecimal(0.0);;
	}
	
	@Override
	public void run() {
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < this.counter; count++, i++) {
			if (i >= this.values.length)
				i = 0;
			this.sum = this.sum.add(this.values[i]);
		}
	}
	
	@Override
	public String toString() {
		
		return  String.format("Sum array of BigDecimal with count=%,d\n", this.counter) +
				String.format("sum = " +  this.sum);
		
		
	}
}
