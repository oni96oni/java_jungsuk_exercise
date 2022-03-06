package pkg1;

public class MyParent{ //접근제어자가 디폴트여서 2로 상속이안되던것
	private int prv;     //같은클래스
	int dft;       		 //같은 패키지
	protected int prt;   //같은 패키지+자손(다른패키지의)
	public int pub;      //접근제한없음
	
	public void printMembers() {
		System.out.println(prv); //같은클래스내에서는 접근제어자 모두
		System.out.println(dft); //접근 가능
		System.out.println(prt);
		System.out.println(pub);
	}
}
class MyParentTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //접근범위가 private ; 같은클래스에서만 사용가능 
		System.out.println(p.dft); //디폴트는 같은 패키지면 오키
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
