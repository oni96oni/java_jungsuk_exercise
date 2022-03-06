package ch09Exercise;

public class Exercise9_5 {
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+"->"+delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+"->"+delChar("(1 2 3 4\t5)", "\t"));
	}

}
