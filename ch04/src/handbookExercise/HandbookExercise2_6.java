package handbookExercise;

public class HandbookExercise2_6 {

	public static void main(String[] args) throws java.io.IOException{
		int input = 0;
		
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		
		do {
			input = System.in.read();
			System.out.print((char)input);
		} while(input != -1 && input != 'x');
		// -1이 조건식으로 있는 이유 : 스트림의 끝에 도달하면 -1을 반환하므로 종료시킨다. 
	}

}
