class AAA { ///AAA�� BBB�� �ܺ�Ŭ����
	int i=100;
	BBB b = new BBB();
	
	class BBB { ///BBB�� AAA�� ����Ŭ����
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); //��ü �������� �ܺ� Ŭ������ ��� ��밡��
		}
		
	}
}


//class CCC {
//	BBB b = new BBB();
//}


public class InnerTest {

	public static void main(String[] args) {
//		���� BBBŬ���� ����ϱ����ؼ��� AAAŬ���� ������ �ڿ� BBBŬ������ �������־���Ѵ�
//		BBB b = new BBB();
//		b.method();
	}

}
