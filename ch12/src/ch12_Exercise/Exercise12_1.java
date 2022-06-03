package ch12_Exercise;

public class Exercise12_1 {
	public static void main(String[] args) {
//		올바르지 않은 문장을 고르시오 그리고 그 이유는?
		
//		Box<Object> b = new Box<String>();
//		Box<Object> b2 = (Object)new Box<String>();
//		new Box<String>().setItme(new Object());
//		new Box<String>().setItme("ABC");
		
	}
}

class Box<T> {
	T item;
	
	void setItme(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
}