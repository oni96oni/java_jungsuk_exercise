
public class PrintfEx1 {

	public static void main(String[] args) {
		System.out.printf("[%5d]%n",10); // 5자리 앞에는 공백.
		System.out.printf("[%-5d]%n",10); //5자리 뒤에는 공백.
		System.out.printf("[%05d]%n",10); //앞에 공백은 0으로 채운다.
		System.out.printf("[%05d]%n",1234567); //5자리여도 정수부분은 다 보여준다.
		
		double d = 1.23456789;
		System.out.printf("%14.6f%n",d); // 총14자리 뒤에 소수는 6자리까지 앞에 빈칸은 공백
		System.out.printf("%s%n","www.maru.com");
		System.out.printf("%20s%n","www.maru.com");
		System.out.printf("%20s%n","www.maru.com");
		System.out.printf("%20s%n","www.maru.com");
		
	}

}
