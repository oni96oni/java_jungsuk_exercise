import java.io.*;

class Ex15_14 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos=null;

		try {
			fos = new FileOutputStream("test.txt", true);//뒤의 매개변수 true:이어쓰기, false:덮어쓰기
			ps = new PrintStream(fos);
			System.setOut(ps);    //  System.out의 출력대상을 test.txt파일로 변경
		} catch(FileNotFoundException e) {
			System.err.println("File not found.");
		}

		System.out.println("Hello by System.out");		
		System.err.println("Hello by System.err");
		System.out.println("System.out.println은 test.txt에 저장된다.");	
		System.err.println("System.err.println은 console에 출력된다.");
	}
}