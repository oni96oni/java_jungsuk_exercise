package pkg1;

public class MyParent{ //���������ڰ� ����Ʈ���� 2�� ����̾ȵǴ���
	private int prv;     //����Ŭ����
	int dft;       		 //���� ��Ű��
	protected int prt;   //���� ��Ű��+�ڼ�(�ٸ���Ű����)
	public int pub;      //�������Ѿ���
	
	public void printMembers() {
		System.out.println(prv); //����Ŭ������������ ���������� ���
		System.out.println(dft); //���� ����
		System.out.println(prt);
		System.out.println(pub);
	}
}
class MyParentTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //���ٹ����� private ; ����Ŭ���������� ��밡�� 
		System.out.println(p.dft); //����Ʈ�� ���� ��Ű���� ��Ű
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
