package ch4_Exercise;
public class Exercise4_10 {

	public static void main(String[] args) {
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = 
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
		// 화면으로 부터 사용자 입력을 받기 위한 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);

		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
			
			
			
		} while(true);
	}
}
