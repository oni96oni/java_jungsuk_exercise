class Ex8_3 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);  // 실행되지않는다.
		} catch (Exception e){     // ArithmeticException대신 Exception을 사용(모든 예외클래스의 조상이므로 어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해서 처리된다)
			System.out.println(5);
		}	// try-catch의끝

		System.out.println(6);
	}	// main의끝
}