package ch13_Exercise;

public class Exercise13_5 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		th1.start();
		
		try {
			Thread.sleep(6 * 1000);
		} catch (Exception e) {}
		
		stopped = true;
		System.out.println("stopped");
	}
}

class Thread5 extends Thread {
	public void run() {
		for(int i=0; !Exercise13_5.stopped; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3 * 1000);
			} catch (Exception e) {}
		}
	}
}