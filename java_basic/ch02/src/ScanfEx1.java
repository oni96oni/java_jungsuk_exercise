//1.import�� �߰�
import java.util.Scanner; //*�� Ư����Ű�����ִ� ���Ŭ������ ��밡��! 

public class ScanfEx1 {

	public static void main(String[] args) {
		
		//2.ScannerŬ������ ��ü ����
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		
		
		int num = Integer.parseInt(input);
		System.out.println(num);
	}

}
