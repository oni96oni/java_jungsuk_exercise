class Ex13_1 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	  // 생성자 Thread(Runnable target)
		ThreadEx1_2 t3 = new ThreadEx1_2(); // t3참조변수로는 start()를 실행할 수 없다!
		Thread t4 = new Thread(); //t4는 start() 사용가능하다 당연히! 이건 우리가 구현한게 아니라 구현 되어있던 것이니까!
		
		t1.start();
		t2.start();
		t4.start();
		
	}
}

class ThreadEx1_1 extends Thread { // Thread클래스를 상속받아서 쓰레드를 구현!
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable { // Runnable인터페이스를 구현해서 쓰레드를 구현!
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(Thread.currentThread()); // - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}