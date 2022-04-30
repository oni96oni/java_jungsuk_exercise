class Ex9_6 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ?  " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		String str3 = new String("abc"); //new연산자를 사용하면 메모리할당이 이루어지기 때문에 항상 새로운 String 인스턴스가 생성된다.
		String str4 = new String("abc");

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}