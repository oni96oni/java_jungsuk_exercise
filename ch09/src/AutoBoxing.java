import java.util.ArrayList;

public class AutoBoxing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); //ArrayList 배열 
		list.add(100); // jdk1.5이전에는 기본형과 참조형 간의 연산이 불가능했었다.
		list.add(new Integer(100)); //컴파일러가 추가해주는것을 작성해보았다.
		
		Integer i = list.get(0); //list
		int k = list.get(0).intValue(); // intValue()
		int j = list.get(0); //intValue()
		
	}

}
