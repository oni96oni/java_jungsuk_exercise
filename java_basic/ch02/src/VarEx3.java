public class VarEx3 {

	public static void main(String[] args) {
//		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15); //10진법
		System.out.printf("%#x%n", 15); //16진법
		System.out.printf("%#o%n", 15); //8진법
		System.out.printf("%s", Integer.toBinaryString(15)); //2진수 변환
		
		double f = 123.456789876543210; //float는 정밀도가 7자리, 나머지값들은 의미없다.
		System.out.printf("%f%n", f); 
		System.out.printf("%e%n", f); 
		System.out.printf("%g%n", f); 
	}
 
}
