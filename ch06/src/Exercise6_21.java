public class Exercise6_21 {
	
	static int abs(int value) {
		
	}
	
	public static void main(String[] args) {
		int value = 0;
		System.out.println(value + "의 절대값:" +abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" +abs(value));
	}

	

}

//내가했던것
//public static int abs(int value) {
//	value = Math.abs(value);
//	return value;
//}

//if문을 사용한 코드
//public static int abs(int value) {
//	if(value>=0) {
//		return value;
//	} else {
//		return -value;
//	}
//}