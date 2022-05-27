package Exercise10;

import java.text.MessageFormat;

public class HandbookExercise2_3 {

	public static void main(String[] args) {
		//텍스트의 형식화 마치 스프링이 매개변수 알아서 끼워넣는것같은 느낌이다.
		String msg = "Name: {0} Tel: {1} Age: {2} Birthday: {3}";
		String[] input = {"김자바", "01-234-5678", "27", "08-04"};
		
		String result = MessageFormat.format(msg, input);
		
		System.out.println(result);
	}

}
