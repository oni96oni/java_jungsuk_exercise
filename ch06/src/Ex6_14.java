class Ex6_14 {
	static {
		System.out.println("static { }"); //메모리에 로딩될 때, 클래스 초기화 블럭이 가장 먼저 수행, 메인메서드보다 먼저 실행
	}

	{
		System.out.println("{ }"); // 인스턴스를 생성 한 뒤에 실행
	}

	public Ex6_14() {
		System.out.println("생성자"); //인스턴스 초기화블럭이 실행된 뒤에 생성자 수행
	}

	public static void main(String args[]) {
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex6_14 bt = new Ex6_14();

		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14();
	}
	//클래스 초기화블럭은 처음 메모리에 로딩될 때 한번만 수행!
}