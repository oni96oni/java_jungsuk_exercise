import javax.naming.spi.DirStateFactory.Result;

class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		mm.printGugudan(9); //구구단 실행!
		
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
			return; //입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기
		
		for(int i=1; i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan *i);
		}
		 return; //여기 리턴은 생략이 가능한부분!
	}
	long add(long a, long b) {
		long result = a + b;
		return  result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;}
	// 두 값을 받아서 둘 중에 큰값을 반환하는 메서드 작성해보기
	
	long max(long a, long b) { 
		long result =0;
		if(a>b) {
			result = a; //조건식이 참일때
		} else {
			result = b; //조건식이 거짓일때
		} return result;
	//  a > b ? a : b; 이렇게도 작성가능
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
