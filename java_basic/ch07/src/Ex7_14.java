class Outer22{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ������ �� ����.
//		int siv = outerIv;
		static int scv = outerCv; //jdk1.8���� final ��������
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner {
			int liv =outerIv;
			int liv2 = outerCv;
//			�ܺ�Ŭ������ ���������� final�� ���� ����(���)�� �����ϴ�.
//			int liv3 = lv;
			int liv4 = LV;
		}
	}
}
public class Ex7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
