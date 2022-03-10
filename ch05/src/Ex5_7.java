class Ex5_7 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
//RunConfiguration - Arguments - Program arguments에 입력, 띄워쓰기로 각 매개변수 구분, 숫자를 입력해도 문자열로 취급한다!