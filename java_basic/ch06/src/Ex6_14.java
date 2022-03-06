class Ex6_14 {
	static {
		System.out.println("static { }"); //얘는 한번만 실행되고 (클래스 초기화 블럭)
	}

	{
		System.out.println("{ }"); // 얘는 인스턴스가 생성될 때마다 수행 (인스턴스 초기화 블럭)
	}

	public Ex6_14() {
		System.out.println("생성자");
	}

	public static void main(String args[]) {
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex6_14 bt = new Ex6_14();

		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14();
	}
}