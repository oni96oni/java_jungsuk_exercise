class Ex4_10 {
	public static void main(String[] args) { 
		int sum = 0;	// 합계를 저장하기 위한 변수.

		for(int i=1; i <= 100; i++) {
			sum += i ;	// sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
	} // main의 끝
}

/*
 
정수서식
%d       : 정수를 그대로 출력합니다.
%6d    : 정수를 그대로 출력합니다. 자릿수가 6보다 작으면 출력이 왼쪽에 채워집니다.
%-6d  : 정수를 그대로 출력합니다.자릿수가 6보다 작으면 출력이 오른쪽에 채워집니다.
%06d: 정수를 그대로 출력합니다. 자릿수가 6보다 작으면 왼쪽에 0이 채워집니다.
%.2d : 정수의 최대 2 자리를 인쇄합니다.
*/