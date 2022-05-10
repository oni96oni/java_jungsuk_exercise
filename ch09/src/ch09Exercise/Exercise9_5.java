package ch09Exercise;

public class Exercise9_5 {
//	StringBuffer와 indexOf(int ch), CharAt(int i)사용하기!

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+"->"+delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+"->"+delChar("(1 2 3 4 \t5)", "\t"));
	}

}
