package ch14_HandbookExercise;

import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HandbookExercise2_6 {

	public static void main(String[] args) {
		IntStream.range(1, 10).sequential().forEach(System.out::print); // 123456789
		System.out.println();
		
		IntStream.range(1, 10).sequential().forEachOrdered(System.out::print); // 123456789
		System.out.println();
		
		IntStream.range(1, 10).parallel().forEach(System.out::print); // 683295714
		System.out.println();
		
		IntStream.range(1, 10).parallel().forEachOrdered(System.out::print); // 123456789
		System.out.println();
	}
}