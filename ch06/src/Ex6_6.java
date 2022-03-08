class Data { int x; }

class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");//여기서 콘솔값 둘째줄과 셋째줄 바뀐거같은 이유
		// change(d.x) 메서드에 x=1000;뿐만아니라 println도 있어서 저것까지 실행하고 마친다.
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {  // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}