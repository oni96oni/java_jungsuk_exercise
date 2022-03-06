package pkg2;

import pkg1.MyParent;

class MyParent2 extends MyParent {
	public void printMembers() {
//		System.out.println(prv);
//		System.out.println(dft); 프로텍트는 자손까지커버가능
		System.out.println(prt);
		System.out.println(pub);
	}
}
public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //접근범위가 private ; 같은클래스에서만 사용가능 
//		System.out.println(p.dft);
//		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
