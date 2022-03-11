class Ex5_9 {
	public static void main(String[] args) {
		 int[][] score = {
							  { 100, 100, 100}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
							, { 50, 50, 50}
						};
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;

	    System.out.println("번호  국어	  영어  수학  총점  평균");
	    System.out.println("=============================");

		for(int i=0;i < score.length;i++) {
			int  sum = 0;      // 총점
			float avg = 0.0f;  // 평균

			korTotal  += score[i][0]; //0행의 점수들은 국어점수 - 각행들의 점수를 합침.
			engTotal  += score[i][1]; //1행의 점수들은 영어점수
			mathTotal += score[i][2]; //2행의 점수들은 수학점수
			System.out.printf("%3d", i+1); // 제일처음에 번호 출력

			for(int j=0;j < score[i].length;j++) {
				sum += score[i][j];  // 총점 더하기
				System.out.printf("%5d", score[i][j]); // 각 과목 점수출력
			}
			
			avg = sum/(float)score[i].length;  
			System.out.printf("%5d %5.1f%n", sum, avg); // 총점, 평균출력
		}

		System.out.println("=============================");
     	System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}