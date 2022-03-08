class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%2==0)
				continue;
			System.out.println(i);
		}
	}
}
//2로 나머지값구하는 조건에 컨티뉴 값넣으면 홀수찾기된다.
//컨티뉴 끝으로간다는 얘기는 아래 작업을 건너띄고 증강식으로간다(for의 증강식)