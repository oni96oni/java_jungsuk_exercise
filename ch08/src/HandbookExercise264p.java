import java.io.File;
import java.util.Scanner;

public class HandbookExercise264p {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f = createFile(sc.nextLine());
	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");
		} catch (Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 생성
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName); // File클래스의 객체를 만든다.
			createNewFile(f); // 생성된 객체를 이용해서 파일을 생성한다
			return f;
		}
	}

	static void createNewFile(File f) {
		try {
			f.createNewFile(); // 파일을 생성한다.
		} catch(Exception e) {
			
		}
	}

}
