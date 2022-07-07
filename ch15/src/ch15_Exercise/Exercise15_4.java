package ch15_Exercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise15_4 {

	static String[] argArr; // 입력한 매개변수를 담기위한 문자열 배열
	static File 	curDir; // 현재 디렉토리

	static {
		try {
			curDir = new File(System.getProperty("user.dir"));
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while(true) {
			try {

				String prompt = curDir.getCanonicalPath() + ">>";
				System.out.println(prompt);

				// 화면으로부터 라인단위로 입력받는다
				String input = s.nextLine();

				input = input.trim();
				argArr = input.split(" +");

				String command = argArr[0].trim();

				if("".equals(command)) continue;

				command = command.toLowerCase(); // 명령어를 소문자로 바꾼다.

				if(command.equals("q")) {
					System.exit(0);
				} else if (command.equals("cd")) {
					cd();
				} else {
					for(int i=0; i<argArr.length; i++) {
						System.out.println(argArr[i]);
					}
				} catch(Exception e) {
					e.printStackTrace();
					System.out.println("입력 오류입니다.");
				}
			}

			private static void cd() {
				if(angArr.length==1) {
					System.out.println(curDir);
					return;
				} else if (argArr.length > 2) {
					System.out.println("USAGE : cd directory");
					return;
				}
				
				String subDir = argArr[1];
			}
		}