class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		for (int i = 1; i <= 20; i++) {
			num = (int)(Math.random() * 11) -5;
			System.out.println(num);
		}
	}
}