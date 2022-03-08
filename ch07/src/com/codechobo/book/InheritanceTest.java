package com.codechobo.book;

class MyPoint extends Object {
	int x;
	int y;
}

// 상속을 이용
//class Circle extends MyPoint {
//	int r;
//}

// 포함을 이용
class Circle extends Object {
	MyPoint c = new MyPoint(); //참조변수의 초기화
	int r;
	
	Circle() {
		c = new MyPoint();
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString());
		System.out.println(c); //참조변수가 들어오면 toString을 호출함 (print의 기능이 그래)
		
	}

}
