class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); //double형인데 리터럴L을사용(즉, long타입 사용)했다. 틀의 범위가 더 크니까 작은 타입도 받아줄 수 있는것! 
		long result5 = mm.max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		mm.printGugudan(9); //mm클래스의 printGugudan()메서드 호출
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5L, 3L) = " + result5);
		System.out.println("min(5L, 3L) = " + result6);
	}
 }

 class MyMath {
	 
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return; //매개변수 dan이 2~9가 아닌값이 들어오면 끝내고 호출한 메서드로 돌아간다.
		
		for(int i=1; i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan *i);
		}
		 return; //입력값은 있고 출력값은 없는경우
	}
	long add(long a, long b) {
		long result = a + b;
		return  result;
	//	return a + b;	// 위의 두줄을 이렇게 한줄로 요약할수있다.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;}
	
	long max(long a, long b) { 
		long result =0;
		if(a>b) {
			result = a; // 크면 a
		} else {
			result = b; // 작거나 같으면 b
		} return result;
	//  a > b ? a : b; 위의 if문을 삼항조건연산자로 표현하면 이렇다.
	}
	long min(long a, long b) {
		 long result = 0;
		 if(a>b) {
			 result = b;
		 } else {
			 result = a;
		 } return result;
	}
 }
