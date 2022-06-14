package ch13_Exercise;

public class Exercise13_3 {

	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.run(); // 메서드를 호출 <-> start()를 호출해야 쓰레드를 실행시킨것이 된다
//		t1.start();
		for(int i=0; i<10; i++)
			System.out.print(i);
	}

}

class Thread2 extends Thread {
	public void run() {
		for(int i=0; i<10; i++)
			System.out.print(i);
	}
}