
public class PrintfEx1 {

	public static void main(String[] args) {
		System.out.printf("[%5d]%n",10); // 5�ڸ� �տ��� ����.
		System.out.printf("[%-5d]%n",10); //5�ڸ� �ڿ��� ����.
		System.out.printf("[%05d]%n",10); //�տ� ������ 0���� ä���.
		System.out.printf("[%05d]%n",1234567); //5�ڸ����� �����κ��� �� �����ش�.
		
		double d = 1.23456789;
		System.out.printf("%14.6f%n",d); // ��14�ڸ� �ڿ� �Ҽ��� 6�ڸ����� �տ� ��ĭ�� ����
		System.out.printf("%s%n","www.maru.com");
		System.out.printf("%20s%n","www.maru.com");
		System.out.printf("%20s%n","www.maru.com");
		System.out.printf("%20s%n","www.maru.com");
		
	}

}
