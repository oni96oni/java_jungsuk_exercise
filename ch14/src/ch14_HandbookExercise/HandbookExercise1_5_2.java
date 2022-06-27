package ch14_HandbookExercise;

import java.util.function.Function;

public class HandbookExercise1_5_2 {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s,16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		Function<Integer, Integer> h = f.compose(g); // g+f->h
		
		System.out.println(h.apply(2)); // 2 -> "10" -> 16
	}

}
