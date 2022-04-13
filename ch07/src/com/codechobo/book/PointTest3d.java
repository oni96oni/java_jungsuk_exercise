package com.codechobo.book;

public class PointTest3d {

	public static void main(String[] args) {
		Point3d p3 = new Point3d();
		System.out.println(p3.x + p3.y + p3.z);
	}
}

class Point {
	int x = 10;
	int y = 20;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3d extends Point {
	int z = 30;
	Point3d() {
		this(100,200,300);
	}
	
	Point3d(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
}