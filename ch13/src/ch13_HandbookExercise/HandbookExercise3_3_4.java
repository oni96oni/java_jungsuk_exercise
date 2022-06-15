package ch13_HandbookExercise;

public class HandbookExercise3_3_4 implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				// 쓰레드가 수행할 코드를 작성
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {}
			} else {
				Thread.yield();
			}
		}
	}
	
	public void start() {
		th.start();
	}
	
	public void suspend() { 
		suspended = true;
		th.interrupt();
	}
	
	public void resume() { 
		suspended = false;
	}
	
	public void stop() { 
		stopped = true;
		th.interrupt();
	}
}
