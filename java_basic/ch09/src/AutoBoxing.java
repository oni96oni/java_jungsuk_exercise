import java.util.ArrayList;

public class AutoBoxing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); //객체만 저장가능한 클래스인데 기본형저장가능
		//컴파일러가 바꿔주니까 (오토박싱,언박싱)
		list.add(100); // jdk1.5이전에는 에러 왜냐 list에는 객체만 추가가능했는데 이제 가능하게됬음 왜?
		//컴파일러가 자동으로 바꿔주니까 원래는 아래모습이었음 오토박싱때문에 위처럼 사용가능
		list.add(new Integer(100));
		
		Integer i = list.get(0); //list에 저장된 첫번째 객체를 꺼낸다.
		int k = list.get(0).intValue(); // intValue()로 Integer를 int로 반환
		int j = list.get(0); //intValue()로 Integer를 int로 변환
		
	}

}
