package ch14_HandbookExercise;

import java.util.function.Function;

public class HandbookExercise1_5_1 {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		Function<String, String> h = f.andThen(g);
		
		System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
	}

}
