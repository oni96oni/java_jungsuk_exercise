class AAA { ///AAA는 BBB의 외부클래스
	int i=100;
	BBB b = new BBB();
	
	class BBB { ///BBB는 AAA의 내부클래스
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); //객체 생성없이 외부 클래스의 멤버 사용가능
		}
		
	}
}


//class CCC {
//	BBB b = new BBB();
//}


public class InnerTest {

	public static void main(String[] args) {
//		이제 BBB클래스 사용하기위해서는 AAA클래스 생성한 뒤에 BBB클래스를 생성해주어야한다
//		BBB b = new BBB();
//		b.method();
	}

}
