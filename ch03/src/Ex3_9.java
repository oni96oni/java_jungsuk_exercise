class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1�鸸 
		int b = 2_000_000;    // 2,000,000   2�鸸 

		long c = (long)a * b;       // a * b = 2,000,000,000,000 ?
		//�����̶� (long)��������ȯ�� ���־���Ѵ�.

		System.out.println(c);
	}
}