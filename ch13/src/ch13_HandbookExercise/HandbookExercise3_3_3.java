package ch13_HandbookExercise;

public class HandbookExercise3_3_3 {
	boolean suspended = false;
	boolean stopped = false;
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				// 쓰레드가 수행할 코드를 작성
			}
		}
	}
	
	public void suspend() { suspended = true; }
	public void resume() { suspended = false; }
	public void stop() { stopped = true; }
	//이런 식으로 suspend(), resume(), stop()은 deprecated되었으므로, 직접구현해야한다.
}
