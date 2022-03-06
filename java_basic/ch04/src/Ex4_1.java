class Ex4_1 {
	public static void main(String args[]) {
		int score = 30;
		//아래 if문이 실행되는 이유는 ; 때문인데, ;를 써도 실행이 되는 이유는
		//if 블럭안에 한줄이면 블럭 안쓰고 쓸수 있어서 그렇다.
		if (score > 60); {
			System.out.println("합격입니다.");
		}
	}
}