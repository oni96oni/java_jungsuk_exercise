public class Exercise6_18 {

	
	
	public static void main(String[] args) {
		String str = "1234";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));

		str = "1234a";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}
}