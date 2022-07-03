package ch14_HandbookExercise;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class HandbookExercise2_8 {

	public static void main(String[] args) {
		IntStream intStream = new Random().ints(1,46).distinct().limit(6);
		OptionalInt max = intStream.reduce(Integer::max);
		Optional<Integer> max2 = intStream.boxed().collect(reducing(Integer::max));
		long sum = intStream.reduce(0, (a,b) -> a + b);
		long sum2 = intStream.boxed().collect(reducing(0, (a,b)-> a + b));
	}
}