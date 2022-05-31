package handbook_Exercise11;

import java.util.ArrayList;
import java.util.Vector;

public class HandbookExercise2_4 {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		
		System.out.println(v);
		
		v.trimToSize(); // 빈 공간을 없앤다. (용량과 크기가 같아진다)
		
		v.ensureCapacity(6); // capacity가 6이되게한다.(용량)
		
		v.setSize(7); // size가 7이 되게 한다.(용량)
		
		v.clear(); // Vector에 저장된 요소를 모두 삭제
		
	}
}