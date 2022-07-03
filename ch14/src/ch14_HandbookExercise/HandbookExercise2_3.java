package ch14_HandbookExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class HandbookExercise2_3 {

	public static void main(String[] args) {
		//컬렉션으로부터 스트림 생성하기
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();// Stream<T> Collection.stream()
		
		//배열로부터 스트림 생성하기
		Stream<String> strStream1 = Stream.of("a","b","c"); // 가변 인자
		Stream<String> strStream2 = Stream.of(new String[]{"a","b","c"});
		Stream<String> strStream3 = Arrays.stream(new String[]{"a","b","c"});
		Stream<String> strStream4 = Arrays.stream(new String[]{"a","b","c"}, 0, 3);
		
		//특정 범위의 정수를 요소로 갖는 스트림 생성하기
		IntStream intStream1 = IntStream.range(1,5); // 1 2 3 4
		IntStream intStream2 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5
		
		
		//난수를 요소로 갖는 스트림 생성하기
		IntStream intStream3 = new Random().ints(); // 무한 스트림
		intStream3.limit(5).forEach(System.out::println); // 5개의 요소만 출력
		IntStream intStream4 = new Random().ints(5); // 크기가 5인 난수 스트림을 반환
		intStream4.limit(5).forEach(System.out::println);
		LongStream longStream = new Random().longs();
		longStream.limit(5).forEach(System.out::println);
		DoubleStream doubleStream = new Random().doubles();
		doubleStream.limit(5).forEach(System.out::println);
		
		/*람다식을 소스로 하는 스트림 생성하기
		static <T> Stream<T> iterate(T seed, UnaryOperator<T> f) // 이전 요소에 종속적
		static <T> Stream<T> generate(Supplier<T> s) // 이전 요소에 독립적
		*/
		Stream<Integer> evenStream = Stream.iterate(0, n->n+2); // 0,2,4,6, ...
		Stream<Double> randomStream = Stream.generate(Math::random);
		Stream<Integer> oneStream = Stream.generate(()->1);
		
		/*파일을 소스로 하는 스트림 생성하기
		Stream<Path> Files.list(Path dir) // Path는 파일 또는 디렉토리
		Stream<String> Files.lines(Path path)
		Stream<String> Files.lines(Path path, Charset cs)
		Stream<String> lines() // BufferedReader클래스의 메서드
		*/
		
	}
}