class Ex4_8 {
	public static void main(String args[]) {
		int i=1; // 변수의 scope (범위) 좁을수록 좋은것이다. -선언 위치부터 선언된 블럭의 끝까지
		// 변수의 범위가 넓을 수록 확인해야하는 범위가 넓어서 나중에 찾기힘들어진다.
		
		for (;true;) { // 괄호{}안의 문장을 3번 반복
			//조건식 생략가능하다. 생략하면 true로 간주되어서 무한반복문이 된다.
			System.out.println("i="+i);
		}
	}
}