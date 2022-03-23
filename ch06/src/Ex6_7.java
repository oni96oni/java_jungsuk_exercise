class Data2 { int x; }

class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d); // 주소값을 집어넣음
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	//참조형 매개변수
	static void change(Data2 d) { 
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}