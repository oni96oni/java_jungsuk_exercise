package ch09Exercise;

import java.util.*;
import java.util.regex.*;

class Exercise9_6 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"};
		
		Vector list = new Vector(); // �˻������ ���� Vector
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim(); // trim()���� �Է³��뿡�� ������ ����
			
			if(input.equals("")) {
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}

			String pattern = ".*"+input+".*"; // input�� �����ϴ� ��� ���ڿ�
			Pattern p = Pattern.compile(pattern);
			for(int i=0; i< phoneNumArr.length;i++) {
				String phoneNum = phoneNumArr[i];
				String tmp = phoneNum.replace("-",""); // phoneNum���� '-'�� ����
				Matcher m = p.matcher(tmp);
				if(m.find()) { // ���ϰ� ��ġ�ϸ�, list�� phoneNum�� �߰��Ѵ�.
					list.add(phoneNum);
				}
			}
			
			if(list.size()>0) { // �˻������ ������
				System.out.println(list); // �˻������ ����ϰ�
				list.clear(); // �˻������ ����
			} else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}
		}
	} // main
}