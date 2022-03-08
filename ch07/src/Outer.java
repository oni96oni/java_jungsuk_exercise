class Outer {
	private int outerIv = 0;
	private static  int outerCv = 0;

	class InstanceInner {
		int iiv  = outerIv;  // �ܺ� Ŭ������ private����� ���ٰ����ϴ�.
		int iiv2 = outerCv;
	}

	static class StaticInner {
// ����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
//		int siv = outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0; //���� final�� �־���ϴµ� ���� ���� , ���� �ٲ��������ϱ� ��� ��޹޾Ƽ� ������ �߻����� ����
		final int LV = 0;  // JDK1.8���� final ���� ����

		class LocalInner {
			int liv  = outerIv;
			int liv2 = outerCv;
//	�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�.
			int liv3 = lv;	// ����!!!(JDK1.8���� ���� �ƴ�)
			int liv4 = LV;	// OK
			
			void method() {
				System.out.println(lv);
			}
		}
	}
}