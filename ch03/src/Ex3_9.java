class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만 
		int b = 2_000_000;    // 2,000,000   2백만 

		long c = (long)a * b;       // a * b = 2,000,000,000,000 ?
		//한쪽이라도 (long)수동형변환을 해주어야한다.

		System.out.println(c);
	}
}