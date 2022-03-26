class Data_1 {
	int value;
	// Data_1(){} 클래스에 생성자가 없으므로 컴파일러가 기본생성자를 자동적으로 추가하여 컴파일
}

class Data_2 {
	int value;
	
//	Data_2(){} 이렇게 따로 추가해주어야 19번째줄 에러 소멸 
	
	Data_2(int x) {   
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생! -> 매개변수가 없는 생성자가 없어서
	}
}