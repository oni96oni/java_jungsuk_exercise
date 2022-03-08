package com.codechobo.book;

class Point extends Object{
	int x;
	int y;
	
	//Object클래스의 toString()을 오버라이딩! 
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		//p.x =3;
		//p.y =5;
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("p.x="+p.x);
		System.out.println("p.y="+p.y);
		
	}

}
