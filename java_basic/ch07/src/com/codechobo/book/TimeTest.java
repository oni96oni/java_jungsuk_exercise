package com.codechobo.book;
class Time{
	private int hour; //0~23사이의 값을 가져야함!
	private int minute; //0~60사이의 값을 가져야함!
	private int second; //0~60사이의 값을 가져야함.
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}
	//매개변수로 넘겨진 hour가 유효한지 확인해서 아려주는 메서드. ctrl+shift+m
	private boolean isNotValidHour(int hour) {
	//여기서 public하기보다는 private로 하는게 좋다 왜? 이내부에서만 사용하는 메서드이기 때문에! 
	//변경할일이 생기면 변경사항 테스트 범위를 줄여서 유지보수에 용이하다.( 테스트할 범위가 줄어들기 때문에 )
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
		System.out.println(t.getHour()); //100들어오면 유효한값이 아니기때문에 튕겨버린다.
		//그래서 this hour = hour 까지 가지못해서 변경이 안됨 (11번째줄)
	}

}
