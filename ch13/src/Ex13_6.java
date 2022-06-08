class Ex13_6 {
	public static void main(String args[]) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();

		th2.setPriority(7);

		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		
		System.out.println(th1.getThreadGroup());
		System.out.println(th2.getThreadGroup());
		System.out.println("th1.activeCount() = " + th1.activeCount());
		System.out.println("th1.isDaemon() = " + th1.isDaemon());
		th1.checkAccess(); // 에러가 발생하지 않으면! -> 현재 실행중인 쓰레드가 쓰레드 그룹을 변경할 권한이 있는것! 없다면 에러발생!
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		
		th1.start();
		th2.start();
	}
}

class ThreadEx6_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for(int x=0; x < 10000000; x++);
		}
	}
}

class ThreadEx6_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 10000000; x++);
		}
	}
}