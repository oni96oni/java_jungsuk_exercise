package ch09Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercise9_6 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
		"013-3456-7890"};

		Vector list = new Vector();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print(">>");
			String input = sc.nextLine().trim(); 

			if(input.equals("")) { //입력값이 공백이라면 다시 입력하게 위로 돌려보내.
				continue;
			} else if(input.equalsIgnoreCase("Q")) { //입력값이 q나 Q면 프로그램 종료.
				System.exit(0);
			}

			

			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
	}
}


/*
	Pattern
	정규 표현식이 컴파일된 클래스. 정규 표현식에 대상 문자열을 검증하거나, 활용하기 위해 사용되는 클래스이다. 
	
	static Pattern compile(String regex) : 주어진 정규식을 갖는 패턴을 생성
	
	String pattern() : 컴파일된 정규 표현식을 반환
	
	Matcher matcher(CharSequence input) : 패턴에 매칭할 문자열을 입력해 Matcher를 생성
	
	Matcher
	Pattern클래스를 받아 대상 문자열과 패턴이 일치하는 부분을 찾거나 전체 일치 여부 등을 판별하기 위해 사용된다. 
	
	boolean find() : 패턴이 일치하는 다음 문자열을 찾는다. 다음 문자열이 있다면 true

 */
