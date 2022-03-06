import javax.naming.spi.DirStateFactory.Result;

class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		mm.printGugudan(9); //������ ����!
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5L, 3L) = " + result5);
		System.out.println("min(5L, 3L) = " + result6);
	}
 }

 class MyMath {
	 
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return; //�Է¹��� ��(dan)�� 2~9�� �ƴϸ�, �޼��� �����ϰ� ���ư���
		
		for(int i=1; i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan *i);
		}
		 return; //���� ������ ������ �����Ѻκ�!
	}
	long add(long a, long b) {
		long result = a + b;
		return  result;
	//	return a + b;	// ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;}
	// �� ���� �޾Ƽ� �� �߿� ū���� ��ȯ�ϴ� �޼��� �ۼ��غ���
	
	long max(long a, long b) { 
		long result =0;
		if(a>b) {
			result = a; //���ǽ��� ���϶�
		} else {
			result = b; //���ǽ��� �����϶�
		} return result;
	//  a > b ? a : b; �̷��Ե� �ۼ�����
	}
	long min(long a, long b) {
		 long result = 0;
		 if(a>b) {
			 result = b;
		 } else {
			 result = a;
		 } return result;
	}
 }
