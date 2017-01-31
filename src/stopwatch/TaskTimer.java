package stopwatch;

/**
 * TaskTimer is used to measure elapsed time in seconds.
 * @author Vittunyuta Maeprasart
 *
 */
public class TaskTimer {
	
	private Stopwatch timer;

	/**
	 * Initialize timer
	 */
	public TaskTimer() {
		this.timer = new Stopwatch();
	}
	
	/**
	 * measure the elapsed time in seconds, then
	 * print out description and the elapsed time of the task to the console
	 * @param r is to task for running
	 */
	void measureAndPrint(Runnable r) {
		
		timer.start();
		r.run();
		timer.stop();
		System.out.println(r.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
