class Ex6_1 { 
	public static void main(String args[]) { 
		Tv t;                 // Tv인스턴스를 참조하기 위한 참조변수 t 선언    
		t = new Tv();         // Tv인스턴스를 생성하고 참조변수 t에 참조값 저장 
		t.channel = 7;        // Tv인스턴스의 멤버변수 channel에 7을 저장 
		t.channelDown();      // Tv인스턴스의 메서드 channelDown()을 호출
		System.out.println("현재 채널은 " + t.channel + " 입니다."); 
	} 
}

class Tv { 
	// Tv의 속성(멤버변수)
	String color;           // 색상
	boolean power;         	// 전원
	int channel;           	// 채널

	// Tv의 기능(메서드)
	void power()   { power = !power; }  // TV의 전원을 on/off하는 기능을 가진 메서드
	void channelUp()   {  ++channel; }  // TV의 채널을 up하는 기능을 가진 메서드
	void channelDown() { --channel; }   // TV의 채널을 down하는 기능을 가진 메서드
}