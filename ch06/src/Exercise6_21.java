public class Exercise6_21 {
	
	static int abs(int value) {
		
	}
	
	public static void main(String[] args) {
		int value = 0;
		System.out.println(value + "�� ���밪:" +abs(value));
		value = -10;
		System.out.println(value + "�� ���밪:" +abs(value));
	}

	

}

//�����ߴ���
//public static int abs(int value) {
//	value = Math.abs(value);
//	return value;
//}

//if���� ����� �ڵ�
//public static int abs(int value) {
//	if(value>=0) {
//		return value;
//	} else {
//		return -value;
//	}
//}