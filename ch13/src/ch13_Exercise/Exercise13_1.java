package ch13_Exercise;

public class Exercise13_1 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		th1.start();
	}

}

class Thread1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print('-');
		}
	}
}

//Runnable인터페이스를 구현하도록 변경해보자.

class Thread22 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print('-');
		}
	}
}