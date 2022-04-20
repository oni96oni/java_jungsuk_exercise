class Ex8_2 {
	public static void main(String args[]) {
			System.out.println(1);
			try {
				System.out.println(0/0);
				System.out.println(2); 	// 예외 발생시 try문 안에 예외가 발생한 이후의 문장들은 실행되지 않는다.
			} catch (ArithmeticException ae)	{
				System.out.println(3);
			}	// try-catch의 끝
			System.out.println(4);
	}	// main메서드의 끝
}
