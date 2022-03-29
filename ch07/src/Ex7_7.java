class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;    // car = (Car)fe; 에서 형변환이 생략됨 안전하니까! 사용할수있는 멤버의 개수가 줄어드는 방향이니까
//		car.water(); car타입 리모컨(참조변수)에는 water()라는 버튼이 존재하지 않아서 실행불가
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입 형변환 생략 불가 
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}