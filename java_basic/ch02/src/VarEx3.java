public class VarEx3 {

	public static void main(String[] args) {
//		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15); //10����
		System.out.printf("%#x%n", 15); //16����
		System.out.printf("%#o%n", 15); //8����
		System.out.printf("%s", Integer.toBinaryString(15)); //2���� ��ȯ
		
		double f = 123.456789876543210; //float�� ���е��� 7�ڸ�, ������������ �ǹ̾���.
		System.out.printf("%f%n", f); 
		System.out.printf("%e%n", f); 
		System.out.printf("%g%n", f); 
	}
 
}
