package Exercise10;

import java.util.*;
import java.text.*;
class Exercise10_02 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�."; // 'E'�� ��~�� ���� �ϳ��� �ȴ�.
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		do {
			System.out.println("��¥��"+pattern+"�� ���·� �Է����ּ���.(�Է¿�:2017/05/11)");
			try {
				System.out.print(">>");
				inDate = df.parse(s.nextLine());
				break;
			} catch (Exception e) {
			}
		}while(true);
		System.out.println(df2.format(inDate));
		
	} // main
}