package pkg2;

import pkg1.MyParent;

class MyParent2 extends MyParent {
	public void printMembers() {
//		System.out.println(prv);
//		System.out.println(dft); ������Ʈ�� �ڼձ���Ŀ������
		System.out.println(prt);
		System.out.println(pub);
	}
}
public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //���ٹ����� private ; ����Ŭ���������� ��밡�� 
//		System.out.println(p.dft);
//		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
