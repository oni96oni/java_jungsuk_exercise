class Data_1 {
	int value;
	// Data_1(){} ���� �̷��� �⺻�����ڸ� �߰����־���� �׷��� ����� �����ڰ� �ϳ��� ���⶧���� 
	// �����Ϸ��� �ڵ����� �߰����ִ°�! 
}

class Data_2 {
	int value;
	
	//Data_2(){} //�⺻ ������ ȣ��
	Data_2(int x) {   // �Ű������� �ִ� ������.
		value = x;
	}
	//Data_2(){}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error�߻�
	}
}