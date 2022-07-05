import java.io.*;

class Ex15_6 {
	public static void main(String args[]) {
		try {
		     FileOutputStream fos = new FileOutputStream("123.txt");
		     // BufferedOutputStream의 버퍼 크기를 5로 한다.
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // 파일 123.txt에  1 부터 9까지 출력한다.
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }
//		     bos.close();  //bos.close()를 해주어야 버퍼에 남아있는 데이터가 출력된다. bos.close()해주면 fos.close()도 알아서 해준다.
		     fos.close();  // FileOutputStream을 닫는다
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}
}