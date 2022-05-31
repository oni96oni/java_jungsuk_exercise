package handbook_Exercise11;

import java.util.ArrayList;

public class HandbookExercise2_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		list.add(333);
		System.out.println(list);
		
		list.add(0, "000");
		System.out.println(list);
		
		System.out.println("index="+list.indexOf("333"));
		
		list.remove("333");
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println(list);
		System.out.println("index="+list.indexOf("333"));
		
		for(int i=0; i<list.size(); i++) {
			list.set(i, i+""); //지정된 위치에 객체를 저장하는 메서드
		}
		System.out.print("{");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+", ");
		}
		System.out.println("}");
		
		for(int i=0; i<list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list);
	}
}