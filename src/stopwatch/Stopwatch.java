package stopwatch;
/**
 * A Stopwatch that measures elapsed time between a starting time 
 * and stopping time, or until the present time.
 * @author Vittunyuta Maeprasart
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stoped, in nanoseconds. */
	private long stopTime;
	/** status of the stopwatch */
	private boolean running;
	
	/** Initialize startTime, stopTime and duration to be 0 */
	public Stopwatch() {
		this.startTime = 0;
		this.stopTime = 0;
		this.running = false;
	}
	/** reset the stopwatch and start if stopwatch is not running */
	void start() {
		if (!isRunning()) {
			this.stopTime = 0;
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}
	/** stop the stopwatch */
	void stop() {
		if (isRunning()) {
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}
	/** 
	 * return the elapsed time in seconds with decimal
	 * @return time since start until the current time if the stopwatch is running
	 * @return time between the start and stop times if the stopwatch is stopped
	 */
	double getElapsed() {
		if (isRunning())
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		else
			return (this.stopTime - this.startTime) * NANOSECONDS;

	}
	/**
	 * return the stopwatch status
	 * @return true if the stopwatch is running
	 * @return false if the stopwatch is stopped
	 */
	boolean isRunning() {
		return this.running;
	}

}
