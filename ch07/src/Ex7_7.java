class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		//����ȯ�Ҷ� �߿��Ѱ��� ���� �ν��Ͻ��� ���������� �߿�! �����Ҹ���? ������ ��ü(�ν��Ͻ�)�� �������� �߿���! �������ϰ� ����ȯ���ϸ� 
		//null������ �����Ҽ����־� �����ϸ� ������ �������� �� �׸��� ������ ��ü(�ν��Ͻ�)�� ��������� �߿�! �� ��������� �Ѿ�� ����ȯ�� ������
		//�����ϸ� ������ ���. ���󿡼� �ڼհ��� ������ �����ϴ°��� ������ü��! ( ���߿����� ����� )
		
		fe.water();
		car = fe;    // car = (Car)fe;���� ����ȯ�� ������ ��? �ٷ�� �ִ� ����� ������ �پ��� �������� ���°� �����ϴϱ�.
//		car.water(); CarŸ���� ���������� car�δ� water()�� ���Ұ� Car�� ���������� water()�޼���(���)�� ����!
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� �� ����Ÿ��. ����ȯ ���� �Ұ� ��? �����ϴϱ�! ����? �ٷ���ִ� ����� ������ �þ�°� ������
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}