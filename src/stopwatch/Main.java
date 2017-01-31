package stopwatch;
/**
 * Task Main file for running and compare speed(time in seconds) of each task
 * after manage the duplicate code from SpeedTest file
 * @author Vittunyuta Maeprasart
 *
 */
public class Main {
	/**
	 * run the tasks
	 */
	public static void main(String[] args) {
		TaskTimer taskTimer = new TaskTimer();
		
		taskTimer.measureAndPrint(new AppendToString(50000)); //task1
		taskTimer.measureAndPrint(new AppendToString(100000)); //task2
		taskTimer.measureAndPrint(new AppendToStringBuilder(100000)); //task3
		
		int counter = 1000000000;
		taskTimer.measureAndPrint(new SumDoublePrimitive(counter)); //task4
		taskTimer.measureAndPrint(new SumDouble(counter)); //task5
		taskTimer.measureAndPrint(new SumBigDecimal(counter)); //task6
		
	}

}
