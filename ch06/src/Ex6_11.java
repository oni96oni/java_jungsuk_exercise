class Data_1 {
	int value;
	// Data_1(){} 원래 이렇게 기본생성자를 추가해주어야해 그런데 여기는 생성자가 하나도 없기때문에 
	// 컴파일러가 자동으로 추가해주는것! 
}

class Data_2 {
	int value;
	
	//Data_2(){} //기본 생성자 호출
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
	//Data_2(){}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생
	}
}