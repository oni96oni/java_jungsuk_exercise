package ch12_Exercise;

import java.util.ArrayList;

class Product{}

public class Exercise12_4 {

	public static ArrayList<? extends Product> merge(ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
		ArrayList<? extends Product> newList = new ArrayList<>(list);
		newList.addAll(list2);
		return newList;
	}
	//위의 메서드를 지네릭 메서드로 변경해보자.
	
	
}