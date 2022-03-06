class Ex8_4 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //예외발생(ArithmeticException)
			System.out.println(4); 	// 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException");
		} catch (Exception e){ // ArithmeticException을 제외한 모든 예외가 처리된다.
			System.out.println("Exception");
		}	// try-catch의 끝
		System.out.println(6);
	}	// main메서드의 끝
}
