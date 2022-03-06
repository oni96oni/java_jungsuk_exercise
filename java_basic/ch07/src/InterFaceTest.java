class A {
	public void method(I i) { // 인터페이스 I를 구현한 놈들만 들어와라.
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterFaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); //A가 B를 사용(의존한다 라고도 표현합니다)
	}

}
