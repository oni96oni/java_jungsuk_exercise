class Data { int x; }

class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x); // 값을 집어넣음
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	// 기본형 매개변수
	static void change(int x) {  
		x = 1000; //change메서드의 매개변수 x의 값이 변경
		System.out.println("change() : x = " + x);
	}
}