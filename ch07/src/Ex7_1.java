class Tv { //부모클래스
	boolean power; // 전원상태(on/off)
	int channel;	// 채널

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}
class SmartTv extends Tv {  // Tv클래스를 상속받은 SmartTV클래스
	boolean caption;     // 캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {   // 캡션상태가 on(true)일때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

class Ex7_1 {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;			// 조상클래스로부터 상속받음
		stv.channelUp();			// 조상클래스로부터 상속받음
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;	// 캡션(자막)기능을 킨다       
		stv.displayCaption("Hello, Java World");
	}
}