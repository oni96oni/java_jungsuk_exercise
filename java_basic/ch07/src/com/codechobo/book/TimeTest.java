package com.codechobo.book;
class Time{
	private int hour; //0~23������ ���� ��������!
	private int minute; //0~60������ ���� ��������!
	private int second; //0~60������ ���� ��������.
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}
	//�Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �Ʒ��ִ� �޼���. ctrl+shift+m
	private boolean isNotValidHour(int hour) {
	//���⼭ public�ϱ⺸�ٴ� private�� �ϴ°� ���� ��? �̳��ο����� ����ϴ� �޼����̱� ������! 
	//���������� ����� ������� �׽�Ʈ ������ �ٿ��� ���������� �����ϴ�.( �׽�Ʈ�� ������ �پ��� ������ )
		return hour < 0 || hour > 23;
	}
	public int getHour() { return hour; };
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 22;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour()); //100������ ��ȿ�Ѱ��� �ƴϱ⶧���� ƨ�ܹ�����.
		//�׷��� this hour = hour ���� �������ؼ� ������ �ȵ� (11��°��)
	}

}
