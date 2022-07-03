package ch14_HandbookExercise;

import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HandbookExercise2_4 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 10); // 12345678910
		intStream.skip(3).limit(5).forEach(System.out::print); // skip(앞에서 부터 n개 건너뛰기) + limit(매개변수 이후는 짤라냄 ) : 45678
		System.out.println();
		
		IntStream intStream2 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
		intStream2.distinct().forEach(System.out::print); // distinct(중복제거) : 123456
		System.out.println();
		
		IntStream intStream3 = IntStream.rangeClosed(1, 10); // 12345678910
		intStream3.filter(i->i%2==0).forEach(System.out::print); // 246810
		System.out.println();
		
		IntStream intStream4 = IntStream.rangeClosed(1, 10);
		intStream4.filter(i->i%2!=0 && i%3!=0).forEach(System.out::print);// 157
		System.out.println();
		
		IntStream intStream5 = IntStream.rangeClosed(1, 10);
		intStream5.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);// 157
		System.out.println();
		
		Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1")
				,new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // 스트림의 모든 파일의 이름을 출력
		
		Stream<File> fileStream2 = Stream.of(new File("Ex1.java"), new File("Ex1")
				,new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		fileStream2.map(File::getName) // Stream<File> -> Stream<String>
			.filter(s->s.indexOf('.')!=-1) // .이 있는 파일들만!(확장자가 없는 것은 제외)
			.map(s->s.substring(s.indexOf('.')+1)) // Stream<String>->Stream<String>
			.map(String::toUpperCase) // Stream<String>->Stream<String>
			.distinct() // 중복 제거
			.forEach(System.out::print); // JAVABAKTXT
		System.out.println();
		
		IntStream intStream6 = new Random().ints(1,46); // 1~45 사이의 정수
		Stream<Integer> integerStream = intStream6.boxed(); // IntStream -> Stream<Integer> (기본스트림을 스트림으로 변환)
		
		IntStream intStream7 = new Random().ints(1,46); // 1~45 사이의 정수
		Stream<String> lottoStream = intStream7.distinct().limit(6).sorted()
				.mapToObj(i -> i+","); // IntStream -> Stream<String>
		lottoStream.forEach(System.out::print);
		System.out.println();
		
		Stream<String[]> strArrStrm = Stream.of(new String[]{"abc", "def", "ghi" },
				new String[]{"ABC", "GHI", "JKLMN"});
		Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);
		
		Stream<String[]> strArrStrm2 = Stream.of(new String[]{"abc", "def", "ghi" },
				new String[]{"ABC", "GHI", "JKLMN"});
		Stream<String> strStrStrm2 = strArrStrm2.flatMap(Arrays::stream); // Arrays.stream(T[])
		
		Stream<File> fileStream3 = Stream.of(new File("Ex1.java"), new File("Ex1")
				,new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		fileStream3.map(File::getName) // Stream<File> -> Stream<String>
		.filter(s -> s.indexOf('.')!=-1) // 확장자가 있는 파일만! 없으면 제거
		.peek(s->System.out.printf("filename=%s%n", s)) // 파일명을 출력
		.map(s -> s.substring(s.indexOf('.')+1)) // 확장자명만 남기기
		.peek(s->System.out.printf("extension=%s%n", s)) // 확장자명을 출력
		.forEach(System.out::println); // 최종연산 스트림을 소비
		
		
	}
}