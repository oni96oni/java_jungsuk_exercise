import java.util.*;

public class Ex11_3 {
	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
//			System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		Scanner sc = new Scanner(System.in);
		
		Stack st = new Stack();
//		String expression = args[0];
		String expression = sc.nextLine();
		
		System.out.println("expression:" + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);

				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}

			if (st.isEmpty()) { // stack이 비어있냐? 
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다. ( 가 더 많은 경우");
			}
		} catch (EmptyStackException e) { // )가 더 많은경우 발생하는 에러! 아무것도 없는 stack에서 꺼내려고하면 발생.
			System.out.println("괄호가 일치하지 않습니다. )가 더 많은 경우");
		} // try
	}
}