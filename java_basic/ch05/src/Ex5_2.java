class Ex5_2 {
	public static void main(String[] args) {
		int   sum = 0;      // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����

		int[] score = {100, 88, 100, 100, 90}; //�迭�� ������ �ʱ�ȭ�� ���ÿ�!

//		sum += score[0];
//		sum += score[1];
//		sum += score[2];
//		sum += score[3];
//		sum += score[4];
// 		�̷��� ������ �Ʒ�ó�� ���!
		
		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}
		
		average = sum / (float)score.length ; // ������� float�� ��� ���ؼ� ����ȯ

		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}
}