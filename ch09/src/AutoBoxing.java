import java.util.ArrayList;

public class AutoBoxing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); //��ü�� ���尡���� Ŭ�����ε� �⺻�����尡��
		//�����Ϸ��� �ٲ��ִϱ� (����ڽ�,��ڽ�)
		list.add(100); // jdk1.5�������� ���� �ֳ� list���� ��ü�� �߰������ߴµ� ���� �����ϰԉ��� ��?
		//�����Ϸ��� �ڵ����� �ٲ��ִϱ� ������ �Ʒ�����̾��� ����ڽ̶����� ��ó�� ��밡��
		list.add(new Integer(100));
		
		Integer i = list.get(0); //list�� ����� ù��° ��ü�� ������.
		int k = list.get(0).intValue(); // intValue()�� Integer�� int�� ��ȯ
		int j = list.get(0); //intValue()�� Integer�� int�� ��ȯ
		
	}

}
