import java.util.*;

class Ex11_13 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);  // set.add(new Integer(num));
		}

		System.out.println(set);
		//11_10예제 참고, Treeset은 따로 정렬하는 과정을 거치지 않아도 저장하는 과정에서 정렬한다.
	}
}