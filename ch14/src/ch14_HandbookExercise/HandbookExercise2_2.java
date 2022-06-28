package ch14_HandbookExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HandbookExercise2_2 {

	public static void main(String[] args) {
		//스트림은 데이터 소스로부터 데이터를 읽기만할 뿐 변경하지 않는다.
		List<Integer> list = Arrays.asList(3,1,5,4,2);
		List<Integer> sortedList = list.stream().sorted() // list를 정렬해서
												.collect(Collectors.toList()); // 새로운 List에 저장
		System.out.println(list); // [3, 1, 5, 4, 2]
		System.out.println(sortedList); // [1, 2, 3, 4, 5]
		
		//스트림은 Iterator처럼 일회용이다.(필요하면 다시 스트림을 생성해야함)
		Stream<String> strStream = Stream.of(new String[]{"a","b","c"}); // 배열
		strStream.forEach(System.out::println); // 모든 요소를 화면에 출력(최종연산)
//		long numOfStr = strStream.count(); // 에러. 스트림이 이미 닫혔음. stream has already been operated upon or closed
		
		//최종 연산 전까지 중간연산이 수행되지 않는다. - 지연된 연산
		IntStream intStream = new Random().ints(1,46); // 1~45범위의 무한 스트림
		intStream.distinct().limit(6).sorted() // 중간 연산
				 .forEach(i->System.out.print(i+",")); // 최종 연산
		System.out.println();
		
		//스트림은 작업을 내부 반복으로 처리한다.
		String[] strList = {"1","2","3"};
		for(String str : strList)
			System.out.println(str);
		
		IntStream stream = new Random().ints(6);
		stream.forEach(System.out::println);
		
		/* forEach의 내부구조
		void forEach(Consumer<? super T> action) {
			Objects.requireNonNull(action);  매개변수의 null 체크
			for(T t : src)  내부 반복(for문을 메서드 안으로 넣음)
			action.accept(T);
		}
		*/
		//스트림의 작업을 병렬로 처리 - 병렬 스트림
		Stream<String> strStream2 = Stream.of("dd","aaa","CC","cc","b");
		int sum = strStream2.parallel() // 병렬 스트림으로 전환(속성만 변경)
						   .mapToInt(s -> s.length()).sum(); // 모든 문자열의 길이의 합
	}
}