package com.codechobo.book;

class MyPoint extends Object {
	int x;
	int y;
}

// ����� �̿�
//class Circle extends MyPoint {
//	int r;
//}

// ������ �̿�
class Circle extends Object {
	MyPoint c = new MyPoint(); //���������� �ʱ�ȭ
	int r;
	
	Circle() {
		c = new MyPoint();
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString());
		System.out.println(c); //���������� ������ toString�� ȣ���� (print�� ����� �׷�)
		
	}

}
