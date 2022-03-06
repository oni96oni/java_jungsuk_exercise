class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		//형변환할때 중요한것은 실제 인스턴스가 무엇인지가 중요! 무슨소리야? 생성된 객체(인스턴스)가 무엇인지 중요해! 생성안하고 형변환만하면 
		//null값으로 실행할수도있어 실행하면 에러가 그제서야 뜸 그리고 생성된 객체(인스턴스)의 멤버개수가 중요! 그 멤버개수를 넘어서면 형변환은 되지만
		//실행하면 에러가 뜬다. 조상에서 자손갈때 에러를 결정하는것은 실제객체다! ( 그중에서도 멤버들 )
		
		fe.water();
		car = fe;    // car = (Car)fe;에서 형변환이 생략됨 왜? 다룰수 있는 멤버의 개수가 줄어드는 방향으로 가는건 안전하니까.
//		car.water(); Car타입의 참조변수인 car로는 water()를 사용불가 Car의 리모컨에는 water()메서드(기능)이 없어!
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가 왜? 위험하니까! 뭐가? 다룰수있는 멤버의 개수가 늘어나는건 위험해
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