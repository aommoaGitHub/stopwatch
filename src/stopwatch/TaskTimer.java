package stopwatch;

public class TaskTimer {
	
	Stopwatch timer = new Stopwatch();

	void measureAndPrint(Runnable r) {
		
		timer.start();
		r.run();
		timer.stop();
		System.out.println(r.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
